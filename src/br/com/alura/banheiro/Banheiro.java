package br.com.alura.banheiro;


public class Banheiro {
	
	void fazNumero1() {
		synchronized (this) {
			String nome = Thread.currentThread().getName();
			System.out.println(nome + " Entrando no banheiro");
			System.out.println(nome + " Fazendo chichi");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando as maos");
			System.out.println(nome + " saindo do banheiro");
		}
		
	}

	void fazNumero2() {
		synchronized (this) {
			String nome = Thread.currentThread().getName();
			System.out.println(nome + " Entrando no banheiro");
			System.out.println(nome +  " Fazendo nivel 2");
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(nome +  " dando descarga");
			System.out.println(nome +  " lavando as maos");
			System.out.println(nome +  " saindo do banheiro");
		}
	}
}
