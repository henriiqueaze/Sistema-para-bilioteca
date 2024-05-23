package entities;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Utilidades {
	SimpleDateFormat sdf = new SimpleDateFormat("MM");
	Scanner input = new Scanner(System.in);
	
	public Item livro() {
		System.out.println("Digite dados do livro: ");
		System.out.print("Título: ");
		String tituloLivro = input.nextLine();
		System.out.print("Autor: ");
		String autorLivro = input.nextLine();
		System.out.print("Ano de lançamento: ");
		String anoLivro = input.nextLine();
		System.out.print("ISBN - Padrão Internacional de Numeração de Livro: ");
		String isbn = input.nextLine();
		System.out.print("Número de páginas: ");
		int paginas = input.nextInt();
		input.nextLine();
		Item livro = new Livro(tituloLivro, autorLivro, anoLivro, isbn, paginas);
		return livro;
	}
	
	public Item revista() {
		System.out.println("Digite dados da revista: ");
		System.out.print("Título: ");
		String tituloRevista = input.nextLine();
		System.out.print("Autor: ");
		String autorRevista = input.nextLine();
		System.out.print("Ano de lançamento: ");
		String anoRevista = input.nextLine();
		System.out.print("Edição: ");
		String edicao = input.nextLine();
		System.out.print("Mês: ");
		String mes = input.nextLine();
		Item revista = new Revista(tituloRevista, autorRevista, anoRevista, edicao, mes);
		return revista;
	}
	
	public Item dvd() {
		System.out.println("Digite dados do DVD: ");
		System.out.print("Título: ");
		String tituloDVD = input.nextLine();
		System.out.print("Autor: ");
		String autorDVD = input.nextLine();
		System.out.print("Ano de lançamento: ");
		String anoDVD = input.nextLine();
		System.out.print("Duração: ");
		Integer duracao = input.nextInt();
		input.nextLine();
		System.out.print("Gênero: ");
		String genero = input.nextLine();
		Item DVD = new DVD(tituloDVD, autorDVD, anoDVD, duracao, genero);
		return DVD;
	}
}
