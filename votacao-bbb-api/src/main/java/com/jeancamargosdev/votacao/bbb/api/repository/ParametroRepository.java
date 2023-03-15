package com.jeancamargosdev.votacao.bbb.api.repository;

import com.jeancamargosdev.votacao.bbb.api.model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParametroRepository extends MongoRepository<ParametroModel, String> {

}
