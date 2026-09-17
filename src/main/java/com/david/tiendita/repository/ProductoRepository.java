package com.david.tiendita.repository;

import com.david.tiendita.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//esta anotación le indica a Spring Boot que este archivo hablará con la bd
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // JpaRepository ya nos regala métodos como save(), findAll(), findById(), deleteById()
}
