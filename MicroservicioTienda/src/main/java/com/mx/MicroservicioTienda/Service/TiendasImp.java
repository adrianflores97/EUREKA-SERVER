package com.mx.MicroservicioTienda.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mx.MicroservicioTienda.Entity.Tiendas;
import com.mx.MicroservicioTienda.Model.Empleados;
import com.mx.MicroservicioTienda.Model.Productos;
import com.mx.MicroservicioTienda.Repository.TiendasDao;
import com.mx.MicroservicioTienda.feignClients.IEmpleadosFeingClient;
import com.mx.MicroservicioTienda.feignClients.IProductosFeingClient;

import jakarta.transaction.Transactional;

@Service
@SuppressWarnings("unchecked")
public class TiendasImp implements TiendaServ {
	
	@Autowired
	TiendasDao tiendasDao;
	
    @Transactional
	@Override
	public List<Tiendas> listar() {
		// TODO Auto-generated method stub
		return tiendasDao.findAll();
	}

    @Transactional
	@Override
	public Tiendas guardar(Tiendas tienda) {
		// TODO Auto-generated method stub
		return tiendasDao.save(tienda);
	}

    @Transactional
	@Override
	public Tiendas buscar(Long idTienda) {
		// TODO Auto-generated method stub
		return tiendasDao.findById(idTienda).orElse(null);
	}
	
	//Inyeccion de dependecias para empezar a consumir los servicios de MicroservicioProductos y MicroservicioEmpleados
    
    @Autowired
    RestTemplate restTemplate;
    
    @Autowired
    IProductosFeingClient iProductosFeingClient;
    
    @Autowired
    IEmpleadosFeingClient iEmpleadosFeingClient;
    
    //METODOS DEL MicroservicioProductos
    public List<Productos> lisproductIdTienda(Long idTienda){
    	List<Productos> listaNueva=restTemplate.getForObject("http://localhost:8031/ProductosWebService/tienda/"+idTienda, List.class);
    	return listaNueva;
    }
    
    //METODOS DEL MicroservicioEmpleados
    public List<Empleados> lisEmpleaIdTienda(Long idTienda){
    List<Empleados> listaNuevaEmp=restTemplate.getForObject("http://localhost:8032/EmpleadosWebService/tienda/"+idTienda,List.class);
    return listaNuevaEmp;
    }
}
