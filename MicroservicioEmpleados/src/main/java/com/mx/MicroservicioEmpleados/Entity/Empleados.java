package com.mx.MicroservicioEmpleados.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="EMPLEADOS_21")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Empleados {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //genera el ID autoincrementable
	private Long idEmpleado;
	private String nombre;
	private String app;
	private Long idTienda;
	public Long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public Long getIdTienda() {
		return idTienda;
	}
	public void setIdTienda(Long idTienda) {
		this.idTienda = idTienda;
	}

	
}
