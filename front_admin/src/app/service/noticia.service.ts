import { Injectable } from '@angular/core';
import { Noticia } from '../model/noticia.model';
import { HttpBackend } from '@angular/common/http';
import { GenericService } from './generic.service';

@Injectable({
  providedIn: 'root'
})
export class NoticiaService extends GenericService<Noticia> {

  constructor(handler: HttpBackend) { 
    let url = "http://localhost:8080/noticia";
    super(handler, url);
  }
}
