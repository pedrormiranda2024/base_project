package br.edu.ifpr.pgua.eic.tads.models;

import br.edu.ifpr.pgua.eic.tads.App;

public class Contato {
    private String nome;
    private String email;
    private String telefone;


    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
    }

}
