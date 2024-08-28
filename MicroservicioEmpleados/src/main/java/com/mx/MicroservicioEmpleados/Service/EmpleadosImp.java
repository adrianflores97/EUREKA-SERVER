package com.mx.MicroservicioEmpleados.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.MicroservicioEmpleados.Entity.Empleados;
import com.mx.MicroservicioEmpleados.Repository.EmpleadosDao;

import jakarta.transaction.Transactional;

@Service
public class EmpleadosImp implements EmpleadosServ {
	
	@Autowired
	EmpleadosDao empleadosDao;

	@Transactional
	@Override
	public List<Empleados> listar() {
		// TODO Auto-generated method stub
		return empleadosDao.findAll();
	}

	@Transactional
	@Override
	public Empleados guardar(Empleados empleado) {
		// TODO Auto-generated method stub
		return empleadosDao.save(empleado);
	}

	@Transactional
	@Override
	public Empleados buscar(Long idEmpleado) {
		// TODO Auto-generated method stub
		return empleadosDao.findById(idEmpleado).orElse(null);
	}
	
	
	@Transactional
	@Override
	public List<Empleados> ListaEmpleTienda(Long idTienda) {
		// TODO Auto-generated method stub
		return empleadosDao.findByIdTienda(idTienda);
	}

}
