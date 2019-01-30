package br.com.alura.ordem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExecucaoEOrdemDeThread implements Runnable {
	
	String nomeArquivo;
	String nome;
	
	public ExecucaoEOrdemDeThread(String nomeArquivo, String nome) {
		this.nomeArquivo = nomeArquivo;
		this.nome = nome;
	}
	
	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(nomeArquivo));
			int numeroDalinha = 1;
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				if(linha.contains(nome)) {
					System.out.println("NomeArquivo: " + nomeArquivo + numeroDalinha + " Nome: " + linha );
				}
				
				numeroDalinha++;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException("Arquivo nao existe");
		}	
		
	}

}
