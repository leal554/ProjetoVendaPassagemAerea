package com.vpa.controle;

import java.util.ArrayList;

import com.vpa.model.VooDAO;

public class Voo 
{
	private String numeroVoo;
	private int tripulacao;
	private String saida;
	private String chegada;
	private String dia;
	private String destino;
	private String aeronave;
	private ArrayList<String> voo = new ArrayList<String>();
	
	private String[] Aeroportos = 
	{ 
			"Aeroporto Internacional de Cruzeiro do Sul (CZS/SBCZ) - Cruzeiro do Sul",
			"Aeroporto Internacional de Rio Branco - Plácido de Castro (RBR/SBRB) - Rio Branco",
			"Aeroporto Internacional Zumbi dos Palmares (MCZ/SBMO) - Maceió",
			"Aeroporto de Tefé (TFF/SBTF) - Tefé",
			"Aeroporto Internacional de Tabatinga (TBT/SBTT) - Tabatinga",
			"Aeroporto Internacional Eduardo Gomes (MAO/SBEG) - Manaus",
			"Aeroporto Jorge Amado (IOS/SBIL) - Ilhéus",
			"Aeroporto de Paulo Afonso (PAV/SBUF) - Paulo Afonso",
			"Aeroporto Internacional Dep. Luís Eduardo Magalhães (SSA/SBSV) - Salvador",
			"Aeroporto Internacional Pinto Martins (FOR/SBFZ) - Fortaleza",
			"Aeroporto Internacional de Brasília Presidente Juscelino Kubstichek (BSB) - Distrito Federal",
			"Aeroporto Regional do Cariri (JDO/SBJU) - Juazeiro do Norte",
			"Aeroporto Eurico de Aguiar Salles (VIX/SBVT) - Vitória",
			"Aeroporto Santa Genoveva (GYN/SBGO) - Goiânia",
			"Aeroporto de Imperatriz (IMP/SBIZ) - Imperatriz",
			"Aeroporto Internacional Marechal Cunha Machado (SLZ/SBSL) - São Luís",
			"Aeroporto Internacional Marechal Rondon (CGB/SBCY) - Várzea Grande/Cuiabá",
			"Aeroporto Internacional de Campo Grande (CGR/SBCG) - Campo Grande",
			"Aeroporto Internacional de Corumbá (CMG/SBCR) - Corumbá",
			"Aeroporto Internacional de Ponta Porã (PMG/SBPP) - Ponta Porã",
			"Aeroporto Ten.-Cel. Av. César Bombonato (UDI/SBUL) - Uberlândia",
			"Aeroporto da Pampulha - Carlos Drummond de Andrade (PLU/SBBH) - Belo Horizonte",
			"Aeroporto Carlos Prates (SBPR) - Belo Horizonte",
			"Aeroporto de Montes Claros (MOC/SBMK) - Montes Claros",
			"Embaixador Walther Moreira Salles (POO/SBPC) - Poços de Caldas",
			"Aeroporto Mário de Almeida Franco (UBA/SBUR) - Uberaba",
			"Aeroporto de Barbacena - (QAK/SBBQ) Barbacena",
			"Aeroporto de Altamira (ATM/SBHT) - Altamira",
			"Aeroporto Internacional de Belém/Val de Cans (BEL/SBBE) - Belém",
			"Aeroporto Júlio Cesar (SBJC) - Belém",
			"Aeroporto de Marabá (MAB/SBMA) - Marabá",
			"Aeroporto de Carajás (CKS/SBCJ) - Parauapebas",
			"Aeroporto Internacional de Santarém - (STM/SBSN) - Santarém",
			"Aeroporto Internacional Presidente Castro Pinto (JPA/SBJP) - Bayeux/João Pessoa",
			"Aeroporto Presidente João Suassuna (CPV/SBKG) - Campina Grande",
			"Aeroporto Governador José Richa (LDB/SBLO) - Londrina",
			"Aeroporto Internacional Afonso Pena (CWB/SBCT) - São José dos Pinhais/Curitiba",
			"Aeroporto do Bacacheri (BFH/SBBI) - Curitiba",
			"Aeroporto Internacional Cataratas (IGU/SBFI) - Foz do Iguaçu",
			"Aeroporto de Petrolina (PNZ/SBPL) - (Petrolina)",
			"Aeroporto Internacional dos Guararapes Gilberto Freyre (REC/SBRF) - Recife",
			"Aeroporto de Fernando de Noronha(FEN/SBFN) - Fernando de Noronha",
			"Aeroporto Internacional Prefeito Dr.João Silva Filho (PHB/SBPB) - Parnaíba",
			"Aeroporto Senador Petrônio Portella (THE/SBTE) - Teresina",
			"Aeroporto Internacional Prefeito Dr.João Silva Filho (PHB/SBPB) - Parnaíba",
			"Aeroporto Senador Petrônio Portella (THE/SBTE) - Teresina",
			"Aeroporto Internacional Augusto Severo (NAT/SBNT) - Parnamirim/Natal",
			"Aeroporto Internacional da Grande Natal - São Gonçalo do Amarante/Natal",
			"Aeroporto Internacional Comandante Gustavo Kraemer (BGX/SBBG) - Bagé",
			"Aeroporto Internacional de Pelotas (PET/SBPK) - Pelotas",
			"Aeroporto Internacional Salgado Filho (POA/SBPA) - Porto Alegre",
			"Aeroporto Internacional Rubem Berta (URG/SBUG) - Uruguaiana",
			"Aeroporto Internacional Governador Jorge Teixeira (PVH/SBPV) - Porto Velho",
			"Aeroporto José Coleto (JPR/SBJI) - Ji-Paraná",
			"Aeroporto Internacional de Boa Vista - Atlas Brasil (BVB/SBBV) - Boa Vista",
			"Aeroporto de Caracaraí (**/SBQI) - Caracaraí",
			"Aeroporto Internacional Hercílio Luz (FLN/SBFL) - Florianópolis",
			"Aeroporto Internacional Ministro Victor Konder (NVT/SBNF) - Navegantes",
			"Aeroporto de Jaguaruna (Humberto Ghizzo Bortoluzzi) (JGR/SBJG) - Jaguaruna",
			"Aeroporto Lauro Carneiro de Loyola (JOI/SBJV) - Joinville",
			"Aeroporto de Criciúma (Diomício Freitas) (CCM/SBCM) - Criciúma / Forquilhinha",
			"Aeroporto Campo de Marte (MAE/SBMT) - São Paulo",
			"Aeroporto de Congonhas/São Paulo (CGH/SBSP) - São Paulo",
			"Aeroporto de São José dos Campos (SJK/SBSJ) - São José dos Campos",
			"Aeroporto Internacional de São Paulo-Guarulhos (GRU/SBGR) - Guarulhos / São Paulo",
			"Aeroporto Internacional de Viracopos-Campinas (VCP/SBKP) - Campinas",
			"Aeroporto Internacional de Aracaju (AJU/SBAR) - Aracaju",
			"Aeroporto de Canindé de São Francisco (SNOP) - Canindé de São Francisco",
			"Aeroporto de Palmas (PMW/SBPJ) - Palmas",
			"Aeroporto de Araguaína (IATA/ICAO) - Araguaína"
	};
	
	
	public Voo(){}
	
