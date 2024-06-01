package edu.desafio.controleFluxo;

public class ParametrosInvalidosException extends Exception{
	
	private int codigoErro;
	
	public ParametrosInvalidosException(String message) {
		super(message);
		this.codigoErro = codigoErro;
	}
	
	public int getCodigoErro() {
		return codigoErro;
	}
	
	public void setCodigoErro(int codigoErro) {
		this.codigoErro = codigoErro;
	}

}
