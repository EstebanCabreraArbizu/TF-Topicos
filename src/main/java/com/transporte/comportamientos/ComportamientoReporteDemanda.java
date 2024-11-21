package com.transporte.comportamientos;

import jade.core.behaviours.TickerBehaviour;

public class ComportamientoReporteDemanda extends TickerBehaviour {
    public ComportamientoReporteDemanda(jade.core.Agent a, long periodo) {
        super(a, periodo);
    }

    @Override
    protected void onTick() {
        System.out.println("Estación reportando demanda...");
        // Lógica para generar y enviar reportes de demanda
    }
}
