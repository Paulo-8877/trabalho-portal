package br.com.paulo.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.paulo.portal.model.Categoria;
import br.com.paulo.portal.model.Noticia;
import br.com.paulo.portal.repository.CategoriaRepository;
import br.com.paulo.portal.repository.NoticiaRepository;

@Component
public class InsertsBanco implements CommandLineRunner {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    NoticiaRepository noticiaRepository;

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria("Televisão", "Capas protetoras para smartphones", null);
        categoriaRepository.save(cat1);
        Categoria cat2 = new Categoria("Economia", "Notícias sobre economia", null);
        categoriaRepository.save(cat2);
        Categoria cat3 = new Categoria("Esporte", "Notícias sobre esporte", null);
        categoriaRepository.save(cat3);
        Categoria cat4 = new Categoria("Futebol", "Noticia sobre futebol", cat3);
        categoriaRepository.save(cat4);
        Categoria cat5 = new Categoria("Libertadores", "Notícias sobre a Libertadores", cat4);
        categoriaRepository.save(cat5);
        Categoria cat6 = new Categoria("Saude", "Notícias saude ", null);
        categoriaRepository.save(cat6);
        Categoria cat7 = new Categoria("Tecnologia", "Notícias sobre tecnologia", null);
        categoriaRepository.save(cat7);
        Categoria cat8 = new Categoria("Campeonato Brasileiro Série A", "Noticias sobre o campeonato brasileiro", cat4);
        categoriaRepository.save(cat8);
        Categoria cat9 = new Categoria("Cinema", "Calças jeans e de tecido", null);
        categoriaRepository.save(cat9);
        Categoria cat10 = new Categoria("Politica", "Notícias sobre politica", null);
        categoriaRepository.save(cat10);

        Noticia n1 = new Noticia("Avanços na exploração espacial", "A NASA anuncia uma nova missão para explorar Marte em 2026.", cat2);
        noticiaRepository.save(n1);
        Noticia n2 = new Noticia("Novo marco na educação brasileira", "O governo aprova uma nova lei que revoluciona o ensino médio.", cat10);
        noticiaRepository.save(n2);
        Noticia n3 = new Noticia("Inflação desacelera no Brasil", "Indicadores mostram que a inflação caiu pelo segundo mês consecutivo.", cat3);
        noticiaRepository.save(n3);
        Noticia n4 = new Noticia("Lançamento do novo smartphone", "A fabricante X apresentou um modelo inovador com tela dobrável.", cat4);
        noticiaRepository.save(n4);
        Noticia n5 = new Noticia("Copa do Mundo: Brasil vence mais uma", "A seleção brasileira derrota a Argentina em um jogo emocionante.", cat5);
        noticiaRepository.save(n5);
        Noticia n6 = new Noticia("Empresas investem em startups", "Grandes corporações estão apostando em novas ideias de tecnologia.", cat6);
        noticiaRepository.save(n6);
        Noticia n7 = new Noticia("Novo debate na Câmara dos Deputados", "Parlamentares discutem projetos sobre mudanças climáticas.", cat7);
        noticiaRepository.save(n7);
        Noticia n8 = new Noticia("Álbum surpresa de banda famosa", "A banda de rock Y lança um álbum sem anúncios prévios.", cat8);
        noticiaRepository.save(n8);
        Noticia n9 = new Noticia("Avanço na cura do câncer", "Pesquisadores anunciam resultados promissores em testes clínicos.", cat9);
        noticiaRepository.save(n9);
        Noticia n10 = new Noticia("Nova vacina contra gripe", "Autoridades aprovam um imunizante mais eficaz contra variações do vírus.", cat10);
        noticiaRepository.save(n10);
        Noticia n11 = new Noticia("Semana da moda agita Paris", "Grandes marcas apresentam suas coleções para o próximo verão.", cat1);
        noticiaRepository.save(n11);
        Noticia n12 = new Noticia("Exposição histórica em museu", "Museu Z exibe obras raras de grandes artistas renascentistas.", cat2);
        noticiaRepository.save(n12);
        Noticia n13 = new Noticia("Brasileirão: rodada decisiva", "Times lutam por vaga na Libertadores em uma rodada emocionante.", cat3);
        noticiaRepository.save(n13);
        Noticia n14 = new Noticia("Bitcoin atinge novo recorde", "A criptomoeda ultrapassa a marca de 70 mil dólares pela primeira vez.", cat4);
        noticiaRepository.save(n14);
        Noticia n15 = new Noticia("Show de rock atrai multidões", "O festival X recebe grandes nomes do rock internacional.", cat5);
        noticiaRepository.save(n15);

    }

}
