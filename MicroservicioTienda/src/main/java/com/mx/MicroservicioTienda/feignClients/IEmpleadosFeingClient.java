package com.mx.MicroservicioTienda.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mx.MicroservicioTienda.Model.Empleados;

@FeignClient(name="MicroservicioEmpleados",url = "http://localhost:8032",path = "EmpleadosWebService")
public interface IEmpleadosFeingClient {
	
	@PostMapping
	public Empleados guardar(@RequestBody Empleados empleado);
	
	@GetMapping(path = "/tienda/{idTienda}")
	public List<Empleados> listEmpleados(@PathVariable("idTienda") Long idTienda);

}
