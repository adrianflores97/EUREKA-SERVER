package com.mx.MicroservicioProductos.Service;

import java.util.List;

import com.mx.MicroservicioProductos.Entity.Productos;

public interface ProductosServ {
	
	public List<Productos> listar();
	public Productos guardar(Productos producto);
	public Productos buscar(Long idProducto);
	
	//Buscar los productos por tienda
	public List<Productos> listarProductosTiendaId(Long idTienda);

}
