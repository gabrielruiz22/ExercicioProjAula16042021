package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Curso;
import br.com.model.Matricula;
import br.com.service.CursoService;
import br.com.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping(Constant.API_CLIENT_CURSO)
    public void save(@RequestBody Curso curso){
        cursoService.save(curso);
    }

    @GetMapping(Constant.API_CLIENT_CURSO)
    public List<Curso> findAll(){
        return cursoService.findAll();
    }

    @PutMapping(Constant.API_CLIENT_CURSO)
    public void update(@RequestBody Curso curso){
        cursoService.save(curso);
    }

    @DeleteMapping(Constant.API_CLIENT_CURSO + "/{id}")
    public void delete(@PathVariable("id") String id){
        cursoService.delete(id);
    }

    @GetMapping(Constant.API_CLIENT_CURSO + "/{id}")
    public Optional<Curso> findById(@PathVariable("id") String id){
        return cursoService.findById(id);
    }
}
