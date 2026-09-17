package com.david.tiendita.repository;

import com.david.tiendita.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // JpaRepository ya nos regala métodos como save(), findAll(), findById(), deleteById()
}
