package com.david.tiendita.Service;

import com.david.tiendita.Entity.Categoria;
import com.david.tiendita.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    //Declaramos a nuestro empleado de bodega, es final para que no pueda cambiar despues
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;

    }

    //metodo para pedirle al bodegero todas las categorias
    public List<Categoria> obtenerTodas() {
        return categoriaRepository.findAll();
    }

    //Metodo para darle una nueva categoria al bodeguero y que la guarde
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    //Buscamos uno solo
    public Categoria obtenerPorId(Long id) {
        //find by id nos da un optional. Usamos .orElse(null) para decir:
        //si la caja esta vacia devuelve nulo
        return categoriaRepository.findById(id).orElse(null);
    }

    //Actualizar
    public Categoria actualizar(Long id, Categoria categoriaActualizada) {
        //primero verificamos si la categoria existe
        Categoria categoriaExistente = obtenerPorId(id);

        if (categoriaExistente != null) {
            categoriaExistente.setNombre(categoriaActualizada.getNombre());
            categoriaExistente.setDescripcion(categoriaActualizada.getDescripcion());

            //como categoria existente ya tiene su id original, esto hara un update en mysql
            return categoriaRepository.save(categoriaExistente);
        }
        return null; //si no existe retornamos null
    }

    public void eliminar(Long id) {
        categoriaRepository.deleteById(id);
    }


}
