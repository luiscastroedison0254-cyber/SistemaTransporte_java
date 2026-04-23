package com.mycompany.sistemadetransporte_poo;

public class CamionIstmeño {
    
    int numeroUnidad;
    int capacidad;
    int totalPasajeros;
    double ingresosTotales;
    int contadorFolio;
    int pasajerosTehuantepec;
    int pasajerosSalinaCruz;
    double precioTehuantepec;
    double precioSalinaCruz;

    
    public CamionIstmeño(int numeroUnidad, int capacidad) {
        this.numeroUnidad = numeroUnidad;
        this.capacidad = capacidad;
        this.totalPasajeros = 0;
        this.ingresosTotales = 0;
        this.contadorFolio = 1; 
        this.pasajerosTehuantepec = 0;
        this.pasajerosSalinaCruz = 0;
    }

    
    public void abordar(Pasajero p) {
        if (totalPasajeros < capacidad) {
            double costo = 0;
            if (p.destino.equalsIgnoreCase("Tehuantepec")) {
                costo = precioTehuantepec;
                pasajerosTehuantepec++;
            } else if (p.destino.equalsIgnoreCase("Salina Cruz")) {
                costo = precioSalinaCruz;
                pasajerosSalinaCruz++;
            }

            
            if (costo < 10) { costo = 10; }

            ingresosTotales += costo;
            totalPasajeros++;
            System.out.println("Pasajero " + p.nombre + " abordó. Folio: " + contadorFolio);
            contadorFolio++;
        } else {
            System.out.println("Capacidad excedida para " + p.nombre);
        }
    }

  
    public void abordar(String nombre, String destino) {
        Pasajero nuevoP = new Pasajero(nombre, destino);
        abordar(nuevoP);
    }

    public double calcularIngresos() {
        return ingresosTotales;
    }

    public void mostrarResumen() {
        System.out.println("\n--- RESUMEN UNIDAD " + numeroUnidad + " ---");
        System.out.println("Pasajeros Tehuantepec: " + pasajerosTehuantepec);
        System.out.println("Pasajeros Salina Cruz: " + pasajerosSalinaCruz);
        System.out.println("Total Pasajeros: " + totalPasajeros);
    }
}
