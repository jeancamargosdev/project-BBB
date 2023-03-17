package com.jeancamargosdev.votacao.bbb.ms.repository;

import com.jeancamargosdev.votacao.bbb.ms.model.VotacaoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VotacaoRepository extends MongoRepository <VotacaoModel, String>{

}
