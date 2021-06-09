import java.util.*;
public class Ejercicio_4{
	public static void main(String[] args){
		int n,cuad,cub;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Ingresa numero: ");
		n=scanner.nextInt();
		cuad=n*n;
		cub=cuad*n;
		System.out.println("El cuadrado del numero es "+cuad);
		System.out.println("El cubo del numero es "+cub);
	}
}