package EjerciciosT4;

public class Ejercicio1 {

    public static void main (String [] args) {

        int numerolf;
            System.out.println("Introduce un numero");
             numerolf = Integer.parseInt(System.console().readLine());

            if (numerolf > 0)
            {   System.out.println("El número es positivo."); }
                
                else if (numerolf ==0)
                    { System.out.println("El numero es 0"); }
                
                else 
                    { System.out.println("El número es negativo"); }
           
        }  
}
