package com.mycompany.sistemadetransporte_poo;

/**
 * @author Luiscastro0154
 */
public class SistemadeTransporte_POO {

    public static void main(String[] args) {
       
        CamionIstmeño miCamion = new CamionIstmeño(101, 10);

        
        miCamion.precioTehuantepec = 50.0;
        miCamion.precioSalinaCruz = 80.0;

        
        miCamion.abordar("Ana", "Tehuantepec");
        miCamion.abordar("Luis", "Tehuantepec");
        miCamion.abordar("Sofia", "Salina Cruz");
        
       
        miCamion.abordar("Juan", "Salina Cruz");
        miCamion.abordar("Meldrick", "Tehuantepec");
        miCamion.abordar("Pedro", "Salina Cruz");
        miCamion.abordar("Paulina", "Tehuantepec");
        miCamion.abordar("Alejandro", "Salina Cruz");
        miCamion.abordar("Manuel", "Tehuantepec");
        miCamion.abordar("Yasiris", "Salina Cruz");
        
        
        miCamion.abordar("Francisco", "Tehuantepec");

       
        miCamion.mostrarResumen();
        System.out.println("Ingresos Totales: $" + miCamion.calcularIngresos());
    }
}
