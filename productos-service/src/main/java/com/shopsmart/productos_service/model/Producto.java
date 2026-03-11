package com.shopsmart.productos_service.model;

// Esta puede ser una manera de hacer los endpoints - Att: Samuel
public class Producto {
    private Long id;
    private String nombre;
    private double precio;


// Hago un constructor vacio que sera necesario para el JSON
public Producto() {}

// Aqui hago el constructor con los parametros
public Producto(Long id, String nombre, double precio){
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
}

// Por ultimo realizo los Getters and Setters
public Long getId() { return id; }
public void setId(Long id) { this.id = id; }
public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }
public double getPrecio() { return precio; }
public void setPrecio(double precio) { this.precio = precio; }
}

