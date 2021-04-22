package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Escola;
import br.com.model.Matricula;
import br.com.service.EscolaService;
import br.com.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    @PostMapping(Constant.API_CLIENT_MATRICULA)
    public void save(@RequestBody Matricula matricula){
        matriculaService.save(matricula);
    }

    @GetMapping(Constant.API_CLIENT_MATRICULA)
    public List<Matricula> findAll(){
        return matriculaService.findAll();
    }

    @PutMapping(Constant.API_CLIENT_MATRICULA)
    public void update(@RequestBody Matricula matricula){
        matriculaService.save(matricula);
    }

    @DeleteMapping(Constant.API_CLIENT_MATRICULA + "/{id}")
    public void delete(@PathVariable("id") String id){
        matriculaService.delete(id);
    }

    @GetMapping(Constant.API_CLIENT_MATRICULA + "/{id}")
    public Optional<Matricula> findById(@PathVariable("id") String id){
        return matriculaService.findById(id);
    }
}
