import java.util.*;
public class Ejercicio_8{
	public static void main(String[] args){
		float n1,n2,n3,p;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Ingresa tres numeros: ");
		n1=scanner.nextFloat();
		n2=scanner.nextFloat();		
		n3=scanner.nextFloat();
		p=(n1+n2+n3)/3;
		System.out.println("El promedio de los tres numeros ingresados es: "+p);
	}
}