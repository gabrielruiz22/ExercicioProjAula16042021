package br.com.repository;


import br.com.model.Escola;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends MongoRepository<Escola, String> {

}
