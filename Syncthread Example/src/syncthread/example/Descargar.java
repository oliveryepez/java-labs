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
public class Descargar extends Thread {
    private Pistola arma;
    private int cartucho;

    public Descargar(Pistola arma, int cartucho) {
        this.arma = arma;
        this.cartucho = cartucho;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            arma.disparar(i);
            System.out.println("Descargar #" + this.cartucho + " bala: " + i);
        }
    }
}

