package br.com.alura.ordem;

public class TesteExecucao {
	
	public static void main(String[] args) {
		String nome = "John";
		Thread thread1 = new Thread(new ExecucaoEOrdemDeThread("assinaturas1.txt", nome));
		Thread thread2 = new Thread(new ExecucaoEOrdemDeThread("assinaturas2.txt", nome));
		Thread thread3 = new Thread(new ExecucaoEOrdemDeThread("autores.txt", nome));
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
