import { HttpBackend } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Categoria } from '../model/categoria.model';
import { GenericService } from './generic.service';

@Injectable({
  providedIn: 'root',
})
export class CategoriaService extends GenericService<Categoria> {
  constructor(handler: HttpBackend) {
    let url = 'http://localhost:8080/categoria';
    super(handler, url);
  }
}
