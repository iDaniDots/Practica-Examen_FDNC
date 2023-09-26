// Clase EmpleadoPermanente que hereda de Empleado
class EmpleadoPermanente extends Empleado {
    private double sueldoBase;
    private String numeroSeguroSocial;
    private static final double SALARIO_MINIMO = 150.0;

    public EmpleadoPermanente(String RFC, String apellidos, String nombres, double sueldoBase,
            String numeroSeguroSocial) throws SalarioInvalidoException {
        super(RFC, apellidos, nombres);
        if (sueldoBase < SALARIO_MINIMO) {
            throw new SalarioInvalidoException("El salario base es menor al mínimo permitido.");
        }
        this.sueldoBase = sueldoBase;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    @Override
    public double ingresos() {
        return sueldoBase;
    }

    @Override
    public double calcularBonificacion() {
        return 0.0; // No hay bonificación para empleados permanentes
    }

    @Override
    public double calcularDescuento() {
        return 0.11 * sueldoBase; // Descuento del 11% por seguro social
    }

    @Override
    public double calcularSueldoNeto() {
        return ingresos() - calcularDescuento();
    }

    // Clase personalizada para manejar excepciones de salario inválido
    public static class SalarioInvalidoException extends Exception {
        public SalarioInvalidoException(String mensaje) {
            super(mensaje);
        }
    }
}