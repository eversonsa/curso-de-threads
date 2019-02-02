package br.com.alura.banheiro;

public class Limpeza implements Runnable  {

	private Banheiro banheiro;

	public Limpeza(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		while(true) {
			banheiro.limpa();
			banheiro.esperandoTerminarAcao(15000);
		}
				
	}

}
