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


}
