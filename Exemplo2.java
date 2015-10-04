package br.com.impacta.capitulo7.classes;

import java.util.Date;

public class Exemplo2 
{
	public static void main(String[] args) 
	{
		String nome = "   gAbrIEL lEaL     ";
		
		
		
		
		// toLowerCase
		
		nome = nome.toLowerCase().trim(); 
		// pode se colocar quantos metodos quizer um do lado do outro
		
		// Metodo: trim() tira os espaços do começo e do fim da string
		// Metodo: toLoweCase() coloca todas as letras minusculas o contrario 
		// dele e toUperCase()
		
		
		
		
		// charAt
		
		System.out.println(nome.charAt(3)); 
		
		// charAt capitura a letra desejada
		
		
		
		
		// concat
		
		System.out.println(nome.concat(" Azul "));
		
		System.out.println("Aluno ".concat(nome));  
		
		/* concat e melhor do q o + para concatenar 
		// Strings
		*/
		
		
		
		
		// contains
		
		boolean checagem = nome.contains("gA"); 
		
		// Procura letras na String / contains e boolean
		// cuidado case sensitive ele diferencia maiusculo de minusculo !!!
		
		System.out.println(checagem);
		
		
		
		
		// endsWith
		
		System.out.println(nome.endsWith("Silva"));
		
		// endsWirh(): serve para procurar  oq termina/ Boolean
		// case sensitive! 
		
		System.out.println(nome.toLowerCase());
		
		
		
		
		// subsstring
		
		String pedaco = nome.substring(8); // A partir da posição ele pega um pedaço
		System.out.println(pedaco);
		
		// Sobrecarga de metodo metodos com mesmo nome mas com parametros diferentes
		
		String faixa = nome.substring(6,11);
		System.out.println(faixa);
		
		
		
		
		// length
		
		int tamanho = nome.length();
		System.out.println("Tamanho: " + tamanho);
		
		// length(): conta o tamanho da String / NÃO precisa de parametros!
		
		
		
		
		// startsWith
		
		System.out.println(nome.startsWith("ga"));
		
		// Procura o começa com o parametro / Boolean
		// Case Sensitive !!!
		
		
		
		
		//indexOf
		
		int local = nome.indexOf("l");
		System.out.println("Posição: " + local);
		
		// traz a posição numerica da letra da Palavra 
		// obs: -1 não achou / Case Sensitive
		
		
		
		
		//hashCode()
		
		System.out.println(nome.hashCode());
		
		// Posição na memoria muda a cada vez
		
		
		
		
		// lastIndexOf()
		
		System.out.println(nome.lastIndexOf("0"));
		
		// Ultima ocorrencia 	
		
		
		
		
		// Math / mais em api java 
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-51));
		System.out.println(Math.max(10, 15)); // passa 2 valores e retorna o Maior deles
		System.out.println(Math.min(10, 15)); // passa 2 valores e retorna o Menor deles
		System.out.println(Math.sqrt(64));    // raiz quadrada
		System.out.println(Math.pow(2, 3));   // potencia, numeros elevados
		
		
		
		
		// Date
										         // Azeitona bolinha verte com traço não e 
										         // para usar mas pode se quizer
		
		Date data = new Date();                  // Importar java.util
		System.out.println(data);                // Mostra a data atual
		System.out.println(data.getDate());      // pega o dia somente
		System.out.println(data.getMonth()+1);   // pega o Mes / +1 poque jaaneiro e mes 0 no Java
		System.out.println(data.getYear()+1900); // pega o ano / no metodo ele tira -1900 atuomatico ento some
		
	}
}
