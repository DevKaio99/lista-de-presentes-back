package com.lista_de_presentes.Repository;

import com.lista_de_presentes.DTO.ItensDTO;
import com.lista_de_presentes.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItensRepository extends JpaRepository<Item, Long> {

    List<Item> findAllByOrderByIdAsc();

}
