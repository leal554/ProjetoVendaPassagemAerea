package br.com.impacta.capitulo7.classes;


/* Atenção !!!!
 * 
 * char usa apas simples '' 
 * String usa aspas duplas ""
 * 
 */

public class Exemplo3 
{
	public static void main(String[] args) 
	{
		String nome = "GaB*&¨¨¨!*@#$&$&riel LeA#$!$!@#$l";
		System.out.println(nome);
		
		nome = limparNome(nome);
		System.out.println(nome);
		
		System.out.println(primeiraLetra(nome));
		
		System.out.println(ultimaLetra(nome));
		
		System.out.println(listarVogais(nome));
		
		System.out.println(contarvogais(nome));
		
		System.out.println(inverteNome(nome));
		
	}
	
	public static String limparNome(String coisa)     // Atenção: static so conversa com metodo static !!!!!! 
	{                                                 // se o metodo n for static coloque static para chama-lo
		String limpeza = coisa.trim().toUpperCase();  
		
		String letras = "";
		
		for (int pos=0; pos<limpeza.length(); pos++)
		{
			char letra = limpeza.charAt(pos);
			if ((letra >=65 && letra <=90) || letra == 32)  // Tabela ASCII para entender os numeros das letra!
			{
				letras += letra;
			}
			//System.out.println(pos + " => " + letra); // Para saber como funciona tire as barras duplas!
		}
		return letras.trim(); 
	}
	
	public static char primeiraLetra(String nome)
	{
		char letra = nome.charAt(0);
		return letra;
	}
	
	public static char ultimaLetra(String nome)
	{
		int quantidade = nome.length();
		char letra = nome.charAt(quantidade-1);
		return letra;
	}
	
	public static String listarVogais(String nome)
	{
		String vogais = "";
		
		for (int pos=0; pos<nome.length(); pos++)
		{
			String letra = nome.substring(pos,pos+1);
			if ("AEIOU".contains(letra))  
			{
				vogais += letra;
			}
		}
		return vogais;
	}
	
	public static String contarvogais(String nome)
	{
		int ta=0, te=0, ti=0, to=0, tu=0;
		
		for (int pos=0; pos<nome.length(); pos++)
		{
			char letra = nome.charAt(pos);
			
			switch(letra)
			{
				case 'A' : ta++; 
				break;
				case 'E' : te++; 
				break;
				case 'I' : ti++; 
				break;
				case 'O' : to++; 
				break;
				case 'U' : tu++; 
				break;
			}
		}
		
		String  mensagem = "A = " + ta + ",";
				mensagem += " E = " + te + ",";
				mensagem += " I = " + ti + ",";
				mensagem += " O = " + to + ",";
				mensagem += " U = " + tu;
		
		
		return mensagem;
	}
	
	public static String inverteNome(String nome)
	{
		String vogais = "";	
		int t = nome.length();
		
		for (int pos =t; pos>=0; pos--)
		{	
				vogais = nome.substring(pos);
		}
		return vogais;
	}
	
	
}
