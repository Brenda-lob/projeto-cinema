package br.brenda.sistema.entidade;

public class Filme {
	
	private int duracao;
    private String titulo;
    private String genero;
   

    public Filme() {
       
    }
    
    public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Filme: " + titulo + ", Gênero: " + genero + ", Duração: " + duracao + " min";
    }
}

