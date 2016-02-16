/*
 * El programa pide que se ingresen 3 numeros y los compara imprimiendo el mayor de ellos
 */
package df_1;

/**
 *
 * @author usuario
 */
public class DF_1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        java.util.Scanner read = new java.util.Scanner(System.in);
        double a, b, c, mayor = 0;
        System.out.println("Ingrese A   ");
        a = read.nextDouble();
        System.out.println("Ingrese B   ");
        b = read.nextDouble();
        System.out.println("Ingrese C   ");
        c = read.nextDouble();
        
        if(a>b)
            if(a>c)
                mayor = a;
            else
                mayor = c;
        else

            if(b>c)
                mayor = b;
            else
                mayor =c;
     
    System.out.print("El mayor es   "+ mayor);  
                       
    }
        // TODO code application logic here
}
    
