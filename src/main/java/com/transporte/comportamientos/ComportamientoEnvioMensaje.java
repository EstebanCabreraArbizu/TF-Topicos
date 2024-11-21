package com.transporte.comportamientos;

import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import jade.core.AID;
import java.net.InetAddress;

public class ComportamientoEnvioMensaje extends OneShotBehaviour {
    @Override
    public void action() {
        try {
            // Obtener la IP local
            InetAddress ip = InetAddress.getLocalHost();
            String direccionIP = ip.getHostAddress();

            // Obtener el puerto del contenedor (desde una propiedad del sistema)
            String puerto = System.getProperty("port", "1099");

            // Crear un mensaje ACL
            ACLMessage mensaje = new ACLMessage(ACLMessage.INFORM);
            mensaje.addReceiver(new AID("AgenteEstacion", AID.ISLOCALNAME));  // Destinatario
            mensaje.setContent("Demanda alta desde la IP: " + direccionIP + " en el puerto: " + puerto);  // Contenido
            myAgent.send(mensaje);  // Enviar el mensaje

            System.out.println("Mensaje enviado desde " + myAgent.getLocalName() + " a AgenteEstacion con IP: " + direccionIP + " y puerto: " + puerto);
        } catch (Exception e) {
            System.err.println("Error obteniendo IP o puerto: " + e.getMessage());
        }
    }
}
