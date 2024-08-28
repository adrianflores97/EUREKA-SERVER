package com.mx.MicroservicioProductos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PRODUCTOS_21")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Productos {
	
	@Id
	@Column(name="ID_PRODUCTO")
	private Long idProducto;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="PRECIO")
	private float precio;
	
	@Column(name="TIENDA_ID")
	private Long idTienda;
	

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Long getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(Long idTienda) {
		this.idTienda = idTienda;
	}
	

}
