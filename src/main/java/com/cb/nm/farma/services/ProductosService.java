package com.cb.nm.farma.services;

import java.util.List;

import com.cb.nm.farma.domain.Productos;



public interface ProductosService {
	List<Productos> listarTodos();
	Productos buscarPorId(Long idProducto);
	Productos grabar(Productos producto);
	Productos actualizar(Productos producto, Long idProducto);
	void eliminar(Long idProducto);
	Productos findByNombreProducto(String nombreProducto);
	
}
