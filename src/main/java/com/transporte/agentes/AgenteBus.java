package com.transporte.agentes;

import jade.core.Agent;
import com.transporte.comportamientos.ComportamientoEnvioMensaje;

public class AgenteBus extends Agent {
    @Override
    protected void setup() {
        System.out.println("Agente Bus " + getLocalName() + " iniciado.");

        addBehaviour(new ComportamientoEnvioMensaje());
    }
}
