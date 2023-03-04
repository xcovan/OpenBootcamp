package EjercicioT9;

public class Trabajador extends Persona{

    private double salario;


    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return nombre + " es un trabajador." + "\nEdad: " + edad + "\nTeléfono: " + telefono +"\nY un salario de: " + salario;
    }
}
