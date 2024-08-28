package com.mx.MicroservicioTienda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.MicroservicioTienda.Entity.Tiendas;

public interface TiendasDao extends JpaRepository<Tiendas, Long> {

}
