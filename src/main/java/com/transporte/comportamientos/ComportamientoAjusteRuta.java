package com.transporte.comportamientos;

import jade.core.behaviours.Behaviour;

public class ComportamientoAjusteRuta extends Behaviour {
    private boolean terminado = false;

    @Override
    public void action() {
        System.out.println("Agente ajustando ruta según la demanda...");
        // Aquí se implementaría la lógica para ajustar rutas
        terminado = true;
    }

    @Override
    public boolean done() {
        return terminado;
    }
}
