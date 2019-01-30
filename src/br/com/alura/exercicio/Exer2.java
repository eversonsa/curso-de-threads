package br.com.alura.exercicio;

public class Exer2 implements Runnable {
	
	Thread tr2 = Thread.currentThread();
	Long id2 = tr2.getId();

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Id da Thread: " + id2 + i);
		}
	}

}
