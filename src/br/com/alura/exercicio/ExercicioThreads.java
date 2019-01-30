package br.com.alura.exercicio;

public class ExercicioThreads {
	
	public static void main(String[] args) {
		
		Thread tr1 = new Thread(new Exer1());
		Thread tr2 = new Thread(new Exer2());
		
		tr1.start();
		tr2.start();
	}
}
