package com.david.tiendita.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaController {
    @GetMapping("/categorias")
    public String obtenerCategorias() {
        return "Aquí en el futuro devolveremos una lista real de categorías desde MySQL.";
    }

    @GetMapping("/categorias/{id}")
    public String obtenerCategoriaPorId(@PathVariable Long id) {
        return "Aqui devolveremos la informacion de la categoria con el id: " + id;
    }
}
