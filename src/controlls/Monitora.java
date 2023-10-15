package controlls;

import java.util.ArrayList;

import models.entities.Arquivos;

public class Monitora {
private Integer qtd;
ArrayList<Arquivos> arquivos = new ArrayList<>();


 public Monitora() {
	
}
 
 public void comparacao(ControleArquivos arqv) {
	 if(arqv.getQtd() == this.getQtd()) {
		 System.out.println("Sistema está estavél!!!");
	 }else {
		 System.out.println("Sistema instavél!!");
	 }
 }

public Integer getQtd() {
	return qtd;
}

public void setQtd(Integer qtd) {
	this.qtd = qtd;
}
 
 
}
