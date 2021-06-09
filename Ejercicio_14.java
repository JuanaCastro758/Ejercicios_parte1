import java.util.*;
public class Ejercicio_14{
	public static void main(String[] args){
		double n1,n2;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Ingresa primer numero: ");
		n1=scanner.nextDouble();
		System.out.print("Ingresa segundo numero: ");
		n2=scanner.nextDouble();
		if (n2 % n1==0){
			System.out.println("Es divisible");
		}else{
			System.out.println("No es divisible");
		}
	}
}