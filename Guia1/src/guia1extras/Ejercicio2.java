
package guia1extras;


public class Ejercicio2 {

    public static void main(String[] args) {

        int a, b, c, d, aux;

        a = 500;
        b = 1200;
        c = 850;
        d = 1;

        System.out.println("Estos son los valores actuales de A, B, C, D");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);

        // B por C, C por A, A por D, D por B 
        aux = b;
        b = c;
        c = a;
        a = d;
        d= aux;



        System.out.println("Estos son los nuevos valores de A, B, C, D");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);

    }
    
}
