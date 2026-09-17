package com.david.tiendita.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    //le dice a HN en la tabla producto de msql crea una columna categoria_id que sera una lave foránea a la tabla categoria
    @JoinColumn(name="categoria_id") //asi se llamara la columna en mysql
    private Categoria categoria;
}
