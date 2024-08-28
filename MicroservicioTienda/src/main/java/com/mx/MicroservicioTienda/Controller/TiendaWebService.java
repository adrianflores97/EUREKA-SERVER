package com.mx.MicroservicioTienda.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MicroservicioTienda.Entity.Tiendas;
import com.mx.MicroservicioTienda.Model.Empleados;
import com.mx.MicroservicioTienda.Model.Productos;
import com.mx.MicroservicioTienda.Service.TiendasImp;


@RestController
@RequestMapping(path ="/TiendaWebService")
@CrossOrigin
public class TiendaWebService {
	
	@Autowired
	TiendasImp tiendasImp;
	
	//PETICIONES  DEL MICROSERVICIO GENERAL DE TIENDA
	
	//LISTAR
	//http://localhost:8030/TiendaWebService
	@GetMapping
	public List<Tiendas> listar(){
		return tiendasImp.listar();
	}

	//GUARDAR
	//http://localhost:8030/TiendaWebService
	@PostMapping
	public ResponseEntity<Tiendas> guardar(@RequestBody Tiendas tienda){
		return new ResponseEntity<>(tiendasImp.guardar(tienda),HttpStatus.CREATED);
	}
	//BUSCAR
	//http://localhost:8030/TiendaWebService/{idTienda}
	//http://localhost:8030/TiendaWebService/1
	@GetMapping("/{idTienda}")
	public Tiendas buscar(@PathVariable("idTienda") Long idTienda) {
		return tiendasImp.buscar(idTienda);
	}
	
	//PETICION MICROSERVICIO DE PRODUCTOS----------------------------
	//LISTAR PRODUCTOS
	//http://localhost:8030/TiendaWebService/Productos/{idTienda}
	//http://localhost:8030/TiendaWebService/Productos/1
	@GetMapping(path ="/Productos/{idTienda}")
	public List<Productos> listarProdutosidTienda(@PathVariable("idTienda") Long idTienda){
		return tiendasImp.lisproductIdTienda(idTienda);
	}
	
	//PETICION MICROSERVICIO DE EMPLEADOS----------------------------
		//LISTAR EMPLEADOS
		//http://localhost:8030/TiendaWebService/Empleados/{idEmpleado}
		//http://localhost:8030/TiendaWebService/Empleados/1
		@GetMapping(path = "/Empleados/{idTienda}")
		public List<Empleados> listarEmpleadosidTienda(@PathVariable("idTienda") Long idTienda){
			return tiendasImp.lisEmpleaIdTienda(idTienda);
		}
	
	
}
