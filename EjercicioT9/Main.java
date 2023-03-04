package EjercicioT9;

public class Main {
    public static void main(String[] args) {

    Persona Luis = new Cliente(27, "Luis", "644666999", 357);
    Persona Pepe = new Trabajador(32, "José", "555999333", 1320.67);

    System.out.println(Luis);
    System.out.println(Pepe);

}

}
