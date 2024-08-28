package com.mx.MicroservicioTienda.Service;

import java.util.List;

import com.mx.MicroservicioTienda.Entity.Tiendas;

public interface TiendaServ {
	
	public List<Tiendas> listar();
	public Tiendas guardar(Tiendas tienda);
	public Tiendas buscar(Long idTienda);

}
