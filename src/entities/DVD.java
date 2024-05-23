package entities;

public class DVD extends Item {

	Biblioteca biblioteca = null;
	private Integer duracao;
	private String genero;

	public DVD(String titulo, String autor, String ano, Integer duracao, String genero) {
		super(titulo, autor, ano);
		this.duracao = duracao;
		this.genero = genero;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return super.toString() +
			   "Duração: " + duracao + "\n" +
			   "Gênero: " + genero + "\n"; 
	}
	
	

}
