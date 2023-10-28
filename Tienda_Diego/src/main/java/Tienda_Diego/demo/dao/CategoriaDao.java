package Tienda_Diego.demo.dao;

import Tienda_Diego.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoriaDao extends JpaRepository <Categoria,Long>{
    
}
