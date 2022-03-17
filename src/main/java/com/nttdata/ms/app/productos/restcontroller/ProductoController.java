package com.nttdata.ms.app.productos.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.ms.app.productos.repo.entity.Producto;
import com.nttdata.ms.app.productos.service.ProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar() {
		return productoService.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Producto getById(@PathVariable Long id) {
		return productoService.findById(id);
	}

}
