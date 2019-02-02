package br.com.alura.banheiro;


public class Banheiro {
	
	private boolean ehSujo = true;
	
	void fazNumero1() {
		synchronized (this) {
			String nome = Thread.currentThread().getName();
			System.out.println(nome + " Entrando no banheiro");
			
			while(ehSujo) {
				esperaLaFopra(nome);
			}
			
			System.out.println(nome + " Fazendo chichi");
			esperandoTerminarAcao(4000);
			
			this.ehSujo = true;
			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando as maos");
			System.out.println(nome + " saindo do banheiro");
		}
		
	}

	public void esperandoTerminarAcao(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	void fazNumero2() {
		synchronized (this) {
			String nome = Thread.currentThread().getName();
			System.out.println(nome + " Entrando no banheiro");
			
			while(ehSujo) {
				esperaLaFopra(nome);
			}
			
			System.out.println(nome +  " Fazendo nivel 2");
			
			esperandoTerminarAcao(8000);
			this.ehSujo = true;
			System.out.println(nome +  " dando descarga");
			System.out.println(nome +  " lavando as maos");
			System.out.println(nome +  " saindo do banheiro");
		}
	}
	
	public void limpa() {

	    String nome = Thread.currentThread().getName();

	    System.out.println(nome + " batendo na porta");

	    synchronized (this) {

	        System.out.println(nome + " entrando no banheiro");

	        if (!this.ehSujo) {
	            System.out.println(nome + ", não está sujo, vou sair");
	            return;
	        }

	        System.out.println(nome + " limpando o banheiro");
	        this.ehSujo = false;

	        try {
	            Thread.sleep(13000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        this.notifyAll();

	        System.out.println(nome + " saindo do banheiro");
	    }
	}
	
	public void esperaLaFopra(String nome) {
		System.out.println(nome + " Eca banheiro esta sujo, vou sair");
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
