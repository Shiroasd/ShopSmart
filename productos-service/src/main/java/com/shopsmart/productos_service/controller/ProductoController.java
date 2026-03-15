package com.shopsmart.productos_service.controller;

import com.shopsmart.productos_service.model.Producto;
import com.shopsmart.productos_service.repository.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoRepository productoRepository;

    // Inyección del repositorio vía constructor
    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Endpoint GET: lista todos los productos desde la BD
    @GetMapping
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    // Endpoint POST: guarda un nuevo producto en la BD
    @PostMapping
    public Producto crearProducto(@RequestBody Producto nuevoProducto) {
        return productoRepository.save(nuevoProducto);
    }
}
