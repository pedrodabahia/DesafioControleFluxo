package edu.desafio.controleFluxo;
import java.util.Scanner;

public class contador {
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		contador validate = new contador();
		System.out.println("Digite aqui o primeiro parametro");
		int primeiroPar = terminal.nextInt();
		
		System.out.println("Digite aqui o segundo parametro");
		int segundoPar = terminal.nextInt();
		
		try {
			validate.contar(primeiroPar, segundoPar);
			
			}catch(ParametrosInvalidosException ex){
				System.out.println(ex.getMessage());
			}
	}
	
	public void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}else {
			for(int i = 0; parametroUm <= parametroDois;i++) {
				System.out.println("Imprimindo o número "+i);
				parametroUm++;
			}
		}

}
}