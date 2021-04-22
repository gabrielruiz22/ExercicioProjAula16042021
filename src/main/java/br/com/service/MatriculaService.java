package br.com.service;

import br.com.model.Aluno;
import br.com.model.Matricula;
import br.com.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    public void save(Matricula matricula){
        matriculaRepository.save(matricula);
    }

    public List<Matricula> findAll(){
        return matriculaRepository.findAll();
    }

    public Optional<Matricula> findById(String id){
        return matriculaRepository.findById(id);
    }

    public void delete(String id){
        matriculaRepository.deleteById(id);
    }
}
