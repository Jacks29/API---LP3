package src.main.controler;

import java.util.Random;

public class GeraRegradeTres {

	private static double arredondar(double numero) {
		   return Math.round(numero * 100.0)/100.0;
		}
	public String novoCalc(){
		Random gerador = new Random();
		int escolhePergunta = gerador.nextInt(4)+1;
		String pergunta="";
		double a=0;
		double b=0;
		double c=0;
		double d=0;
		double e=0;
		double resposta=0;
		if(escolhePergunta==1) {
			arredondar(a= gerador.nextInt(10)+2);
			arredondar(b= gerador. nextInt(140)+40);
			arredondar(c= gerador. nextInt(140)+40);
			if(b==c) {
				arredondar(c= gerador. nextInt(140)+40);
			}
			pergunta = "Jo�o fez uma viagem em "+a+" horas na velocidade de"+b+" km/h caso ele"
					+ " dirigisse a "+c+" km/h quanto tempo ele demoraria para chegar?";
			a=a*c;
			arredondar(resposta=a/b);
		}
		if(escolhePergunta==2) {
			arredondar(a= gerador.nextInt(10)+2);
			arredondar(c= gerador. nextInt(10)+2);
			arredondar(b= gerador. nextInt(140)+40);
			double produzidoPorFuncionaria;
			arredondar(produzidoPorFuncionaria=b/a);
			produzidoPorFuncionaria= arredondar(produzidoPorFuncionaria/c);
			arredondar(d= gerador.nextInt(10)+2);
			arredondar(e= gerador.nextInt(60)+50);
			//arredondar(e=resposta*d*produzidoPorFuncionaria);
			resposta= arredondar(e/d);
			resposta=arredondar(resposta/produzidoPorFuncionaria);
			pergunta ="Uma loja demora "+a+" dias para produzir "+b+" pe�as de "
					+ "roupas com "+c+" costureiras. Caso "+d+" funcion�rias estiverem trabalhando, quantos dias "
					+ "levar� para a produ��o de "+arredondar(e)+" pe�as?";
		}
		if(escolhePergunta==3) {
			arredondar(a= gerador.nextInt(180)+2);
			resposta= a*100000;
			pergunta="Quanto � "+a+"km/h em cm?";
		}
		if(escolhePergunta==4) {
			arredondar(a= gerador.nextInt(20)+5);
			pergunta="Quantos dias tem "+a+" anos?";
			arredondar(resposta= 365*a);
		}
		pergunta= pergunta+"==="+Double.toString(arredondar(resposta));
		return pergunta;
	}

}
