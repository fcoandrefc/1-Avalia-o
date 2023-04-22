package atividade1;

import java.util.Scanner;

public class SistemaComputador {
	
	public static void main(String[] args) {
		
	int Comando;
			
	  Computador computador = new Computador(true);
	  	  
	  computador.setLigado(false);
	  
	  Scanner entrada = new Scanner(System.in);
	  
	  System.out.println("1 - LIGAR | 2 - DESLIGAR | 3- IMPRIMIR | 4 - FINALIZAR");
	  System.out.println("=======================================================");
	  
	 do {  
	  
	    Comando = entrada.nextInt();
	  
	    switch (Comando) {
	     
	     case 1: 
	    	
	    	 computador.ligar();
	    	 break;
	    	 
	     case 2:
	        computador.desligar();
	        break;
	    
	     case 3:
	    	
	    	computador.imprimir();
	    	break;
	    	
	     case 4 :
	    	break;
	    
	     default:
	    	 
	        System.out.println("Opção Invalida!!");
	        break;
		   
	    }
	    
	    
	 } while (Comando != 4);
		   
	       
	  entrada.close();
	 
	}

}
