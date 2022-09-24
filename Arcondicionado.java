package page;

public class Arcondicionado {

	//ATRIBUTOS
	private String Marca;
	private String Modelo;
	private String Btus;
	private Double temperatura = 23.0;
	private String ModoOp;
	private String refrigerar;
	

	//GET AND SET
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String ma) {
		this.Marca = ma;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String m) {
		this.Modelo = m;
	}
	public String getBtus() {
		return Btus;
	}
	public void setBtus(String btus) {
		this.Btus = btus;
	}
	public Double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Double t) {
		this.temperatura = t;
	}
	public String getModoOp() {
		return ModoOp;
	}
	public void setModoOp(String mdp) {
		this.ModoOp = mdp;
	}
	public String getRefrigerar() {
		return refrigerar;
	}
	public void setRefrigerar(String ref) {
		this.refrigerar = ref;
	}
	
}
