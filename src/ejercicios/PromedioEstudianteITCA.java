
package ejercicios;

public class PromedioEstudianteITCA {
    public static void main(String[] args) {
        double p1,p2,p3,p4,p5,par1,par2,par3,par4,par5,prom1,prom2,prom3,prom4,prom5, nota_final;
        
        par1 = 0.25;
        par2 = 0.15;
        par3 = 0.15;
        par4 = 0.2;
        par5 = 0.25;
        
        p1 = 8.0;
        p2 = 7.5;
        p3 = 9.0;
        p4 = 8.0;
        p5 = 9.0;
        
        prom1 = p1 * par1;
        prom2 = p2 * par2;
        prom3 = p3 * par3;
        prom4 = p4 * par4;
        prom5 = p5 * par5;
        
        nota_final = prom1 + prom2 + prom3 + prom4 + prom5;
        
        System.out.println("El promedio final del estudiante al final del ciclo es de: " + nota_final);
    }
}
