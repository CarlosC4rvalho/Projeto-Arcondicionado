package page;

public class Metodos {

	    //CRIANDO E INSTANCIANDO UM OBJETO
		Arcondicionado f = new Arcondicionado();
		int i;
		
		//METODOS
		
		//LIGAR E DESLIGAR 
		public void LigarDesligar() {
			for(i=0; i==1; i++)
			{
				f.setModoOp(f.getRefrigerar());
			}
		}
		
		//MUDAR OPERAÇÃO
		public void ModoOp() {
			
		}
		
		//AUMENTAR TEMPERATURA
		public void Aumentar() {
			if(f.getTemperatura()<30)
			{
				f.setTemperatura(f.getTemperatura()+1);
				System.out.println("tempertura atual: " +f.getTemperatura());
			}
		}
		
		//DIMUNUIR TEMPERATURA
		public void dimunuir() {
			if(f.getTemperatura()<30)
			{
				f.setTemperatura(f.getTemperatura()-1);
				System.out.println("tempertura atual: " +f.getTemperatura());
			}
		}
		
		//STATUS
		public void Status() {
			
			f.setMarca("Samsung"); 
			f.setModelo("132022");
			f.setBtus("12.000");
			
			System.out.println("Marca: " +f.getMarca()); //MARCA
			System.out.println("Modelo: " +f.getModelo()); //MODELO
			System.out.println("Btus: " +f.getBtus()); //BTUS
			System.out.println("Modo: " +f.getModoOp()); //MODO DE OPERAÇÃO
			System.out.println("Temperatura: " +f.getTemperatura()); //TEMPERATURA ATUAL
		}
		
		//MODOS 
		
		//REFRIGERAR
		public void 
		
}
