package com.mx.MicroservicioTienda.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mx.MicroservicioTienda.Model.Productos;

@FeignClient(name="MicroservicioProductos",url = "http://localhost:8031",path = "/ProductosWebService")
public interface IProductosFeingClient {
	@PostMapping
	public Productos guardar(@RequestBody Productos producto);
	
	@GetMapping(path="/tienda/{idTienda}")
	public List<Productos> listProductos(@PathVariable("idTienda") Long idTienda);

}
