import java.util.*;
public class Ejercicio_17{
	public static void main(String[] args){
		float l1,l2,l3;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Ingresa los tres lados del triangulo: ");
		l1=scanner.nextFloat();
		l2=scanner.nextFloat();
		l3=scanner.nextFloat();
		if (l1==l2 && l2==l3){
			System.out.println("Es un triangulo equilatero");
		}else{
			if (l1!=l2 && l2!=l3){
				System.out.println("Es un triangulo escaleno");
			}else{
				System.out.println("Es un triangulo Isosceles");
			}
		}
	}
}