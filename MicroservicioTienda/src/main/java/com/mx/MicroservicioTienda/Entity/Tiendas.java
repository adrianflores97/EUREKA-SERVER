package com.mx.MicroservicioTienda.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TIENDA_21")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Tiendas {

	@Id
	@Column(name="ID_TIENDA")
	private Long idTienda;
	
	@Column(name="NOMBRE_TIENDA")
	private String nombreTienda;
	
	@Column(name="UBICACION")
	private String ubicacionTienda;

	public Long getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(Long idTienda) {
		this.idTienda = idTienda;
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public String getUbicacionTienda() {
		return ubicacionTienda;
	}

	public void setUbicacionTienda(String ubicacionTienda) {
		this.ubicacionTienda = ubicacionTienda;
	}
	
	
}
