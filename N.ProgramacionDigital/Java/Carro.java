public class Carro{
	String marca;
	String color;
	Carro(String mrc, String clo){
		marca=mrc;
		color=clo;
	}
	public void estacionado(){
		System.out.println("el carro de la  "+marca+" de color "+color+" esta estacionado");
	}
	public void circulando(){
		System.out.println("el carro de la "+marca+" de color "+color+" esta circulando");
	}
}