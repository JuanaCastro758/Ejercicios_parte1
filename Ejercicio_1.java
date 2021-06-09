import java.util.*;
public class Ejercicio_1{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		double n1,n2,s;
		System.out.print("Ingrese primer numero: ");
		n1=scanner.nextDouble();
		System.out.print("Ingrese segundo numero numero: ");
		n2=scanner.nextDouble();
		s=n1+n2;
		System.out.print("La suma de "+n1+" y "+n2+" es "+s);
	}
}