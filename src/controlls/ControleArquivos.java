package controlls;

import java.io.File;
import java.util.ArrayList;
import models.entities.Arquivos;

public class ControleArquivos {
	private Integer qtd;
	ArrayList<Arquivos> arquivos = new ArrayList<>();

	public ControleArquivos() {

	}

	public ControleArquivos(int qtd) {
		this.qtd = qtd;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	/*
	 * Um método recursivo que tem como objetivo listar todos os arquivos e seus
	 * nomes para que se tenha controle dos arquivos do seu sistema!!!
	 */
	public void busca(String path) {

		File file = new File(path);
		if (file.exists() && file.isDirectory()) {
			System.out.println("Nome do diretorio: " + file.getName() + " Nome do caminho:  " + file.getPath());
			String[] lista = file.list();
			if (lista == null) {

			} else {
				for (int i = 0; i <= lista.length - 1; i++) {
					System.out.println("nome do arquivo: " + lista[i].toString());
					String path2 = file.getPath() + "/" + lista[i].toString();
					if (arquivos.contains(new Arquivos(file.getName(), file.getPath()))) {
						System.out.println("Arquivo já existe!");
					} else {
						File fl = new File(path2);
						if (fl.isDirectory()) {
							Arquivos arqv = new Arquivos(fl.getName(), fl.getPath());
							if (arquivos.contains(arqv.getPath())) {
								System.out.println("Arquivo já lido!!");
							} else {
								arquivos.add(arqv);
							}
							this.busca(path2);
						}
					}
				}
			}
		}
	}

	public void listadeDiretorios() {
		arquivos.forEach(a -> System.out.println("Nome do diretorio: " + a.getNome() + " Caminho: " + a.getPath()));
	}
	
	public void quantidade() {
		System.out.println("Quantidade de arquivos: " + arquivos.size());
	}
}
