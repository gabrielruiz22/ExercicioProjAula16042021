package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Escola;
import br.com.service.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EscolaController {

    @Autowired
    private EscolaService escolaService;

    @PostMapping(Constant.API_CLIENT_ESCOLA)
    public void save(@RequestBody Escola escola){
        escolaService.save(escola);
    }

    @GetMapping(Constant.API_CLIENT_ESCOLA)
    public List<Escola> findAll(){
        return escolaService.findAll();
    }

    @PutMapping(Constant.API_CLIENT_ESCOLA)
    public void update(@RequestBody Escola escola){
        escolaService.save(escola);
    }

    @DeleteMapping(Constant.API_CLIENT_ESCOLA + "/{id}")
    public void delete(@PathVariable("id") String id){
        escolaService.delete(id);
    }

    @GetMapping(Constant.API_CLIENT_ESCOLA + "/{id}")
    public Optional<Escola> findById(@PathVariable("id") String id){
        return escolaService.findById(id);
    }
}
