package br.com.alura.exercicio;

public class Exer1 implements Runnable {
	
	Thread tr1 = Thread.currentThread();
	Long id = tr1.getId();

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Id da Thread: " + id + i);
		}
	}

}
