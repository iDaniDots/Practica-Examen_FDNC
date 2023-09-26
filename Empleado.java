abstract class Empleado {
    private String RFC;
    private String apellidos;
    private String nombres;

    public Empleado(String RfC, String apellidos, String nombres) {
        RFC = RfC;
        this.apellidos = apellidos;
        this.nombres = nombres;

    }

    // Se comienzas a crear los getters y setters de cada variante
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RfC) {
        RFC = RfC;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public abstract double ingresos();
    public abstract double calcularBonificacion();
    public abstract double calcularDescuento();
    public abstract double calcularSueldoNeto();

    public void mostrarInformacion() {
        System.out.println("RFC: " + RFC);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Nombres: " + nombres);
    }
}
