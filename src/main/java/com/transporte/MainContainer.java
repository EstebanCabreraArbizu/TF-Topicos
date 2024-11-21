package com.transporte;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class MainContainer {
    public static void main(String[] args) {
        try {
            Runtime rt = Runtime.instance();
            Profile p = new ProfileImpl();
            AgentContainer mainContainer = rt.createMainContainer(p);

            AgentController rma = mainContainer.createNewAgent("rma", "jade.tools.rma.rma", null);
            rma.start();
            AgentController agenteBus = mainContainer.createNewAgent("AgenteBus", com.transporte.agentes.AgenteBus.class.getName(), null);
            AgentController agenteEstacion = mainContainer.createNewAgent("AgenteEstacion", com.transporte.agentes.AgenteEstacion.class.getName(), null);

            agenteBus.start();
            agenteEstacion.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


