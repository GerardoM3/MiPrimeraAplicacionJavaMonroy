
package ejercicios;

public class ValorDeLasMonedas {
    public static void main(String[] args) {
        double monedaInicial, USD, monedaEuro, monedaRU, monedaAust, monedaCan;
        
        monedaInicial = 100.00;
        USD = 1;
        monedaEuro = 0.70;
        monedaRU = 0.61;
        monedaAust = 0.95;
        monedaCan = 0.97;
        
        System.out.println("$100 dólares equivalen a " + (monedaInicial * monedaEuro) + " euros.");
        System.out.println("$100 dólares equivalen a " + (monedaInicial * monedaRU) + " libras esterlinas.");
        System.out.println("$100 dólares equivalen a " + (monedaInicial * monedaAust) + " dólares australianos.");
        System.out.println("$100 dólares equivalen a " + (monedaInicial * monedaCan) + " dólares canadienses.");
    }
}
