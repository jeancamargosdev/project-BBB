package com.jeancamargosdev.votacao.bbb.api.repository;

import com.jeancamargosdev.votacao.bbb.api.model.ParticipanteModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipanteRepository extends MongoRepository<ParticipanteModel, String> {
}
