package br.com.casadocodigo.livraria.testes;
import java.io.IOException;
import java.util.Random;

import br.com.casadocodigo.livraria.Autor;


public class ComparandoReferencias {

	public static void main(String[] args) throws IOException {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Autor autor2 = new Autor();
		autor2.setNome("Rodrigo Turini");
	
		if (autor.equals("Rodrigo")) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		

		boolean parseBoolean = Boolean.parseBoolean("false");

		byte parseByte = Byte.parseByte("1");
		short parseShort = Short.parseShort("10");
		int parseInt = Integer.parseInt("10");
		long parseLong = Long.parseLong("10");
		float parseFloat = Float.parseFloat("10.0");
		double parseDouble = Double.parseDouble("10.0");
		
		String numeroEmTexto = String.valueOf(10);
		
		long round = Math.round(3.99);
		long max = Math.max(100, 10);
		int min = Math.min(100, 10);
		int abs = Math.abs(-5);
		double sqrt = Math.sqrt(4);
		
		System.out.println(round);
		System.out.println(max);
		System.out.println(min);
		System.out.println(abs);
		System.out.println(sqrt);
		
		Random random = new Random();
		System.out.println(random.nextInt(10));

		String java = "java";
		String java2 = "java";
		
		System.out.println(java.equals(java2));
		
		
		String replace = java.replace("v", "c");
		String upperCase = java.toUpperCase();
		String lowerCase = "JAVA".toLowerCase();
		char charAt = java.charAt(0);
		boolean endsWith = java.endsWith("a");
		boolean startsWith = java.startsWith("s");
		boolean equals = java.equalsIgnoreCase("JAVA");
		
		System.out.println(replace);
		System.out.println(upperCase);
		System.out.println(lowerCase);
		System.out.println(charAt);
		System.out.println(endsWith);
		System.out.println(startsWith);
		System.out.println(equals);
		
	}
}
