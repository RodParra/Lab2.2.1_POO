public class Persona {

    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private double altura;


    public Persona(String nombre, int edad, String genero, String direccion, double altura) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.altura = altura;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    // Método estático para comer
    public static void comer(String comida) {

        System.out.println("Estoy comiendo " + comida);
    }

    // Método no estático para dormir
    public void dormir(int horas) {
        System.out.println("Voy a dormir " + horas + " horas");
    }

    // Método no estático para hacer ejercicio
    public void hacerEjercicio(String tipoEjercicio) {
        System.out.println("Voy a hacer ejercicio de tipo: " + tipoEjercicio);
    }

    public static void main(String[] args) {


        Persona josue = new Persona("Jose", 25, "Masculino", "Calle A", 1.75);
        Persona rodrigo = new Persona("Rodrigo", 28, "Masculino", "Calle B", 1.80);
        Persona ruben = new Persona("Ruben", 28, "Masculino", "Calle C", 1.63);

        System.out.println("Datos de Jose:");
        System.out.println("Nombre: " + josue.getNombre());
        System.out.println("Edad: " + josue.getEdad());
        System.out.println("Género: " + josue.getGenero());
        System.out.println("Dirección: " + josue.getDireccion());
        System.out.println("Altura: " + josue.getAltura());
        josue.comer("sushi");
        josue.dormir(7);
        josue.hacerEjercicio("correr");

        System.out.println("\nDatos de Rodrigo:");
        System.out.println("Nombre: " + rodrigo.getNombre());
        System.out.println("Edad: " + rodrigo.getEdad());
        System.out.println("Género: " + rodrigo.getGenero());
        System.out.println("Dirección: " + rodrigo.getDireccion());
        System.out.println("Altura: " + rodrigo.getAltura());
        rodrigo.comer("ensalada");
        rodrigo.dormir(6);
        rodrigo.hacerEjercicio("sentadillas");

        System.out.println("\nDatos de Ruben:");
        System.out.println("Nombre: " + ruben.getNombre());
        System.out.println("Edad: " + ruben.getEdad());
        System.out.println("Género: " + ruben.getGenero());
        System.out.println("Dirección: " + ruben.getDireccion());
        System.out.println("Altura: " + ruben.getAltura());
        rodrigo.comer("hamburguesa");
        rodrigo.dormir(6);
        rodrigo.hacerEjercicio("trotar");
    }
}
