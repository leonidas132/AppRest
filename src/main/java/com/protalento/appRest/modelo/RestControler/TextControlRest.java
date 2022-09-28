package com.protalento.appRest.modelo.RestControler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //Un controller es un componente de Spring capaz de recibir peticiones http y responderla
public class TextControlRest {
    @RequestMapping //anotacion que nos permite resibir todas las peticiones http
    @ResponseBody // nos permite reponder un cuerpo a nivel de servicios
    public ResponseEntity<String> funcion(){
        return new ResponseEntity<>("hola este es el proyecto appRest", HttpStatus.OK);
    }
}
