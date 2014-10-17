package br.com.casadoavaoocodigo.livraria.testes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class OrdenandoComJava {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Java 8 Prático");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Java 8 Prático");
		ebook.setValor(29.90);
		
		List<Produto> produtos = Arrays.asList(fisico, ebook);
		
		Collections.sort(produtos);

		for (Produto produto : produtos) {
			System.out.println(produto.getValor());
		}
	}
}
