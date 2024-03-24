package com.cb.nm.farma.domain;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Clientes {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nombreCliente;
    
    private String dni;
    private String telefono;
    private String direccion;

    @OneToMany(mappedBy = "cliente")
    private List<Ventas> ventas;

}
