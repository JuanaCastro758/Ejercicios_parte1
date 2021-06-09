import java.util.*;
public class Ejercicio_7{
	public static void main(String[] args){
		double n;
		double p;
		n=(Math.random()*200);
		System.out.println("El numero es: "+n);
		p=n-((15*n)/100);
		System.out.println("Disminuido un 15 porciento es: "+p);
	}
}