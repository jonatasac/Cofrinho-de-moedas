//Aluno: Jonatas Aguiar Canuto
//RU: 4322633
//Trabalho de Programação Orientada a Objetos
//Cofrinho de Moedas

package Uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); //permite que o usuario entre com os dados
		int opcao,tipoMoeda;
		double valor;
		Moeda m;
		Cofrinho cofrinho = new Cofrinho(); //Inicia uma lista cofrinho
		
		System.out.println("Seja Bem-Vindo ao Cofrinho de Moedas do Jonatas\n");
		System.out.println("**** Menu ****");
		System.out.println("1-Adicionar Moedas");
		System.out.println("2-Remover Moedas");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Total de Moedas");
		System.out.println("0-Encerrar");
		opcao=teclado.nextInt();
		
		while(opcao!=0) {
			switch(opcao) {
			case 1: //Adiciona moeda ao cofrinho
				tipoMoeda=0;
				while(tipoMoeda>3 || tipoMoeda <=0) {
					System.out.println("1-Dolar");
					System.out.println("2-Euro");
					System.out.println("3-Real");
					tipoMoeda = teclado.nextInt();
				}
				m = null;
				if(tipoMoeda == 1) {
					System.out.println("Qual valor deseja inserir em Dolar?");
					valor = teclado.nextDouble();
					m = new Dolar(valor);
				}
				if(tipoMoeda == 2) {
					System.out.println("Qual valor deseja inserir em Euro?");
					valor = teclado.nextDouble();
					m = new Euro(valor);
				}
				if(tipoMoeda == 3) {
					System.out.println("Qual valor deseja inserir em Reais?");
					valor = teclado.nextDouble();
					m = new Real(valor);
				}
				cofrinho.adicionar(m);

				break;
				
			case 2: //Remove moedas exatas que foram adicionadas no cofrinho
				tipoMoeda=0;
				while(tipoMoeda>3 || tipoMoeda <=0) {
					System.out.println("1-Dolar");
					System.out.println("2-Euro");
					System.out.println("3-Real");
					tipoMoeda = teclado.nextInt();
				}
				m = null;
				if(tipoMoeda == 1) {
					System.out.println("Qual valor deseja remover em Dolar?");
					valor = teclado.nextDouble();
					m = new Dolar(valor);
				}
				if(tipoMoeda == 2) {
					System.out.println("Qual valor deseja remover em Euro?");
					valor = teclado.nextDouble();
					m = new Euro(valor);
				}
				if(tipoMoeda == 3) {
					System.out.println("Qual valor deseja remover em Reais?");
					valor = teclado.nextDouble();
					m = new Real(valor);
				}
				cofrinho.remover(m);
				break;
				
			case 3: //Lista as moedas que foram adicionadas no cofrinho
				cofrinho.listagemMoedas();
				break;
				
			case 4: //Converte as moedas adicionadas no cofrinho e reais, soma elas e mostra o total
				cofrinho.totalConvertido();
				break;
				
			default:
				System.out.println("Opcao invalida!");
			}
			System.out.println();
			System.out.println("**** Menu ****");
			System.out.println("1-Adicionar Moedas");
			System.out.println("2-Remover Moedas");
			System.out.println("3-Listar Moedas");
			System.out.println("4-Total de Moedas em Reais");
			System.out.println("0-Encerrar");
			opcao=teclado.nextInt();
		}

	}

}
