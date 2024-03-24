package com.cb.nm.farma.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cb.nm.farma.domain.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
	Optional<Productos> findBynombreProducto(String nombreProducto);
	
}
