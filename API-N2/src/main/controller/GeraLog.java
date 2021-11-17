package src.main.controler;

import java.util.Random;

public class GeraLog {
	private static double arredondar(double numero) {
		   return Math.round(numero * 100.0)/100.0;
		}
	public String novoCalc() {
		Random gerador = new Random();
		String pergunta="";
		double a=0;
		double b=0;
		double resposta=0;
		a= arredondar(gerador.nextDouble() * gerador.nextInt(30)+15);
		resposta= arredondar(gerador.nextInt(15)+1);
		b= arredondar(Math.pow(a,resposta));
		pergunta= "Qual será o valor do logaritmo que possui a base "+a+" e o logari"
				+ "tmando igual a "+b+" ?";
		
		pergunta=pergunta+"==="+Double.toString(resposta);
		return pergunta;
	}
}
