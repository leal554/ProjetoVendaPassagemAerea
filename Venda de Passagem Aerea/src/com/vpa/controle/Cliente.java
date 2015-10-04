package com.vpa.controle;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.vpa.model.ClienteDAO;

public class Cliente 
{
	private String nome;
	private String rg;
	private String cpf;
	private String endereco;
	private int cep;
	private String srSraSr;
	private String estadoCivil;
	private String emprego;
	private String email;
	private String senha;
	private boolean clienteLogin;
	private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
   	
   	public Cliente(){}
   	
   	public Cliente(String nome, String rg, String cpf, String endereco, int cep, String srSraSr, String estadoCivil, String emprego,
   				   String email, String confirmaEmail, String senha, String confirmaSenha)
   	{
   		if(email.equals(confirmaEmail) && senha.equals(confirmaSenha))
   		{
   			this.nome = nome;
   	   		this.rg = rg;
   	   		this.cpf = cpf;
   	   		this.endereco = endereco;
   	   		this.cep = cep;
   	   		this.srSraSr = srSraSr;
   	   		this.estadoCivil = estadoCivil;
   	   		this.emprego = emprego;
   	   		this.email = email;
   	   		this.senha = senha;
   	   		
   	   		ClienteDAO cdao = new ClienteDAO();
   	   		cdao.InserirCliente(this.nome, this.rg, this.cpf, this.endereco, this.cep, this.srSraSr, this.estadoCivil, this.emprego, this.email, this.senha);
   		}
   		else
   		{
   			
   			JOptionPane.showMessageDialog(null,bn.getString("classe.cliente.erro1") ,"Erro",JOptionPane.WARNING_MESSAGE);
   		}
   	}
   	
   	public boolean loginCliente(String email, String senha)
   	{	
   		boolean idCliente = false;
   		
   		ClienteDAO cdao = new ClienteDAO();
   		idCliente = cdao.loginClienteDAO(email, senha);
   		
   		return idCliente;
   	}
   	
   	public String getIdCliente(String email)
   	{
   		String idClinte = null;
   		
   		ClienteDAO cdao = new ClienteDAO();
   		idClinte = cdao.getIdClienteDAO(email);
   		
   		return idClinte;
   	}
   	
   	public String listaClientes()
   	{
   		
   		
   		return "";
   	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getRg() 
	{
		return rg;
	}

	public void setRg(String rg) 
	{
		this.rg = rg;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public String getEndereco() 
	{
		return endereco;
	}

	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}

	public int getCep() 
	{
		return cep;
	}

	public void setCep(int cep) 
	{
		this.cep = cep;
	}

	public String getSrSraSr() 
	{
		return srSraSr;
	}

	public void setSrSraSr(String srSraSr) 
	{
		this.srSraSr = srSraSr;
	}

	public String getEstadoCivil() 
	{
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) 
	{
		this.estadoCivil = estadoCivil;
	}

	public String getEmprego() 
	{
		return emprego;
	}

	public void setEmprego(String emprego) 
	{
		this.emprego = emprego;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getSenha() 
	{
		return senha;
	}

	public void setSenha(String senha) 
	{
		this.senha = senha;
	}
}
