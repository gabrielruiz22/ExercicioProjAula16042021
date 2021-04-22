package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Matricula {

    @Id
    private String _id;
    private String dataMatricula;
    private Escola idEscola;
    private Aluno raAluno;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Escola getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(Escola idEscola) {
        this.idEscola = idEscola;
    }

    public Aluno getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(Aluno raAluno) {
        this.raAluno = raAluno;
    }
}
