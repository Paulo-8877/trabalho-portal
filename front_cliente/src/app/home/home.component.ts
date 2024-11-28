import { Component, OnInit } from '@angular/core';
import { NoticiaService } from '../service/noticia.service';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { lastValueFrom } from 'rxjs';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [NgFor, RouterModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent implements OnInit {
  id: any;
  noticia$: any;
  categoria$: any;

  constructor(
    private noticiaService: NoticiaService,
    private router: Router,
    private activatedRoute: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.activatedRoute.params.subscribe((params) => {
      this.id = params['id'];
      this.getNoticias();
    });
  }

  public async getNoticias() {
      this.noticia$ = await lastValueFrom(this.noticiaService.get());
  }

  public abrirNoticia(id: any) {
    this.router.navigate(['noticia/', id]);
  }
}
