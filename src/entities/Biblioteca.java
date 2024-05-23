package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

	Scanner input = new Scanner(System.in);
	List<Item> itens = new ArrayList<>();

	public void addItem(Item item) {
		itens.add(item);
	}

	public void removeItem(Item item) {
		itens.remove(item);
	}

	public void listarItens() {
		for (Item item : itens) {
			System.out.println(item);
		}
	}

	public void salvarItens() throws IOException {
		List<String> linhas = new ArrayList<>();
		for (Item item : itens) {
			linhas.add("Tipo: "+ item.getClass().getSimpleName() + "\n" +
			           			   "Título: " + item.getTitulo() + "\n" +
			           			   "Autor: " + item.getAutor() + "\n" +
			           			   "Ano: " + item.getAno() + "\n");
		}

		File file = new File("C:\\Programação\\Comandos\\ItensSalvos.txt");

		if (file.exists()) {

			try (BufferedWriter bf = new BufferedWriter(new FileWriter(file, true))) {
				for (String line : linhas) {
					bf.write(line);
					bf.newLine();
				}
			}

			catch (IOException e) {
				throw new IOException(e.getMessage());
			}

		}

		else {
			System.out.print("Deseja criar um novo arquivo? [S/N]: ");
			char resposta = Character.toUpperCase(input.next().charAt(0));

			if (resposta == 'S') {
				file.createNewFile();
				System.out.println("Arquivo criado com sucesso!");
			}

			else if (resposta == 'N') {
				System.out.println("Arquivo não criado");
			}
		}

	}

	public void carregarItens() throws IOException {
		File file = new File("C:\\Programação\\Comandos\\ItensSalvos.txt");

		if (file.exists()) {
			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String line = br.readLine();

				while (line != null) {
					System.out.println(line);
					line = br.readLine();
				}
			}

			catch (IOException e) {
				throw new IOException(e.getMessage());
			}

		}

		else {
			throw new FileNotFoundException("Arquivo não encontrado");
		}

	}

}
