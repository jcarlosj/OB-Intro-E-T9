public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente( ( byte ) 32, "Ana Maria", "3421101", 2000 );
        Trabajador trabajador = new Trabajador( ( byte ) 44, "Elisa Maria", "4053711", 2500 );

        System.out.println( "*** Cliente *** " +
            "\n - Nombre: " + cliente.getNombre() +
            "\n - Edad: " + cliente.getEdad() +
            "\n - Telefono: " + cliente.getTelefono() +
            "\n - Credito: $" + cliente.getCredito()
        );
        System.out.println( "*** Trabajador ***" +
            "\n - Nombre: " + trabajador.getNombre() +
            "\n - Edad: " + trabajador.getEdad() +
            "\n - Telefono: " + trabajador.getTelefono() +
            "\n - Salario: $" + trabajador.getSalario()
        );
    }
}

class Persona {
    private byte edad;
    private String nombre;
    private String telefono;

    Persona ( byte edad, String nombre, String telefono ) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad( byte edad ) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono( String telefono ) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    Cliente( byte edad, String nombre, String telefono, double credito ) {
        super( edad, nombre, telefono );
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    Trabajador( byte edad, String nombre, String telefono, double salario ) {
        super( edad, nombre, telefono );
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}