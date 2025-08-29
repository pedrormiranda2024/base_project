package br.edu.ifpr.pgua.eic.tads;

import java.util.ArrayList;

import br.edu.ifpr.pgua.eic.tads.controllers.CadastroController;
import br.edu.ifpr.pgua.eic.tads.controllers.IndexController;
import br.edu.ifpr.pgua.eic.tads.utils.JavalinUtils;
import br.edu.ifpr.pgua.eic.tads.models.*;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

/**
 * Hello world!
 *
 */
public class App {
    public static ArrayList<Contato> databaseContato = new ArrayList<>();
    public static void main( String[] args ){
        Contato contato = new Contato("Pedro", "Blablabla", "123456");

        Agenda agenda = new Agenda("info24", "online");

        agenda.adicionarContato(contato);
        
        System.out.println(agenda.toString());



        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public", Location.CLASSPATH);
        }).start(7000);

        IndexController indexController = new IndexController();
        CadastroController cadastroController = new CadastroController();

        app.get("/", ctx -> {
            ctx.redirect("/index.html");
        });

        app.get("/index", indexController.get);
        app.get("/cadastro", cadastroController.get);
    }
}
