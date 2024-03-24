package com.cb.nm.farma.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class DetallesVenta {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idDetalle;

	    @ManyToOne
	    @JoinColumn(name = "idVenta")
	    private Ventas venta;

	    @ManyToOne
	    @JoinColumn(name = "idProducto")
	    private Productos producto;

	    private int cantidad;
	    private double precioUnitario;
}
