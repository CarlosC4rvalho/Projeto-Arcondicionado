package page;

public class Arcondicionado {

	//ATRIBUTOS
	private String Marca, Modelo, Btus;
	private int Temperatura = 23;
	private String ModoOp = "Refrigeração";
	
	//GET AND SET
	public String getMarca() {
		return Marca;
	}



	public void setMarca(String marca) {
		Marca = marca;
	}



	public String getModelo() {
		return Modelo;
	}



	public void setModelo(String modelo) {
		Modelo = modelo;
	}



	public String getBtus() {
		return Btus;
	}



	public void setBtus(String btus) {
		Btus = btus;
	}



	public int getTemperatura() {
		return Temperatura;
	}



	public void setTemperatura(int temperatura) {
		Temperatura = temperatura;
	}



	public String getModoOp() {
		return ModoOp;
	}



	public void setModoOp(String modoOp) {
		ModoOp = modoOp;
	}

}		