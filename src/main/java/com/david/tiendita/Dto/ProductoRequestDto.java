package com.david.tiendita.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoRequestDto {
    //Solo se pone lo que el usuario realmente necesita enviarnos para crear un producto
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stock;

    //en lugar de pedir el objeto completo, solamente pedimos el id
    private Long categoriaId;
}
