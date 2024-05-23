package application;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Biblioteca;
import entities.Item;
import entities.Utilidades;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Utilidades utilidades = new Utilidades();
		Biblioteca biblioteca = new Biblioteca();

		try {
			while (true) {
				System.out.println("\n[1] - Adicionar Livro\r\n" + "[2] - Adicionar Revista\r\n"
						+ "[3] - Adicionar DVD\r\n" + "[4] - Salvar Itens no Arquivo\r\n"
						+ "[5] - Carregar Itens do Arquivo\r\n" + "[6] - Listar Itens\r\n" + "[7] - Sair\r\n");

				System.out.print("Resposta: ");
				byte resposta = input.nextByte();

				switch (resposta) {
				case 1:
					Item livro = utilidades.livro();
					biblioteca.addItem(livro);
					System.out.println("Livro Adicionado!\n");
					break;

				case 2:
					Item revista = utilidades.revista();
					biblioteca.addItem(revista);
					System.out.println("Revista Adicionada!\n");
					break;

				case 3:
					Item DVD = utilidades.dvd();
					biblioteca.addItem(DVD);
					System.out.println("DVD Adicionado!\n");
					break;

				case 4:
					biblioteca.salvarItens();
					System.out.println("Itens salvos!\n");
					break;

				case 5:
					biblioteca.carregarItens();
					System.out.println("Itens Carregados!\n");
					break;

				case 6:
					biblioteca.listarItens();
					System.out.println("Itens Listados!\n");
					break;

				case 7:
					System.out.println("Saindo...");
					System.exit(0);
					break;

				default:
					System.out.println("Opção inválida!\n");
					break;
				}
			}

		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		catch (InputMismatchException e) {
			System.out.println("ERRO: Digite as opções com números inteiros");
		}
		
		catch (Exception e) {
			System.out.println("Erro: " + e.getLocalizedMessage());
		}

		finally {
			input.close();
		}

	}

}
