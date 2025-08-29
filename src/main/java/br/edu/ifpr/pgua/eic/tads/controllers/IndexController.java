package br.edu.ifpr.pgua.eic.tads.controllers;



import java.util.HashMap;
import java.util.Map;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class IndexController {
    
    public Handler get = (Context ctx)->{
        ctx.redirect("index.html");
    };

}
