package com.david.tiendita.Service;

import com.david.tiendita.Entity.Producto;
import com.david.tiendita.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    //Declaramos a nuestro empleado en bodega, final para que no se pueda cambiar despues
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    //metodo para pedir todos los productos
    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }

    //Metodo para darle un nuevo producto al bodeguero y que lo guarde
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    //Buscar un solo producto
    public Producto obtenerPorId(Long id) {
        //find by id nos da un optional. Usamos .orElse(null) para decir:
        //si la caja esta vacía devuelve nulo
        return productoRepository.findById(id).orElse(null);
    }

    //Actualizar
    public Producto actualizar (Long id, Producto productoActualizado) {
        Producto productoExistente = obtenerPorId(id);

        if (productoExistente != null) {
            productoExistente.setNombre(productoActualizado.getNombre());
            productoExistente.setDescripcion(productoActualizado.getDescripcion());
            productoExistente.setPrecio(productoActualizado.getPrecio());
            productoExistente.setStock(productoActualizado.getStock());

            return productoRepository.save(productoExistente);
        }
        return null;
    }
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }

}
