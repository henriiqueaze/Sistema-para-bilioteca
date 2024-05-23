package entities;

import java.util.Scanner;

public abstract class Item {

	Scanner input = new Scanner(System.in);
		
	private String titulo;
	private String autor;
	private String ano;

	public Item(String titulo, String autor, String ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Tipo: "+ getClass().getSimpleName() + "\n" +
	           "Título: " + getTitulo() + "\n" +
	           "Autor: " + getAutor() + "\n" +
	           "Ano: " + getAno() + "\n";
	}

}
