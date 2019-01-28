package br.com.alura.threads;

public class TesteThreads {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("isso eh uma threads");
		
		Thread.sleep(5000);
		
		System.out.println("voltei depois de 5 segundos");
	}
}
