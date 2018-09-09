package challenge;

public class State {
	
	double 
	   AC = 152.5, AL = 27.7, AP = 142.8, AM = 1570.7, BA = 564.6, CE = 148.8,
	   DF = 5.8, ES = 46.0, GO = 340.0, MA = 332.0, MT = 903.3, MS = 357.1, MG = 587.5,
	   PA = 1247.6, PB= 56.4, PR = 199.3, PE = 98.3, PI = 251.5, RJ = 43.6, RN = 52.8,
	   RS = 281.7, RO = 237.5, RR= 224.2, SC = 95.3, SP = 248.2, SE = 21.9, TO = 277.6;
	
	String 
		Acre = "Acre", Alagoas = "Alagoas", Amapa = "Amapá", 
		Amazonas = "Amazonas", Bahia = "Bahia", Ceara = "Ceará",
		DistritoFederal = "Distrito Federal", EspiritoSanto = "Espírito Santo", 
		Goias = "Goiás", Maranhao = "Maranhão", MatoGrosso = "Mato Grosso", 
		MatoGrossoDoSul = "Mato Grosso do Sul", MinasGerais = "Minas Gerais",
		Para = "Pará", Paraiba = "Paraíba", Parana = "Paraná", 
		Pernambuco = "Pernambuco", Piaui = "Piauí", RioDeJaneiro = "Rio de Janeiro",
		RioGrandeDoNorte = "Rio Grande do Norte", RioGrandeDoSul = "Rio Grande do Sul", 
		Rondonia = "Rondônia", Roraima = "Roraíma", SantaCatarina = "Santa Catarina", 
		SaoPaulo = "São Paulo", Sergipe = "Sergipe", Tocatins = "Tocatins";

	public String getUf() {
		
		double[] estados = {AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, 
							MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, 
							RS, RO, RR, SC, SP, SE, TO};
	
		for(Double i : estados) {
			System.out.println(i);
		} 
	
		return null;
	}

	public String getName() {
		String[] nomeDosEstados = {Acre, Alagoas, Amapa, Amazonas, Bahia, Ceara, DistritoFederal,
								EspiritoSanto, Goias, Maranhao, MatoGrosso, MatoGrossoDoSul, 
								MinasGerais,Para, Paraiba, Parana, Pernambuco, Piaui, RioDeJaneiro, 
								RioGrandeDoNorte, RioGrandeDoSul, Rondonia, Roraima, 
								SantaCatarina, SaoPaulo, Sergipe, Tocatins};
		
		for(String i : nomeDosEstados) {
			System.out.println(i);
		}
		
		return null;
	}

}
