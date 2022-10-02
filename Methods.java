package Project;

public class Methods {
	    // Creating and instantiating an object
	    Arconditioning function = new Arconditioning(); 
		
	    private Boolean OnOff = false;

		// Methods

		// On Off
		public void OnOff() {
			if (OnOff == false) 
			{
				OnOff = true;
				System.out.println("Ar Ligado\n");
			}
			
			else 
			{
				OnOff = false;
				System.out.println("Ar Desligado\n");
			}
		}

		// Operation mode
		public void ModeOp() {
			if (OnOff == false) 
			{
				System.out.println("Ar Desligado\n");
			} 
			else if (function.getModeOp() == "Refrigeration") 
			{
				function.setModeOp("Heat");
				System.out.println("Modo Aqueçer\n");
			}
			else if (function.getModeOp() == "Heat") 
			{
				function.setModeOp("Dehumidify");
				System.out.println("Modo Desumidificar\n");
			}
			else if (function.getModeOp() == "Dehumidify") 
			{
				function.setModeOp("Ventilate");
				System.out.println("Modo Ventilar\n");
			}
			else if (function.getModeOp() == "Ventilate") 
			{
				function.setModeOp("Refrigeration");
				System.out.println("Modo Refrigeração\n");
			}
		}

		// Increase temperature
		public void Increase() {
			if (OnOff == false) 
			{
				System.out.println("Arcondicionado Desligado\n");
			}
			else if (function.getTemperature() < 30 && function.getModeOp() == "Refrigeration") 
			{
				function.setTemperature(function.getTemperature() + 1);
				System.out.println("tempertura atual: " + function.getTemperature() + "\n");
			}
			else if (function.getTemperature() < 30 && function.getModeOp() == "Heat") 
			{
				function.setTemperature(function.getTemperature() + 1);
				System.out.println("tempertura atual: " + function.getTemperature() + "\n");
			} 
			else 
			{
				System.out.println("Este modo não opera temperatura \n" + "Ou a temperatura maxima foi atingida. \n");
			}
		}

		// Decrease temperature
		public void Decrease() {
			if (OnOff == false) 
			{
				System.out.println("Arcondicionado Desligado\n");
			}
			else if (function.getTemperature() > 16 && function.getModeOp() == "Refrigeration") 
			{
				function.setTemperature(function.getTemperature() - 1);
				System.out.println("tempertura atual: " + function.getTemperature() + "\n");
			}
			else if (function.getTemperature() > 16 && function.getModeOp() == "Heat") 
			{
				function.setTemperature(function.getTemperature() - 1);
				System.out.println("tempertura atual: " + function.getTemperature() + "\n");
			} 
			else 
			{
				System.out.println("Este modo não opera temperatura \n" + "Ou a temperatura minima foi atingida. \n");
			}
		}

		// Status
		public void Status() {
			if (OnOff == false) 
			{
				System.out.println("Arcondicionado Desligado\n");
			} 
			else 
			{
				function.setBrand("Samsung");
				function.setModel("132022");
				function.setBtus("12.000\n");

				System.out.println("Marca: " + function.getBrand()); // Brand
				System.out.println("Modelo: " + function.getModel()); // Model
				System.out.println("Capacidade Btus : " + function.getBtus()); // BTUS capacity
				System.out.println("Modo de Operação: " + function.getModeOp()); // operation mode
				System.out.println("Temperatura: " + function.getTemperature() + "\n"); // Current temperature
			}
	    }

}


