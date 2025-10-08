package com.lista_de_presentes.Repository;

import com.lista_de_presentes.Model.Presente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresenteRepository extends JpaRepository <Presente, Long> {
    
}
