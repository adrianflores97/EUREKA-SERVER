package com.mx.MicroservicioProductos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.MicroservicioProductos.Entity.Productos;
import com.mx.MicroservicioProductos.Repository.ProductosDao;

import jakarta.transaction.Transactional;

@Service
public class ProductosImp implements ProductosServ{
	
	@Autowired
	ProductosDao productosDao;

	@Transactional
	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return productosDao.findAll();
	}

	@Transactional
	@Override
	public Productos guardar(Productos producto) {
		// TODO Auto-generated method stub
		Productos product= productosDao.save(producto);
		return product;
	}

	@Transactional
	@Override
	public Productos buscar(Long idProducto) {
		// TODO Auto-generated method stub
		return productosDao.findById(idProducto).orElse(null);
	}

	@Transactional
	@Override
	public List<Productos> listarProductosTiendaId(Long idTienda) {
		// TODO Auto-generated method stub
		return productosDao.findByidTienda(idTienda);
	}
	
	//Metodos adicionales
	public void deleteProducto(Long id) {
		productosDao.deleteById(id);
	}

}
