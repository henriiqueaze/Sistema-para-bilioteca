package entities;

public class Livro extends Item {

	private String isbn;
	private Integer numeroPaginas;

	public Livro(String titulo, String autor, String ano, String isbn, Integer numeroPaginas) {
		super(titulo, autor, ano);
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return super.toString() +
			   "ISBN: " + isbn + "\n" +
        	   "Número de Páginas: " + numeroPaginas + "\n";
	}
	
	

}
