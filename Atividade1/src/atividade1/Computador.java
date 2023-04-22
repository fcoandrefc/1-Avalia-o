package atividade1;

public class Computador {
	
 private boolean ligado;
  
 public Computador(boolean ligado) {
	 
	 this.ligado = ligado;
	 
 }

 public boolean getLigado() {
   return ligado;
 }

 public void setLigado(boolean ligado) {
	this.ligado = ligado;
 }

public void imprimir () {
	
	if (this.ligado == true) {		
		System.out.println("Computador Ligado");
	}else {
		System.out.println("Computador Desligado");
	}
	
}

public void ligar() {
	this.ligado = true;
    imprimir();
}

public void desligar() {
	this.ligado = false;
	imprimir();
}

}
