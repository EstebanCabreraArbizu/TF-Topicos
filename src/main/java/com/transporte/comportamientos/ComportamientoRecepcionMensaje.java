package com.transporte.comportamientos;

import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class ComportamientoRecepcionMensaje extends CyclicBehaviour {
    @Override
    public void action() {
        ACLMessage mensaje = myAgent.receive();  
        if (mensaje != null) {
            System.out.println("Mensaje recibido por " + myAgent.getLocalName() + ": " + mensaje.getContent());
        } else {
            block();  
        }
    }
}
