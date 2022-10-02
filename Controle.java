package page;

import java.util.Scanner;

public class Controle extends Arcondicionado {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Metodos metodo = new Metodos();
		
		Scanner leia = new Scanner(System.in);
		char control;
		
		for(;;)
		{
		System.out.println("Tela Inicial \n");
		
		System.out.println("1 - LigarDesligar");
		System.out.println("2 - ModoOp");
		System.out.println("3 - Status");
		System.out.println("+ - Aumentar");
		System.out.println("- - Diminuir");
		System.out.println("5 - Sair \n");
		
		
		System.out.println("digite uma Opção: \n");
		control = leia.nextLine().charAt(0);
		
		switch (control)
	    {
		
	    case '1': 
	    	
	    	metodo.LigarDesligar();
	    	
	        break;

	        
	    case '2':
	      
	    	metodo.ModoOp();
	    	
	        break;
	        
	        
        case '3':
	    	
        	metodo.Status();
	    	
	    	break;
	    
	        
	    case '+':
	        
	    	metodo.Aumentar();
	    	
	        break;

	        
	     case '-':
	       
	    	 metodo.Diminuir();
	    
	    	break;
	    	
	    
	     case '5':
		       
		    	System.out.println("Saindo...");
		    	System.exit(0);
		    	leia.close();
		    	
            break;
		
	    default:
		       System.out.println("Opção invalida\n");
		  
	    }
	
	}

}
	
}
