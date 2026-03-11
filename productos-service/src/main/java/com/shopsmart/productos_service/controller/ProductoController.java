package com.shopsmart.productos_service.controller;

import com.shopsmart.productos_service.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/productos") // Esta sera la ruta base
public class ProductoController {

    private List<Producto> productos = new ArrayList<>();

    // Voy a crear productos de prueba
    public ProductoController() {
        productos.add(new Producto(1L, "Laptop Gamer", 1200.00));
        productos.add(new Producto(2L, "Mouse Optico", 25.50));
    }

    // Aqui hago el endpoint GET que nos retornara la lista de productos
    @GetMapping
    public List<Producto> listarProductos() {
        return productos;
    }

    // Y aqui hago el otro endpoint POST que agregara un producto nuevo
    @PostMapping
    public Producto crearProducto(@RequestBody Producto nuevoProducto) {
        productos.add(nuevoProducto);
        return nuevoProducto;
    }
}