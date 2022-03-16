
package ejercicios;

public class TrabajadorIndustriaConstruccion {
    public static void main(String[] args) {
        double ganancia_diaria, ganancia_mes, horas_extra, descuento_renta, porcentaje_diario_ganancia;
        
        ganancia_diaria = 10;
        horas_extra = 50;
        porcentaje_diario_ganancia = ganancia_diaria * 0.1;
        ganancia_mes = ganancia_diaria * 30 + (porcentaje_diario_ganancia * horas_extra);
        descuento_renta = 0.1;
        
        System.out.println("El trabajador gana $" + ganancia_mes + " en el mes, sin tener en cuenta el descuento de la renta.");
        System.out.println("El trabajador gana $" + (ganancia_mes - (ganancia_mes*descuento_renta)) + " en el mes con el descuento de la renta aplicado.");
    }
}
