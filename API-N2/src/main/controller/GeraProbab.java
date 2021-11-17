package src.main.controler;

import java.util.Random;

public class GeraProbab {
	private static double arredondar(double numero) {
		   return Math.round(numero * 100.0)/100.0;
		}
	public String novoCalc() {
		Random gerador = new Random();
		double a= arredondar(gerador.nextInt(18)+2);
		int b=0;
		int escolheDado = gerador.nextInt(6)+1;
		double resposta=0;
		String pergunta="";
		if(escolheDado==1) {
			a=4;
		}
		if(escolheDado==2) {
			a=6;
		}
		if(escolheDado==3) {
			a=8;
		}
		if(escolheDado==4) {
			a=10;
		}
		if(escolheDado==5) {
			a=12;
		}
		if(escolheDado==6) {
			a=20;
		}
		double ajudaCalc=0;
		int selecionaPergunta= gerador.nextInt(3)+1;
		if(selecionaPergunta==1) {
			pergunta="Qual é a probabilidade de um dado com "+a+" lados"
					+ " caia no com o número 5 virado para cima?";
			resposta=arredondar(1/a);
			resposta=resposta*100;
		}
		if(selecionaPergunta==2) {
			pergunta="Qual é a probabilidade de um dado com "+a+" lados"
					+ " caia no com um número par virado para cima?";
			ajudaCalc=a/2;
			resposta=arredondar(1/ajudaCalc);
			resposta=resposta*100;
		}
		if(selecionaPergunta==3) {
			pergunta="Qual é a probabilidade de um dado com "+a+" lados"
					+ " tenha uma face maior que 6 virado para cima?";
			if(a<=6) {
				resposta=0;
			}
			else {
				resposta=a-6;
				resposta=resposta/a;
				resposta=resposta*100;
			}
		}
		pergunta = pergunta +"==="+ Double.toString(arredondar(resposta))+"%";
		return pergunta;
	}
}
