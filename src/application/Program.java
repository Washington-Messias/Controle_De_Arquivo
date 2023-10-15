package application;

import controlls.ControleArquivos;

public class Program {

	public static void main(String[] args) {
		System.out.println("Iniciando!!!");
		ControleArquivos ctl = new ControleArquivos();
		ctl.busca("/home");
		ctl.listadeDiretorios();
		ctl.quantidade();
	}
}
