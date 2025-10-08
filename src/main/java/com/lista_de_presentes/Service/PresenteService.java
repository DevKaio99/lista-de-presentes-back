package com.lista_de_presentes.Service;

import com.lista_de_presentes.Model.Item;
import com.lista_de_presentes.Model.Presente;
import com.lista_de_presentes.Repository.ItensRepository;
import com.lista_de_presentes.Repository.PresenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresenteService {

    @Autowired
    private PresenteRepository presenteRepository;
    @Autowired
    private ItensRepository itensRepository;

    public Presente registrarPresente(Long itemId, String nomePresenteador) {
        Item item = itensRepository.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Item não encontrado"));

        if (item.getQuantidade() <= 0) {
            throw new RuntimeException("Item esgotado");
        }
        // Diminui 1 na quantidade do item
        item.setQuantidade(item.getQuantidade() - 1);
        itensRepository.save(item);

        // Cria o registro do presente
        Presente presente = new Presente();
        presente.setItem(item);
        presente.setNomePresenteador(nomePresenteador);
        return presenteRepository.save(presente);
    }
}
