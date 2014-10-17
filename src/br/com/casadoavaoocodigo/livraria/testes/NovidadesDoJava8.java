package br.com.casadoavaoocodigo.livraria.testes;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");

		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O.");
		
		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Prático");

		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");
		
		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
		
		livros.sort(comparing(l -> l.getNome()));
		
		livros.forEach(l -> System.out.println(l.getNome()));
		
		List<Livro> filtrados = new ArrayList<>();
		for (Livro livro : livros) {
			if (livro.getNome().contains("Java")) {
				filtrados.add(livro);
			}
		}
		
		for (Livro livro : filtrados) {
			System.out.println(livro.getNome());
		}

		livros.stream()
			.filter(l -> l.getNome().contains("Java"))
			.forEach(l -> System.out.println(l.getNome()));		
		
		Stream<String> nomes = livros.stream().map(Livro::getNome);
		
		livros.stream()
			.map(l -> l.getNome())
			.filter(n -> n.contains("Java"))
			.forEach(n -> System.out.println(n));
		
		livros.stream()
			.map(Livro::getNome)
			.filter(n -> n.contains("Java"))
			.findFirst()
			.ifPresent(System.out::println);
	}
}
