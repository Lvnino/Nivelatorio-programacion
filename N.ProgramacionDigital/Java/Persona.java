public class Persona{
	String fecha_nacimiento;
	String nombre;
	Persona(String fecha, String nme){
		fecha_nacimiento=fecha;
		nombre=nme;
	}
	public void respirar(){
		System.out.println("la persona "+nombre+" Nacida el dia "+fecha_nacimiento+" esta respirando");
	}
	public void comer(){
		System.out.println("la persona esta comiendo");
	}
}