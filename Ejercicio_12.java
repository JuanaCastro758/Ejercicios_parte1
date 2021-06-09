import java.util.*;
public class Ejercicio_12{
	public static void main(String[] args){
		double c,f;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Ingresa la temperatura en Celsius: ");
		c=scanner.nextDouble();
		f=(c*1.8)+32.0;
		System.out.println("La temperaturaen Fahrenheit es: "+f);
	}
}