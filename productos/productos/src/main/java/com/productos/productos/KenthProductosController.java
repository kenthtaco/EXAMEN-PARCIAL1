package com.productos.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class KenthProductosController {

    @Autowired
    private KenthProductosService productoService;

    @GetMapping("/kenthGetAll")
    public List<KenthProductos> getAllKenthProductos() {
        return productoService.obtenerTodosLosProductos();
    }

    @GetMapping("/kenthGetById/{id}")
    public KenthProductos getKenthProductoById(@PathVariable Long id) {
        return productoService.obtenerProductoPorId(id);
    }

    @PostMapping("/kenthSave")
    public KenthProductos saveKenthProducto(@RequestBody KenthProductos producto) {
        return productoService.insertarProducto(producto);
    }

    @PutMapping("/kenthUpdate/{id}")
    public KenthProductos updateKenthProducto(@PathVariable Long id, @RequestBody KenthProductos producto) {
        return productoService.actualizarProducto(id, producto);
    }

    @DeleteMapping("/kenthDelete/{id}")
    public void deleteKenthProductoPorId(@PathVariable Long id) {
        productoService.borrarProductoPorId(id);
    }

    @DeleteMapping("/kenthDeleteByNombre/{nombre}")
    public void deleteKenthProductoPorNombre(@PathVariable String nombre) {
        productoService.borrarProductoPorNombre(nombre);
    }
}
