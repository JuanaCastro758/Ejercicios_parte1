import java.util.*;
public class Ejercicio_18{
	public static void main(String[] args){
		int n;
		String ntxt;
		String c1,c2,c3,c4;
		int m,c,d,u,s;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Ingresa numero: ");
		n=scanner.nextInt();
		ntxt=String.valueOf(n);
        if (n<10) {
        	c1=ntxt.substring(0,1);
        	m=Integer.parseInt(c1);
        	s=m;
        	System.out.println("d1: 0");
			System.out.println("d2: 0");
			System.out.println("d3: 0");
			System.out.println("d4: "+c1);
			System.out.println("Suma: "+s);
        }else if (n<100){
        	c1=ntxt.substring(0,1);
            c2=ntxt.substring(1,2);
            m=Integer.parseInt(c1);
            c=Integer.parseInt(c2);
            s=m+c;
			System.out.println("d1: 0");
			System.out.println("d2: 0");
			System.out.println("d3: "+c1);
			System.out.println("d4: "+c2);
			System.out.println("Suma: "+s);
		}else if (n<1000){
			c1=ntxt.substring(0,1);
        	c2=ntxt.substring(1,2);
        	c3=ntxt.substring(2,3);
        	m=Integer.parseInt(c1);
        	c=Integer.parseInt(c2);
        	d=Integer.parseInt(c3);
        	 s=m+c+d;
			System.out.println("d1: 0");
			System.out.println("d2: "+c1);
			System.out.println("d3: "+c2);
			System.out.println("d4: "+c3);
			System.out.println("Suma: "+s);
		}else if (n<10000){
			c1=ntxt.substring(0,1);
	        c2=ntxt.substring(1,2);
	        c3=ntxt.substring(2,3);
	        c4=ntxt.substring(3,4);
	        m=Integer.parseInt(c1);
	        c=Integer.parseInt(c2);
	        d=Integer.parseInt(c3);
	        u=Integer.parseInt(c4);
	        s=m+c+d+u;
			System.out.println("d1: "+c1);
			System.out.println("d2: "+c2);
			System.out.println("d3: "+c3);
			System.out.println("d4: "+c4);
			System.out.println("Suma: "+s);
		}else{
			System.out.println("El numero tiene mas de 4 cifras");	
		}
	}
}