package com.cb.nm.farma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.nm.farma.domain.Productos;
import com.cb.nm.farma.services.ProductosService;




@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {
	@Autowired
	private ProductosService proService;
	
	@GetMapping
	public List<Productos> listarProductos(){
		return proService.listarTodos();
	}
	
	@GetMapping("/{idProducto}")
	public Productos listarPorId(@PathVariable Long idProducto) {
		return proService.buscarPorId(idProducto);
	}
	
	@PostMapping
	public Productos crearInvestigador(@RequestBody Productos producto) {
		return proService.grabar(producto);
	}
	
	@PutMapping ("/{idProducto}")
	public Productos editarInvestigador(@PathVariable Long idProducto, @RequestBody Productos pro) {
		Productos proBD = proService.buscarPorId(idProducto);

		proBD.setNombreProducto(pro.getNombreProducto());
		proBD.setPrecio(pro.getPrecio());
		proBD.setStock(pro.getStock());
		proBD.setProveedor(pro.getProveedor());
		
		return proService.grabar(proBD);		
		
	}
	
	@DeleteMapping("/{idProducto}")
	public void eliminarProductos(@PathVariable Long idProducto) {
	proService.eliminar(idProducto);
	}
	
	@PatchMapping("/{idProducto}")
    public Productos actualizarProducto(@PathVariable Long idProducto, @RequestBody Productos pro) {
        Productos proBD = proService.buscarPorId(idProducto);

        if (pro.getNombreProducto() != null) {
            proBD.setNombreProducto(pro.getNombreProducto());
        }
        /*
         * 
         
        if (pro.getPrecio() != null) {
            proBD.setPrecio(pro.getPrecio());
        }
        if (pro.getStock() != null) {
            proBD.setStock(pro.getStock());
        }
        if (pro.getProveedor() != null) {
            proBD.setProveedor(pro.getProveedor());
        }*/
        
        return proService.grabar(proBD);
    }
	

}
