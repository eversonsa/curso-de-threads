package br.com.alura.banheiro;

public class Principal {
	
	public static void main(String[] args) {
		Banheiro banheiro = new Banheiro();
		
		Thread tr1 = new Thread(new Tarefa1(banheiro), "João");
		Thread tr2 = new Thread(new Tarefa2(banheiro), "ana");
		Thread limpeza = new Thread(new Limpeza(banheiro), "Limpeza");
		limpeza.setDaemon(true);
		
		tr2.start();
		limpeza.start();
		tr1.start();
	}
}
