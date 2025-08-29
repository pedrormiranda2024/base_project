package br.edu.ifpr.pgua.eic.tads.models;
import java.util.ArrayList;
import br.edu.ifpr.pgua.eic.tads.App;

public class Agenda {
    private String descricao;
    private String tipo;

    public Agenda(String descricao, String tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public void adicionarContato(Contato contato) {
        App.databaseContato.add(contato);
    }

    public ArrayList<Contato> listarContatos () {
        return App.databaseContato;
    }

    @Override
    public String toString() {
        return "Agenda [descricao=" + descricao + ", tipo=" + tipo + ", Contatos= " +  listarContatos() + "]";
    }
}
