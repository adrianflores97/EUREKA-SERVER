package com.mx.MicroservicioTienda.Model;


import lombok.Data;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data

public class Productos {
	
	private Long idProducto;
	private String nombre;
	private float precio;
	private Long idTienda;

}
