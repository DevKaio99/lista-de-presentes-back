package com.lista_de_presentes.Service;

import com.lista_de_presentes.DTO.ItensDTO;
import com.lista_de_presentes.Model.Item;
import com.lista_de_presentes.Model.Presente;
import com.lista_de_presentes.Repository.ItensRepository;
import com.lista_de_presentes.Repository.PresenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItensService {

    @Autowired
    private ItensRepository itensRepository;

    public List<ItensDTO> findAllOrdenadoPeloId () {
        return itensRepository.findAllByOrderByIdAsc()
                .stream()
                .map(ItensDTO::new)
                .toList();
    }
}
