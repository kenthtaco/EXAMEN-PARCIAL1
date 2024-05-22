package com.productos.productos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KenthProductosService {

    @Autowired
    private KenthProductosRepository productoRepository;

    public List<KenthProductos> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public KenthProductos insertarProducto(KenthProductos producto) {
        return productoRepository.save(producto);
    }

    public void borrarProductoPorNombre(String nombre) {
        productoRepository.deleteByNombre(nombre);
    }

    public void borrarProductoPorId(Long id) {
        productoRepository.deleteById(id);
    }

    public KenthProductos obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public KenthProductos actualizarProducto(Long id, KenthProductos producto) {
        if (productoRepository.existsById(id)) {
            producto.setId(id);
            return productoRepository.save(producto);
        }
        return null;
    }
}
