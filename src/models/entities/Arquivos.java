package models.entities;

public class Arquivos {
	private String nome;
	private String path;
	
	public Arquivos() {
		// TODO Auto-generated constructor stub
	}
	
	public Arquivos(String nome, String path) {
		this.nome = nome;
		this.path = path;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
