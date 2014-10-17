package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;


public class Ebook extends Livro implements Promocional {

	private String waterMark;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}
	
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	
	@Override
	public String toString() {
		return "Eu sou um Ebook";
	}
}
