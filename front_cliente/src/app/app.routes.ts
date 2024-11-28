import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { NoticiaComponent } from './noticia/noticia.component';

export const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'noticias/:id', component: HomeComponent },
  { path: '', component: HomeComponent },
  { path: 'noticia/:id', component: NoticiaComponent },
];
