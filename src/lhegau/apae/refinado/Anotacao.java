package lhegau.apae.refinado;

import java.io.Serializable;

@Cabecalho(
		instituicao = "APAE",
		projeto = "Peru",
		dataDeCriacao = "13/04/2016",
		criador = "Pb",
		revisao = 2
		)
@ErrosCorrigidos(erros = {"0001" , "0002"})

@SuppressWarnings({"serial", "unused"})
public class Anotacao implements Serializable{
	
	private int x;

	@Deprecated
	public void anotar(){}
	
	@Override
	public String toString(){
		return null;
	}
	
	
}
