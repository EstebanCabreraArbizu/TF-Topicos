package com.transporte.agentes;

import jade.core.Agent;
import com.transporte.comportamientos.ComportamientoRecepcionMensaje;

public class AgenteEstacion extends Agent {
    @Override
    protected void setup() {
        System.out.println("Agente Estación " + getLocalName() + " iniciado.");

        // Agregar comportamiento de recepción de mensajes
        addBehaviour(new ComportamientoRecepcionMensaje());
    }
}
