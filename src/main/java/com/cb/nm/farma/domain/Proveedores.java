package com.cb.nm.farma.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Proveedores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProveedor;
	@Column(unique = true)
    private String nombreProveedor;
    private String telefono;
    private String direccion;

    @OneToMany(mappedBy = "proveedor")
    private List<Productos> productos;

}
