package com.mx.MicroservicioEmpleados.Controller;

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

import com.mx.MicroservicioEmpleados.Entity.Empleados;
import com.mx.MicroservicioEmpleados.Service.EmpleadosImp;

@RestController
@RequestMapping(path="/EmpleadosWebService")
@CrossOrigin
public class EmpleadosWebService {
	
	@Autowired
	EmpleadosImp empleadosImp;
	
	//listar
	//http://localhost:8032/EmpleadosWebService
	@GetMapping
	public List<Empleados> listarEmpleado(){
		return empleadosImp.listar();
	}
	
	//guardar
	//http://localhost:8032/EmpleadosWebService
	@PostMapping
	public ResponseEntity<Empleados> guardarEmpleado(@RequestBody Empleados empleado){
		return new ResponseEntity<>(empleadosImp.guardar(empleado),HttpStatus.CREATED); 
	}
	
	//buscar
	//http://localhost:8032/EmpleadosWebService/{idEmpleado}
	//http://localhost:8032/EmpleadosWebService/1
	@GetMapping(path="/{idEmpleado}")
	public Empleados buscar(@PathVariable("idEmpleado") Long idEmpleado) {
		return empleadosImp.buscar(idEmpleado);
	}
	
	//lista Empleado por tienda
	//http://localhost:8032/EmpleadosWebService/tienda/{idTienda}
	//http://localhost:8032/EmpleadosWebService/tienda/1
	@GetMapping(path = "/tienda/{idTienda}")
	public List<Empleados> listaEmpledoTienda(@PathVariable("idTienda") Long idTienda){
		return empleadosImp.ListaEmpleTienda(idTienda);
	}
	
}
