package br.com.repository;

import br.com.model.Matricula;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends MongoRepository<Matricula, String> {

}
