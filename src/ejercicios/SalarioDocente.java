
package ejercicios;

public class SalarioDocente {
    public static void main(String[] args) {
        double salario_D, gananciaxhora, horas, descuento_renta;
        gananciaxhora = 8.00;
        horas = 36;
        descuento_renta = 0.10;
        salario_D = gananciaxhora * horas;
        
        System.out.println("El salario del docente sin el descuento de la renta es de: $" + salario_D);
        System.out.println("El salario del docente con el descuento de la renta es de: $" + (salario_D - (salario_D * descuento_renta)));
    }
}
