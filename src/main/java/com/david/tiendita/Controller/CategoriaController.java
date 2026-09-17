package com.david.tiendita.Controller;

import com.david.tiendita.Entity.Categoria;
import com.david.tiendita.Service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias") //todas las rutas de esta clase empezaran con /categorias
public class CategoriaController {
   //Declaramos a nuestro chef
    private final CategoriaService categoriaService;

    //Inyeccion de dependencias: Spring nos pasa el service ya listo
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    // GET: http://localhost:8080/categorias
    @GetMapping
    public List<Categoria> obtenerTodas() {
        //El controller no busca en la BD, le pide al service que lo haga
        return categoriaService.obtenerTodas();
    }

    // POST: http://localhost:8080/categorias
    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        //Recibimos el JSON convertido a Java y se lo pasamos al service para guardar
        return categoriaService.guardar(categoria);
    }
}
