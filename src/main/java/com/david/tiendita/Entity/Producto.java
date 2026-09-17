package com.david.tiendita.Entity;

import jakarta.persistence.*;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stock;

    //las relaciones (Muchos productos pueden pertenecer a una categoria)
    @ManyToOne
    //le dice a HN en la tabla producto de msql crea unca olumna categoria_id que sera una lave foranea a la tabla categoria
    @JoinColumn(name="categoria_id") //asi se llamara la columna en mysql
    private Categoria categoria;

    //Generamos el constructor vacio requerido por JPA

    public Producto() {
    }

    //Getters y setters

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
