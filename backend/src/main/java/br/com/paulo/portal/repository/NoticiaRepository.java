package br.com.paulo.portal.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.paulo.portal.model.Noticia;

public interface NoticiaRepository extends CrudRepository<Noticia, Integer> {

}
