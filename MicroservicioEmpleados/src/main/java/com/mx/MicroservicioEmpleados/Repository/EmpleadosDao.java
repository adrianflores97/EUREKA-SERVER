package com.mx.MicroservicioEmpleados.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.MicroservicioEmpleados.Entity.Empleados;

public interface EmpleadosDao extends JpaRepository<Empleados, Long>{
	
	//Listar los empleados por tienda
	public List<Empleados> findByIdTienda(Long idTienda);

}
