package Project;
import java.util.Scanner;

public class Control extends Arconditioning {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Methods methods = new Methods();
			
			Scanner read = new Scanner(System.in);
			char option;
			
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
			option = read.nextLine().charAt(0);
			
			switch (option)
		    {
			
		    case '1': 
		    	
		    	methods.OnOff();
		    	
		        break;

		        
		    case '2':
		      
		    	methods.ModeOp();
		    	
		        break;
		        
		        
	        case '3':
		    	
	        	methods.Status();
		    	
		    	break;
		    
		        
		    case '+':
		        
		    	methods.Increase();
		    	
		        break;

		        
		     case '-':
		       
		    	 methods.Decrease();
		    
		    	break;
		    	
		    
		     case '5':
			       
			    	System.out.println("Saindo.");
			    	System.exit(0);
			    	read.close();
			    	
	            break;
			
		    default:
			       System.out.println("Opção invalida\n");
			  
		    }
		
		}

	}
		
}
