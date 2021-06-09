import java.util.*;
public class Ejercicio_3{
	public static void main(String[] args){
		int n,t,d;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Ingresa numero: ");
		n=scanner.nextInt();
		t=n*3;
		d=n*2;
		System.out.println("El doble del numero es "+d);
		System.out.println("El triple del numero es "+t);
	}
}