package com.nttdata.ms.app.productos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.ms.app.productos.repo.entity.Producto;

public interface ProductosDaoJPA extends JpaRepository<Producto, Long>{

}
