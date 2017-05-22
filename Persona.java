package ejercicio8;
import java.util.Scanner;

class Persona {
	protected Scanner teclado;
	protected String nombre;
	protected int edad;
	
	public static void main(String[]ar){
		Emple empleado1=new Emple();
		empleado1.ingDatos();
		empleado1.ingDatosEmp();
		empleado1.impPers();
		empleado1.impEmp();
		
		
	}
	public Persona(){
		teclado=new Scanner(System.in);
	}
	
	public void ingDatos(){

		System.out.print("Ingrese su nombre:");
		nombre=teclado.nextLine();
		System.out.print("Ingrese su edad:");
		edad=teclado.nextInt();

	}

	 public void impPers(){
		System.out.print("El nombre ingresado es:"+nombre+"\n");
		System.out.print("La edad ingresada es"+edad+"\n");
	}
}


class Emple extends Persona {
	protected int sueldo;
	public void ingDatosEmp(){
		System.out.print("Ingrese su sueldo:");
		sueldo=teclado.nextInt();
		}
	public void impEmp(){
		System.out.print("El sueldo ingresado es:"+sueldo);
	}

}
