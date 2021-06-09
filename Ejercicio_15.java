import java.util.*;
public class Ejercicio_15{
	public static void main(String[] args){
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Ingresa numero: ");
		n=scanner.nextInt();
		if (n == 0){
			System.out.println("El numero es nulo");
		}else{
			if (n<0){
				System.out.println("El numero es negativo");
			}else{
				System.out.println("El numero es positivo");
			}
		}
	}
}