package com.jeancamargosdev.votacao.bbb.api.controller;

import com.jeancamargosdev.votacao.bbb.api.model.ParametroModel;
import com.jeancamargosdev.votacao.bbb.api.model.ParticipanteModel;
import com.jeancamargosdev.votacao.bbb.api.repository.ParametroRepository;
import com.jeancamargosdev.votacao.bbb.api.repository.ParticipanteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/participantes")
@AllArgsConstructor
public class ParticipanteController
{
    private final ParticipanteRepository repository;

    @PostMapping("/salvar")
    public ResponseEntity<ParticipanteModel> salvar(@RequestBody ParticipanteModel participante){
        ParticipanteModel entidade = repository.save(participante);
        return ResponseEntity.ok(entidade);
    }

    @GetMapping("/consultar")
    public ResponseEntity<ParticipanteModel> consulta(@RequestParam String id){
        Optional<ParticipanteModel> opt = repository.findById(id);
        if(opt.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(opt.get());
    }

}
