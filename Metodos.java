package page;

public class Metodos extends Arcondicionado {
	   
	    Boolean LigadoDesligado = false;
	
	    //CRIANDO E INSTANCIANDO UM OBJETO
		Arcondicionado function = new Arcondicionado();
		
		//METODOS
		
		//LIGAR E DESLIGAR 
		public void LigarDesligar() {
			
			if (LigadoDesligado == false)
			{
				LigadoDesligado = true;
				System.out.println("Ar Ligado\n");
			} 
			else
			{
				LigadoDesligado = false;
				System.out.println("Ar Desligado\n");
		    }
		}
		
		//MODOS DE OPERAÇÃO
		public void ModoOp() {
		    if(LigadoDesligado == false)
		    {
		    	System.out.println("Ar Desligado\n");
		    }    
		    else if(function.getModoOp() == "Refrigeracao")
		    {
		    	function.setModoOp("Aquecer");
		    	System.out.println("Modo Aqueçer\n");
		    }
		    
		    else if(function.getModoOp() == "Aquecer")
		    {
		    	function.setModoOp("Desumidificar");
		    	System.out.println("Modo Desumidificar\n");
		    }
		    
		    else if(function.getModoOp() == "Desumidificar")
		    {
		    	function.setModoOp("Ventilar");
		    	System.out.println("Modo Ventilar\n");
		    }
		    
		    else if(function.getModoOp() == "Ventilar")
		    {
		    	function.setModoOp("Refrigeracao");
		    	System.out.println("Modo Refrigeração\n");
		    }
		
		}
		
		//AUMENTAR TEMPERATURA
		public void Aumentar() {
			if(LigadoDesligado == false)
			{
				System.out.println("Arcondicionado Desligado\n");
			}
			
			else if(function.getTemperatura()<30 && function.getModoOp() == "Refrigeracao")
			{
				function.setTemperatura(function.getTemperatura()+1);
				System.out.println("tempertura atual: " +function.getTemperatura()+"\n");
			}
			
			else if(function.getTemperatura()<30 && function.getModoOp() == "Aquecer")
			{
				function.setTemperatura(function.getTemperatura()+1);
				System.out.println("tempertura atual: " +function.getTemperatura()+"\n");
			}
			else
			{
				System.out.println("Este modo não opera temperatura \n" + "Ou a temperatura maxima foi atingida. \n");
			}
		}
		
		//DIMUNUIR TEMPERATURA
		public void Diminuir() {
			if(LigadoDesligado == false)
			{
				System.out.println("Arcondicionado Desligado\n");
			}
			
			else if(function.getTemperatura()>16 && function.getModoOp() == "Refrigeracao")
			{
				function.setTemperatura(function.getTemperatura()-1);
				System.out.println("tempertura atual: " +function.getTemperatura()+"\n");
			}
			
			else if(function.getTemperatura()>16 && function.getModoOp() == "Aquecer")
			{
				function.setTemperatura(function.getTemperatura()-1);
				System.out.println("tempertura atual: " +function.getTemperatura()+"\n");
			}
			else
			{
				System.out.println("Este modo não opera temperatura \n" + "Ou a temperatura minima foi atingida. \n" );
			}
		}
		
		//EXIBIR STATUS
		public void Status() {
			if(LigadoDesligado == false)
			{
				System.out.println("Arcondicionado Desligado\n");
			}
			else 
			{
				
				function.setMarca("Samsung"); 
				function.setModelo("132022");
				function.setBtus("12.000\n");
			
			System.out.println("Marca: " +function.getMarca()); //MARCA
			System.out.println("Modelo: " +function.getModelo()); //MODELO
			System.out.println("Capacidade Btus : " +function.getBtus()); //BTUS
			System.out.println("Modo de Operação: " +function.getModoOp()); //MODO DE OPERAÇÃO
			System.out.println("Temperatura: " +function.getTemperatura()+"\n"); //TEMPERATURA ATUAL
			}
		} 
		
}
