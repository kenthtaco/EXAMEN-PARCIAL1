package com.productos.productos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KenthProductosRepository extends JpaRepository<KenthProductos, Long> {
    void deleteByNombre(String nombre);
}
