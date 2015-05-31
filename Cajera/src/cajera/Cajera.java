/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajera;

/**
 *
 * @author Oliver
 */
public class Cajera implements Runnable {
    private String nombre;
    private Cliente miCliente;
    private long timeStamp;

    public Cajera() {
    }

    public Cajera(String nombre) {
        this.nombre = nombre;
    }
    
    public Cajera(String nombre, Cliente miCliente, long timeStamp){
        this.nombre = nombre;
        this.miCliente = miCliente;
        this.timeStamp = timeStamp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void run() {
        procesarCompra(this.miCliente, this.timeStamp);
    }
    public void procesarCompra(Cliente cliente, long timeStamp) {

        System.out.println("La cajera " + this.nombre
                + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000
                + "seg");

        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1)
                    + " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000
                    + "seg");
        }

        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR "
                + cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
