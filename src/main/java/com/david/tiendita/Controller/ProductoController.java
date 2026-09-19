package com.david.tiendita.Controller;

import com.david.tiendita.Entity.Producto;
import com.david.tiendita.Service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    //Get
    @GetMapping
    public List<Producto> obtenerTodos() {
        //el controller no busca en la bd, le pide al service que lo haga
        return productoService.obtenerTodos();
    }

    //Post
    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }

    //Get por id http://localhost:8080/productos/{id}
    @GetMapping("/{id}")
    public Producto obtenerPorId(@PathVariable Long id) {
        return productoService.obtenerPorId(id);
    }

    //Put
    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Long id, @RequestBody Producto producto) {
        return productoService.actualizar(id, producto);
    }

    //Delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        productoService.eliminar(id);
    }

}
