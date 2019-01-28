package br.com.alura.threads;

public class StringThread {
	public static void main(String[] args) {
		imprimirString();
	}
	
	static void imprimirString() {
		TestaThreadString tts = new TestaThreadString();
		Thread thrad = new Thread(tts);
		thrad.start();
	}
	
}
