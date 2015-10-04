package com.vpa.controle;

import java.util.ArrayList;

public class CheckIn 
{
	private static String idCliente;
	private static String idCliente2;
	private static String passagem;
	private static boolean despacharBagagem;
	
	public CheckIn(){}

	public static String getIdCliente() {
		return idCliente;
	}

	public static void setIdCliente(String idCliente) {
		CheckIn.idCliente = idCliente;
	}

	public static String getIdCliente2() {
		return idCliente2;
	}

	public static void setIdCliente2(String idCliente2) {
		CheckIn.idCliente2 = idCliente2;
	}

	public static String getPassagem() {
		return passagem;
	}

	public static void setPassagem(String passagem) {
		CheckIn.passagem = passagem;
	}

	public static boolean isDespacharBagagem() {
		return despacharBagagem;
	}

	public static void setDespacharBagagem(boolean despacharBagagem) {
		CheckIn.despacharBagagem = despacharBagagem;
	}
	
	
}
