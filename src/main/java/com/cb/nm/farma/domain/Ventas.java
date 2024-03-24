package com.cb.nm.farma.domain;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Ventas {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;

    private Date fecha;
    private double total;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Clientes cliente;

    @OneToMany(mappedBy = "venta")
    private List<DetallesVenta> detallesVenta;

}
