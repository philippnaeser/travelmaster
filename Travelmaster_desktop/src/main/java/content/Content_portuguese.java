package content;

import java.util.HashMap;

/*
 * Content f�r Portugiesisch, fuellt die Inhalte in eine Hashmap und gibt diese bei Bedarf aus.
 */
public class Content_portuguese {
HashMap<Integer, String> map;
	
	public Content_portuguese(){
		map = new HashMap<Integer, String>();
		createmap();
	}
	
	public HashMap<Integer, String> getMap(){
		return map;
	}
	
	private void createmap(){
		map.put(1, "Eu gostava/N�s gost�vamos de fazer uma reservar para uma mesa para duas,tr�s,quatro pessoas.");
		map.put(2, "Eu reservei/N�s reservamos uma mesa para duas/tr�s/quatro pessoas no nome [�].");
		map.put(3, "Ainda t�m uma mesa livre?");
		map.put(4, "A ementa/O menu se faz favor.");
		map.put(5, "Qual � a sua recomenda?");
		map.put(6, "Eu gostava/N�s gost�vamos de fazer o pedido.");
		map.put(7, "Podia-me/nos trazer mais pao se faz favor.");
		map.put(8, "Podia-me/nos trazer sal e pimenta se faz favor.");
		map.put(9, "Eu preciso/N�s precisamos ainda um prato,uma colher,um garfo e uma faca se faz favor.");
		map.put(10, "Podia-me/nos trazer uma garrafa de agua se faz favor.");
		map.put(11, "A onde a que � a casa-de-banho?");
		map.put(12, "A conta se faz favor.");
		map.put(13, "A comida estava muito gostosa.");
		map.put(14, "A comida estava boa.");
		map.put(15, "Desculpa-me mas a comida n�o soube bem.");
		map.put(16, "Esta certo.");
		map.put(17, "Eu reservei/N�s reservamos um quarto no nome [�].");
		map.put(18, "Eu gostava/N�s gost�vamos de reservar um quarto individual/duplo.");
		map.put(19, "Podia-me/nos dar uma visao geral de todas actividades do hotel?");
		map.put(20, "Podia-me/nos encomendar um taxi para o centro da cidade?");
		map.put(21, "Eu perdi/N�s perdemos a minha/nossa carta do quarto. Podia-me/nos dar uma nova?");
		map.put(22, "Eu gostava/N�s gost�vamos de reservar o quarto para mais uma/duas ou tr�s noite/s.");
		map.put(23, "Esquerda");
		map.put(24, "Direita");
		map.put(25, "Em frente");
		map.put(26, "A segunda � esquerda/direita.");
		map.put(27, "Eu procuro/N�s procuramos a esta��o de comboio/autocarro.");
		map.put(28, "Qual � o melhor caminho para a praia?");
		map.put(29, "Dois bilhetes se faz favor.");
		map.put(30, "Autocarro");
		map.put(31, "Taxi");
		map.put(32, "El�ctrico");
		map.put(33, "A onde a que eu encontro/n�s encontramos�");
		map.put(34, "Dois bilhetes para [..] se faz favor.");
		map.put(35, "Qual s�o os clubes mais populares?");
		map.put(36, "A onde a que se pode festejar aqui melhor?");
		map.put(37, "A onde a que se pode encontrar aqui pessoas simp�ticas ?");
		map.put(38, "A onde a que eu encontro um bom bar?");
		map.put(39, "Praia");
		map.put(40, "Mar");
		map.put(41, "Espregui�adeira");
		map.put(42, "Guarda-Sol");
		map.put(43, "Eu gostava/N�s gost�vamos de alugar duas espregui�adeiras.");
		map.put(44, "Eu gostava/N�s gost�vamos de participar num curso de surf.");
		map.put(45, "Socorro!");
		map.put(46, "Nadador-Salvador");
		map.put(47, "Eu preciso/N�s precisamos de um medico.");
		map.put(48, "Chame por favor uma ambul�ncia.");
		map.put(49, "Eu sou allergica a");
		map.put(50, "A onde a que eu encontro/n�s encontramos uma farm�cia?");
		map.put(51, "Chame por favor a policia.");
		map.put(52, "Eu fui/N�s fomos roubados.");
		map.put(53, "Eu gostava/N�s gost�vamos de alugar um carro.");
		map.put(54, "Podia-mos dar uma vista de olhos outra vez nos estragos do carro se faz favor?");
		map.put(55, "Gasolina");
		map.put(56, "Gasoleo");
		map.put(57, "Ol�, eu sou o/a [...].");
		map.put(58, "Ol�, meu nome � [...].");
		map.put(59, "Muito gosto de conhecer-te.");
		map.put(60, "Tenho [...] anos.");
		map.put(61, "Sou/somos da Alemanha.");
		map.put(62, "Como est�s?");
		map.put(63, "Estou/estamos bem.");
		map.put(64, "Que tempo t�o lindo.");
		map.put(65, "Tens fogo?");
		map.put(66, "Campeonato do Mundo");
		map.put(67, "Campeonato da Europa");
		map.put(68, "Jogos ol�mpicos");
		map.put(69, "T�nis");
		map.put(70, "Golf");
		map.put(71, "Basketbol");
		map.put(72, "Andebol");
		map.put(73, "Futebol");
		map.put(74, "Est�dio");
		map.put(75, "Sou um grande f� de [...].");
		map.put(76, "Minha equipa favorita � [...].");
		map.put(77, "fome");
		map.put(78, "sede");
		map.put(79, "bomba de gasolina");
		map.put(80, "dinheiro");
		map.put(81, "obrigado");
		map.put(82, "por favor");
		map.put(83, "Ol�");
		map.put(84, "Adeus");
		map.put(85, "Bom dia");
		map.put(86, "Boa tarde");
		map.put(87, "Boa noite");
		map.put(88, "Boa noite ");
		map.put(89, "restaurante");
		map.put(90, "h�tel");
		map.put(91, "aeroporto");
		map.put(92, "transporte");
		map.put(93, "mercado");
		map.put(94, "cigarro");
		map.put(95, "esqueiro");
		map.put(96, "cerveja");
		map.put(97, "vinho");
		map.put(98, "�gua");
		map.put(99, "g�lo/gelado");
		
	}


}
