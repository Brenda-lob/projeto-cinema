package br.brenda.sistema.entidade;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
	
	//essa é uma lista de filmes
    private List<Filme> filmes = new ArrayList<>();

    public Cinema() {
       
    }

    public void addFilme(Filme filme) {
        filmes.add(filme);
    }

	    public void listarFilmes() {
	        if (filmes.isEmpty()) {
	            System.out.println("Nenhum filme cadastrado.");
	        }else {
	        	 for (Filme filme : filmes) {
	 	            System.out.println(filme);
	 	        }
	        }
	       
	    }

    public void reservarIngresso(String titulo) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Ingresso reservado para: " + filme.getTitulo());
                return;
            }
        }
        System.out.println("Filme não encontrado.");
    }
}
