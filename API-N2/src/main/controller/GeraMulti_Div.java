package src.main.controler;

import java.util.Random;

public class GeraMulti_Div {
	private static double arredondar(double numero) {
		   return Math.round(numero * 100.0)/100.0;
		}
	public String novoCalc() {
		Random gerador = new Random();
		double a=0;
		double b=0;
		double c=0;		
		double d=0;
		int numeros =2;
		double resultado=0;
		String primeiroSinal="";
		String segundoSinal="";
		String terceiroSinal="";
		a= arredondar(gerador.nextDouble() * gerador.nextInt(1000));
		b= arredondar(gerador.nextDouble() * gerador.nextInt(1000));
		String validaSinal="";
		int multi_divi = gerador.nextInt(2)+1;
		if(multi_divi==1) {
			resultado = a*b;
			primeiroSinal="X";
		}
		else {
			resultado = a/b;
			primeiroSinal="/";
		}
		int maisCampos=gerador.nextInt(2)+1;
		if(maisCampos == 1) {
			c= arredondar(gerador.nextDouble() * gerador.nextInt(1000));
			numeros= numeros+1;
			multi_divi = gerador.nextInt(2)+1;
			if(multi_divi==1) {
				resultado = resultado*c;
				segundoSinal="X";
			}
			else {
				resultado = resultado/c;
				segundoSinal="/";
			}
			maisCampos=gerador.nextInt(2)+1;
			if(maisCampos == 1) {
				d= arredondar(gerador.nextDouble() * gerador.nextInt(1000));
				numeros= numeros+1;
				multi_divi = gerador.nextInt(2)+1;
				if(multi_divi==1) {
					resultado = resultado*d;
					terceiroSinal="X";
				}
				else {
					resultado = resultado/d;
					terceiroSinal="/";
				}
			}
		}
		String pergunta="";
		if(numeros==4) {
			pergunta = Double.toString(a)+" "+ primeiroSinal+" "+Double.toString(b)+" "+
					segundoSinal+" "+Double.toString(c)+" "+terceiroSinal+" "+Double.toString(d);
		}
		if(numeros==3) {
			pergunta = Double.toString(a)+" "+ primeiroSinal+" "+Double.toString(b)+" "+
					segundoSinal+" "+Double.toString(c);
		}
		if(numeros==2) {
			pergunta = Double.toString(a)+" "+ primeiroSinal+" "+Double.toString(b);
		}
		pergunta = pergunta +"==="+ Double.toString(arredondar(resultado));
		return pergunta;
		
	}
}
