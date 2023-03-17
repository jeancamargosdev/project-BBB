package com.jeancamargosdev.votacao.bbb.api.service;

import com.jeancamargosdev.votacao.bbb.api.model.ParticipanteModel;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VotacaoService {

    private static final String TOPICO_VOTACAO = "votacao";

    private final KafkaTemplate<Object, Object> template;

    public void adicionarEvento(ParticipanteModel participante){
        template.send(TOPICO_VOTACAO, participante);

    }
}
