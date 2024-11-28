package br.com.paulo.portal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "noticia")
@Data
@NoArgsConstructor
public class Noticia {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "corpo")
    private String corpo;

    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    @ManyToOne
    private Categoria categoria;

    public Noticia(String titulo, String corpo, Categoria categoria) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

}
