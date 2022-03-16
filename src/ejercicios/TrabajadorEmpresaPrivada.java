
package ejercicios;

public class TrabajadorEmpresaPrivada {
    public static void main(String[] args) {
        double ganancia_mes, AFP_empleado, AFP_empleador;
        
        ganancia_mes = 500;
        AFP_empleado = 0.06;
        AFP_empleador = 0.065;
        
        System.out.println("El trabajador gana $" + ganancia_mes);
        System.out.println("El trabajador le paga a la AFP en concepto de empleado: $" + (ganancia_mes * AFP_empleado));
        System.out.println("El trabajador le paga a la AFP en concepto de empleador: $" + (ganancia_mes * AFP_empleador));
    }
}
