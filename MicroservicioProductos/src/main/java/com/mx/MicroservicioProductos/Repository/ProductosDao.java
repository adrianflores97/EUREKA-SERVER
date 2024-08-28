package com.mx.MicroservicioProductos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.MicroservicioProductos.Entity.Productos;

public interface ProductosDao extends JpaRepository<Productos, Long>{
	
	//Para saber cuantos productos tengo por tienda
	public List<Productos> findByidTienda(Long idTienda);

}
