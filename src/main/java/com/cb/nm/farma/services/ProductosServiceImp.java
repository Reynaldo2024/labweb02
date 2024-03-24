package com.cb.nm.farma.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cb.nm.farma.domain.Productos;
import com.cb.nm.farma.repositories.ProductosRepository;
@Service
public class ProductosServiceImp implements ProductosService {
	@Autowired
	private ProductosRepository proRep;

	@Override
	@Transactional
	public List<Productos> listarTodos() {
		return proRep.findAll();
		
	}

	@Override
	@Transactional
	public Productos buscarPorId(Long idProducto) {
		Optional<Productos> producto = proRep.findById(idProducto);
		return producto.get();
		
	}

	@Override
	@Transactional
	public Productos grabar(Productos producto) {
		return proRep.save(producto);
		
	}

	@Override
	@Transactional
	public Productos actualizar(Productos producto, Long idProducto) {
		producto.setIdProducto(idProducto);
		return proRep.save(producto);
		
		
	}

	@Override
	@Transactional
	public void eliminar(Long idProducto) {
		proRep.deleteById(idProducto);
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public Productos findByNombreProducto(String nombreProducto) {
		return proRep.findBynombreProducto(nombreProducto).get();
		
	}

}
