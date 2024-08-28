package com.mx.MicroservicioEmpleados.Service;

import java.util.List;

import com.mx.MicroservicioEmpleados.Entity.Empleados;

public interface EmpleadosServ {
	
	public List<Empleados> listar();
	public Empleados guardar(Empleados empleado);
	public Empleados buscar(Long idEmpleado);
	
	//listar empleados por tienda
	public List<Empleados> ListaEmpleTienda(Long idTienda);

}
