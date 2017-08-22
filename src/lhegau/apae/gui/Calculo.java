package lhegau.apae.gui;

import java.util.ArrayList;
import java.util.List;

public class Calculo{
	
	
	//Este método vai verificar a operação da calculadora
	private boolean isOperador(char operacao){
		boolean v = false;
		if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/'){
			v = true;
		}
		return v;
	}
	
	private List<Character> capturarOperador(String expressao){
		List<Character> listaOperador = new ArrayList<Character>();
		for (int cc = 0; cc < expressao.length(); cc++){
			if(isOperador(expressao.charAt(cc))){
				listaOperador.add(new Character(expressao.charAt(cc)));
			}
		}
		return listaOperador;	
	}
	
	private List<Double> capturarNumeros(String expressao){
		List<Double> listaNumeros = new ArrayList<Double>();
		String x = "";//Números que são Strings mas serão convertidos para Double
		Double n, y;
		for(int cc = 0; cc < expressao.length(); cc++){
			if (isOperador(expressao.charAt(cc))){
				n = Double.valueOf(x);
				listaNumeros.add(n);
				x = "";
			}else{
				x = x.concat("" + expressao.charAt(cc));
			}
		}
		if(!x.isEmpty()){
			n = Double.valueOf(x);
			listaNumeros.add(n);
		}
		return listaNumeros;
	}
	
	private double exeOperacao(double n1, char operador, double n2){
		double r = 0.0;
		if(operador == '+'){r = n1 + n2;}
		else if(operador == '-'){r = n1 - n2;}
		else if(operador == '*'){r = n1 * n2;}
		else if(operador == '/'){r = n1 / n2;}
		
		return r;
	}

	private String calcValor(List<Double> listaN, List<Character> listaO){
		String r = "";
		double t = 0, n1, n2;
		int j = 0;
		char o;
		for (int cc = 0; cc < listaN.size()-1; cc++){
			if(t ==0){
				n1 = listaN.get(cc).doubleValue();
				n2 = listaN.get(cc + 1).doubleValue();
				o = listaO.get(cc).charValue();
				t = exeOperacao(n1, o, n2);
			}
		}
		r = "" + t;
		return r;
	}
	
	public String calc(String exp){
		String r;
		List<Double> listaN = new ArrayList<Double>();
		List<Character> listaO = new ArrayList<Character>();
		
		listaN = capturarNumeros(exp);
		listaO = capturarOperador(exp);
		
		r = calcValor(listaN, listaO);
		
		return r;
	}
	
}
