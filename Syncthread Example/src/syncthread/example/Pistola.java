/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syncthread.example;

/**
 *
 * @author Oliver
 */
public class Pistola {
        private int cartucho;
        private boolean enposicion = true;
        
        public synchronized void disparar(int cartucho) {
            while (enposicion == false) {
                try {
                // Esperar a apuntar
                wait();
                } catch (InterruptedException e) { 

                }
            }
            enposicion = false;
            notifyAll();
    }
        
    public synchronized void apuntar() {
        while (enposicion == true) {
        try {
        // Esperar a disparar
            wait();
            } catch (InterruptedException e) {

            }
        }
        enposicion = true;
        notifyAll();
    }
}

