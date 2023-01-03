package EjerciciosT8;

// Para practicar la encapsulación:

// Crear clase Persona.

// Crear variables las privadas edad, nombre y telefono de la clase Persona.

// Crear gets y sets de cada propiedad.

// Crear un objeto persona en el main.

// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,

// por último muéstralas por consola.

public class Main {

   

    public static void main (String [] args) {

        Persona persona = new Persona();

        persona.setEdad(20);
        persona.setNombre("Jose");
        persona.setTelefono(666555999);

        System.out.println(persona.Edad);
        System.out.println(persona.Telefono);
        System.out.println(persona.Nombre);
    }

    static class Persona {

    private int Edad;
        public void setEdad(int edad) {
            this.Edad = edad;
        }

    private String Nombre;
        public void setNombre(String nombre) {
            this.Nombre = nombre;
        }

    private int Telefono;
        public void setTelefono(int telefono) {
            this.Telefono = telefono;
        }

        public int getEdad() {
            return Edad;
        }

        public String getNombre() {
            return Nombre;
        }

        public int getTelefono() {
            return Telefono;
        }       
    }
}
