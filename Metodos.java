package page;

public class Metodos extends Arcondicionado {
	   
	    Boolean LigadoDesligado = false;
	
	    //CRIANDO E INSTANCIANDO UM OBJETO
		Arcondicionado f = new Arcondicionado();
		int i;
		
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
		    else if(f.getModoOp() == "Refrigeração")
		    {
		    	f.setModoOp("Aquecer");
		    	System.out.println("Modo Aqueçer\n");
		    }
		    
		    else if(f.getModoOp() == "Aquecer")
		    {
		    	f.setModoOp("Desumidificar");
		    	System.out.println("Modo Desumidificar\n");
		    }
		    
		    else if(f.getModoOp() == "Desumidificar")
		    {
		    	f.setModoOp("Ventilar");
		    	System.out.println("Modo Ventilar\n");
		    }
		    
		    else if(f.getModoOp() == "Ventilar")
		    {
		    	f.setModoOp("Refrigeração");
		    	System.out.println("Modo Refrigeração\n");
		    }
		
		}
		
		//AUMENTAR TEMPERATURA
		public void Aumentar() {
			if(LigadoDesligado == false)
			{
				System.out.println("Arcondicionado Desligado\n");
			}
			
			else if(f.getTemperatura()<30 && f.getModoOp() == "Refrigeração")
			{
				f.setTemperatura(f.getTemperatura()+1);
				System.out.println("tempertura atual: " +f.getTemperatura()+"\n");
			}
			
			else if(f.getTemperatura()<30 && f.getModoOp() == "Aqueçer")
			{
				f.setTemperatura(f.getTemperatura()+1);
				System.out.println("tempertura atual: " +f.getTemperatura()+"\n");
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
			
			else if(f.getTemperatura()>16 && f.getModoOp() == "Refrigeração")
			{
				f.setTemperatura(f.getTemperatura()-1);
				System.out.println("tempertura atual: " +f.getTemperatura()+"\n");
			}
			
			else if(f.getTemperatura()>16 && f.getModoOp() == "Aqueçer")
			{
				f.setTemperatura(f.getTemperatura()-1);
				System.out.println("tempertura atual: " +f.getTemperatura()+"\n");
			}
			else
			{
				System.out.println("Este modo não opera temperatura \n" + "Ou a temperatura maxima foi atingida. \n" );
			}
		}
		
		//STATUS
		public void Status() {
			if(LigadoDesligado == false)
			{
				System.out.println("Arcondicionado Desligado\n");
			}
			else 
			{
				
			f.setMarca("Samsung"); 
			f.setModelo("132022");
			f.setBtus("12.000\n");
			
			System.out.println("Marca: " +f.getMarca()); //MARCA
			System.out.println("Modelo: " +f.getModelo()); //MODELO
			System.out.println("Capacidade Btus : " +f.getBtus()); //BTUS
			System.out.println("Modo de Operação: " +f.getModoOp()); //MODO DE OPERAÇÃO
			System.out.println("Temperatura: " +f.getTemperatura()+"\n"); //TEMPERATURA ATUAL
			}
		} 
		
}
