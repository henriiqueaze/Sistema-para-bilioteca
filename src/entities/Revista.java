package entities;

public class Revista extends Item {
		
	private String edicao;
	private String mes;

	public Revista(String titulo, String autor, String ano, String edicao, String mes) {
		super(titulo, autor, ano);
		this.edicao = edicao;
		this.mes = mes;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	@Override
	public String toString() {
		return super.toString() +
		       "Edição: " + edicao + "\n" +
        	   "Mês: " + mes + "\n";
	}

	
}
