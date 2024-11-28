package br.com.paulo.portal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paulo.portal.model.Noticia;

@RestController
@RequestMapping(value = "noticia")
public class NoticiaController extends GenericController<Noticia, Integer> {

}
