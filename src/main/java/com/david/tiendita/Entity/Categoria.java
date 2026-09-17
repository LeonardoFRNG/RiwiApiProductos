package com.david.tiendita.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Usamos entity para decir que esta clase sera una tabla en mysql
@Entity
public class Categoria {
    //Id le dice a mysql cuál sera nuestra llave primaria
    @Id
    //autoincrement
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;

    //Importante, para que JPA funcione necesita un constructor vacio

    public Categoria() {
    }

    //Y necesitamos los getters y setters para que hibernate pueda leer y escribir datos.
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
}
