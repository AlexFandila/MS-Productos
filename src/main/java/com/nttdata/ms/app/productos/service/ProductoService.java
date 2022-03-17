package com.nttdata.ms.app.productos.service;

import java.util.List;

import com.nttdata.ms.app.productos.repo.entity.Producto;

public interface ProductoService {
	List<Producto> findAll();
	Producto findById(Long id);

}
