package br.com.service;

import br.com.model.Aluno;
import br.com.model.Escola;
import br.com.repository.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EscolaService {

    @Autowired
    private EscolaRepository escolaRepository;

    public void save(Escola escola){
        escolaRepository.save(escola);
    }

    public List<Escola> findAll(){
        return escolaRepository.findAll();
    }

    public Optional<Escola> findById(String id){
        return escolaRepository.findById(id);
    }

    public void delete(String id){
        escolaRepository.deleteById(id);
    }
}
