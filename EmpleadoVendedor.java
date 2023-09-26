// Clase EmpleadoVendedor que hereda de Empleado
class EmpleadoVendedor extends Empleado {
    private double montoVendido;
    private double tasaComision;

    public EmpleadoVendedor(String RFC, String apellidos, String nombres, double montoVendido, double tasaComision) {
        super(RFC, apellidos, nombres);
        this.montoVendido = montoVendido;
        this.tasaComision = tasaComision;
    }

    @Override
    public double ingresos() {
        return montoVendido * tasaComision;
    }

    @Override  //Bonificacion del monto vendido
    public double calcularBonificacion() {
        if (montoVendido < 1000) {
            return 0.0;
        } else if (montoVendido >= 1000 && montoVendido <= 5000) {
            return 0.05 * ingresos();
        } else {
            return 0.10 * ingresos();
        }
    }

    @Override //Se calcula el descuento si los ingresos son menores
    public double calcularDescuento() {
        if (ingresos() < 1000) {
            return 0.11 * ingresos();
        } else {
            return 0.15 * ingresos();
        }
    }

    @Override
    public double calcularSueldoNeto() {
        return ingresos() + calcularBonificacion() - calcularDescuento();
    }
}