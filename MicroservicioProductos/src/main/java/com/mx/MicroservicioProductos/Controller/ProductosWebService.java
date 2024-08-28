package com.mx.MicroservicioProductos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MicroservicioProductos.Entity.Productos;
import com.mx.MicroservicioProductos.Service.ProductosImp;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(path = "/ProductosWebService")
@CrossOrigin
public class ProductosWebService {

	@Autowired
	ProductosImp productosImp;

	// listar
	// http://localhost:8031/ProductosWebService
	@GetMapping
	public List<Productos> listar() {
		return productosImp.listar();
	}

	// guardar
	// http://localhost:8031/ProductosWebService
	@PostMapping
	public ResponseEntity<Productos> guardarProducto(@RequestBody Productos producto) {
		return new ResponseEntity<>(productosImp.guardar(producto), HttpStatus.CREATED);
	}

	// buscar
	// http://localhost:8031/ProductosWebService/{idProducto}
	// http://localhost:8031/ProductosWebService/1
	@GetMapping(path = "/{idProducto}")
	public Productos buscarxIdProducto(@PathVariable("idProducto") Long idProducto) {
		return productosImp.buscar(idProducto);
	}

	// listar productos por tienda ID
	// http://localhost:8031/ProductosWebService/tienda/{idProducto}
	// http://localhost:8031/ProductosWebService/tienda/1
	@GetMapping(path = "/tienda/{idTienda}")
	public List<Productos> listarPorductoxTienda(@PathVariable("idTienda") Long idTienda) {
		return productosImp.listarProductosTiendaId(idTienda);
	}
	
	//editar 
	// http://localhost:8031/ProductosWebService/{idProducto}
	// http://localhost:8031/ProductosWebService/1
	@PutMapping(path = "/{idProducto}")
	public Productos updateProduct(@PathVariable("idProducto")Long id,@RequestBody Productos producto) {
		producto.setIdProducto(id);
		return productosImp.guardar(producto);
	}
	
	//eliminar
	// http://localhost:8031/ProductosWebService/{idProducto}
	// http://localhost:8031/ProductosWebService/1
	@DeleteMapping(path = "/{idProducto}")
	public void deleteProduct(@PathVariable("idProducto") Long id) {
		productosImp.deleteProducto(id);
	}
}
