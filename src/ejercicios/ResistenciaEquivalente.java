package ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ResistenciaEquivalente {
    public static void main(String[] args) {
        double Req, R1 = 5.1, R2 = 68, R3 = 75, R4 = 82;
        
        NumberFormat formato = new DecimalFormat("#0.00");
        
        Req = 1/((1/R1) + (1/R2) + (1/R3) + (1/R4));
        
        System.out.println("La resistencia equivalente es de: " + formato.format(Req) + " ohm.");
    }
}
