package com.lista_de_presentes.Controller;

import com.lista_de_presentes.DTO.ItensDTO;
import com.lista_de_presentes.Model.Presente;
import com.lista_de_presentes.Repository.PresenteRepository;
import com.lista_de_presentes.Service.ItensService;
import com.lista_de_presentes.Service.PresenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/itens")
public class ItensController {

    @Autowired
    private ItensService itensService;
    @Autowired
    private PresenteService presenteService;

    @GetMapping
    public ResponseEntity<List<ItensDTO>> listar() {
        return ResponseEntity.ok(itensService.findAllOrdenadoPeloId());
    }

    @PostMapping("/presentear/{id}")
    public ResponseEntity<Presente> presentear(
            @PathVariable Long id,
            @RequestBody Map<String, String> payload) {

        String nomePresenteador = payload.get("nomePresenteador");
        Presente novoPresente = presenteService.registrarPresente(id, nomePresenteador);

        return ResponseEntity.ok(novoPresente);
    }
}
