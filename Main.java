import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws EmpleadoPermanente.SalarioInvalidoException {
    Scanner scanner = new Scanner(System.in);
    try {
      // Crear un empleado vendedor
      System.out.println("<<CREACIÓN DE EMPLEADO VENDEDOR:>> ");
      System.out.print("RFC: ");
      String rfcVendedor = scanner.nextLine();
      System.out.print("Apellidos: ");
      String apellidosVendedor = scanner.nextLine();
      System.out.print("Nombres: ");
      String nombresVendedor = scanner.nextLine();
      System.out.print("Monto Vendido: ");
      double montoVendido = scanner.nextDouble();
      System.out.print("Tasa de Comisión: ");
      double tasaComision = scanner.nextDouble();

      Empleado empleadoVendedor = new EmpleadoVendedor(rfcVendedor, apellidosVendedor, nombresVendedor, montoVendido,
          tasaComision);

      // Se muestra información sobre los empleados
      System.out.println("\nINFORMACIÓN DEL EMPLEADO VENDEDOR:");
      empleadoVendedor.mostrarInformacion();
      System.out.println("Ingresos: $" + empleadoVendedor.ingresos());
      System.out.println("Bonificación: $" + empleadoVendedor.calcularBonificacion());
      
      //Se crea un empleado permanente
      System.out.println("\n<<CREACIÓN DEL EMPLEADO PERMANENTE >>");
      System.out.print("RFC: "); //Registro Federal de Contribuyentes
      String rfcPermanente = scanner.nextLine(); 
      rfcPermanente = scanner.nextLine();
      System.out.print("Apellidos: ");
      String apellidosPermanente = scanner.nextLine();
      System.out.print("Nombre(s): ");
      String nombresPermanente = scanner.nextLine();
      System.out.print("Sueldo Base: ");
      double sueldoBase = scanner.nextDouble();
      scanner.nextLine();
      System.out.print("Número de Seguro Social (NSS): "); //sE REGISTRA EL NSS
      String numeroSeguroSocial = scanner.nextLine();
      Empleado empleadoPermanente = new EmpleadoPermanente(rfcPermanente, apellidosPermanente, nombresPermanente,
          sueldoBase, numeroSeguroSocial);

      empleadoVendedor.calcularBonificacion();
    } catch (IllegalArgumentException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
  //Se cierra el metodo
}