	public Voo(String numeroVoo, int tripulacao, String saida, String chegada, String dia, String destino, String aeronave)
	{
		this.numeroVoo = numeroVoo;
		this.tripulacao = tripulacao;
		this.saida = saida;
		this.chegada = chegada;
		this.dia = dia;
		this.destino = destino;
		this.aeronave = aeronave;
		
		VooDAO vdao = new VooDAO();
		vdao.InserirVoo(this.numeroVoo, this.tripulacao,this.saida,this.chegada,this.dia,this.destino,this.aeronave);
	}
	
	public String diaSaida()
	{
		VooDAO vdao = new VooDAO();
		
		String diaSaida = vdao.diaSaidaDAO();
		return diaSaida;
	}
	
	public String horaSaida()
	{
		VooDAO vdao = new VooDAO();
		
		String horaSaida = vdao.horaSaidaDAO();
		
		return horaSaida;
	}
	
	public String horaChegada()
	{
		VooDAO vdao = new VooDAO();
		
		String horaChegada = vdao.horaChegadaDAO();
		
		return horaChegada;
	}
	
	public ArrayList destinos()
	{
		VooDAO vdao = new VooDAO();
		voo = vdao.detinosDAO();
		
		return voo;
	}
	
	public String getNumeroVoo()
	{
		String numVoo = null;
		
		VooDAO vdao = new VooDAO();
		numVoo = vdao.numeroVoo();
		
		return numVoo;
	}
	
	public String getNumeroAeronave()
	{
		String numAero = null;
		
		VooDAO vdao = new VooDAO();
		numAero = vdao.numeroAeronave();
		
		return numAero;
	}

	public String[] getAeroportos() 
	{
		return Aeroportos;
	}

	public void setAeroportos(String[] aeroportos) 
	{
		Aeroportos = aeroportos;
	}

	public void setNumeroVoo(String numeroVoo) 
	{
		this.numeroVoo = numeroVoo;
	}

	public String getSaida() 
	{
		return saida;
	}

	public void setSaida(String saida) 
	{
		this.saida = saida;
	}

	public String getChegada() 
	{
		return chegada;
	}

	public void setChegada(String chegada) 
	{
		this.chegada = chegada;
	}

	public String getDia() 
	{
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getDestino() 
	{
		return destino;
	}

	public void setDestino(String destino) 
	{
		this.destino = destino;
	}

	public ArrayList<String> getVoo() {
		return voo;
	}

	public void setVoo(ArrayList<String> voo) {
		this.voo = voo;
	}

}
