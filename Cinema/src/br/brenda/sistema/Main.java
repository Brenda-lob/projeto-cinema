package br.brenda.sistema;

import java.util.Scanner;

import br.brenda.sistema.entidade.Cinema;
import br.brenda.sistema.entidade.Filme;

public class Main {

	public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("=== Sistema de Cinema ===");
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Listar Filmes");
            System.out.println("3. Reservar Ingresso");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Título do filme: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Gênero do filme: ");
                    String genero = scanner.nextLine();
                    System.out.print("Duração do filme (em minutos): ");
                    int duracao = scanner.nextInt();
                    
                    
                    Filme filme = new Filme();
                    filme.setDuracao(duracao);
                    filme.setGenero(genero);
                    filme.setTitulo(titulo);
                    
                    cinema.addFilme(filme);
                    break;
                case 2:
                    cinema.listarFilmes();
                    break;
                case 3:
                    System.out.print("Título do filme para reservar ingresso: ");
                    String tituloReserva = scanner.nextLine();
                    cinema.reservarIngresso(tituloReserva);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println();
       
        }
        scanner.close();
    }

}
