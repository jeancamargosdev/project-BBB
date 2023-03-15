package com.jeancamargosdev.votacao.bbb.api.controller;

import com.jeancamargosdev.votacao.bbb.api.model.ParametroModel;
import com.jeancamargosdev.votacao.bbb.api.repository.ParametroRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/parametros")
public class ParametroController
{
    private final ParametroRepository repository;

    public ParametroController(ParametroRepository repository){
        this.repository = repository;
    }

    @PostMapping("/salvar")
    public ResponseEntity<ParametroModel> salvar(@RequestBody ParametroModel parametro){
        ParametroModel entidade = repository.save(parametro);
        return ResponseEntity.ok(entidade);
    }

    @GetMapping("/consulta")
    public ResponseEntity<ParametroModel> consulta(@RequestParam String chave){
        Optional<ParametroModel> optParamtro = repository.findById(chave);
        if(optParamtro.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(optParamtro.get());
    }

}
