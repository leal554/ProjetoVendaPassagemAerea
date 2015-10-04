package com.vpa.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.vpa.model.ClienteDAO;
import com.vpa.model.PassagemDAO;

public class Passagem 
{
	private static double pesoBagagem;
	private static String numeroBagagem;
	private static String necessidadeEspecial;
	private static String criança;
	private static String idaEvolta;
	private static String formaPagamento;
	private static int numeroCartao;
	private static int codSeguranca;
	private static String dataIda;
	private static String dataVolta;
	private static Double valor = 0.0;
	private static String idCliente2;
	private static String idCliente;
	private static String tpassagem;
	private static String numeroVoo;
	private static String numeroAeronave;
	private static String Acento;
	
	
	public Passagem(){}
	
	public static void numeroVooNumeroAeronave(String numeroVoo, String numeroAeronve)
	{
		Passagem.numeroVoo = numeroVoo;
		Passagem.numeroAeronave = numeroAeronve;
	}
	
	public static void inserirIdCliente(String idCliente)
	{
		Passagem.idCliente = idCliente;
	}
	
	public static  void escolherAcento(String Acento)
	{
		Passagem.Acento = Acento;
	}

	public static double getPesoBagagem() {
		return pesoBagagem;
	}

	public static void setPesoBagagem(double pesoBagagem) {
		Passagem.pesoBagagem = pesoBagagem;
	}

	public static String getNumeroBagagem() {
		return numeroBagagem;
	}

	public static void setNumeroBagagem(String numeroBagagem) {
		Passagem.numeroBagagem = numeroBagagem;
	}

	public static String getNecessidadeEspecial() {
		return necessidadeEspecial;
	}

	public static void setNecessidadeEspecial(String necessidadeEspecial) {
		Passagem.necessidadeEspecial = necessidadeEspecial;
	}

	public static String getCriança() {
		return criança;
	}

	public static void setCriança(String criança) {
		Passagem.criança = criança;
	}

	public static String getIdaEvolta() {
		return idaEvolta;
	}

	public static void setIdaEvolta(String idaEvolta) {
		Passagem.idaEvolta = idaEvolta;
	}

	public static String getFormaPagamento() {
		return formaPagamento;
	}

	public static void setFormaPagamento(String formaPagamento) {
		Passagem.formaPagamento = formaPagamento;
	}

	public static int getNumeroCartao() {
		return numeroCartao;
	}

	public static void setNumeroCartao(int numeroCartao) {
		Passagem.numeroCartao = numeroCartao;
	}

	public static int getCodSeguranca() {
		return codSeguranca;
	}

	public static void setCodSeguranca(int codSeguranca) {
		Passagem.codSeguranca = codSeguranca;
	}

	public static String getDataIda() {
		return dataIda;
	}

	public static void setDataIda(String dataIda) {
		Passagem.dataIda = dataIda;
	}

	public static String getDataVolta() {
		return dataVolta;
	}

	public static void setDataVolta(String dataVolta) {
		Passagem.dataVolta = dataVolta;
	}

	public static Double getValor() {
		return valor;
	}

	public static void setValor(Double valor) {
		Passagem.valor = valor;
	}

	public static String getIdCliente() {
		return idCliente;
	}

	public static void setIdCliente(String idCliente) {
		Passagem.idCliente = idCliente;
	}

	public static String getNumeroVoo() {
		return numeroVoo;
	}

	public static void setNumeroVoo(String numeroVoo) {
		Passagem.numeroVoo = numeroVoo;
	}

	public static String getNumeroAeronave() {
		return numeroAeronave;
	}

	public static void setNumeroAeronave(String numeroAeronave) {
		Passagem.numeroAeronave = numeroAeronave;
	}

	public static String getAcento() {
		return Acento;
	}

	public static void setAcento(String acento) {
		Acento = acento;
	}
	
	public static String getIdCliente2() {
		return idCliente2;
	}

	public static void setIdCliente2(String idCliente2) {
		Passagem.idCliente2 = idCliente2;
	}

	public static String getTpassagem() {
		return tpassagem;
	}

	public static void setTpassagem(String tpassagem) {
		Passagem.tpassagem = tpassagem;
	}
	
}