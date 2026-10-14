package carro;

public class MainCarro {
    static void main() {
        System.out.println("El número de carros existentes es: "+Carro.getNumCarros());
        System.out.println("El Iva para vehiculos es: "+Carro.getIva());
        Carro c1 = new Carro(2,60);
        System.out.println("El precio de venta del carro 1 es: "+c1.calcularPrecioVenta(25999));
        Carro c2 = new Carro(-5,-100);
        Carro c3 = new Carro();
        System.out.println("El número de carros existentes es: "+Carro.getNumCarros());

        /*c1.potencia = 2;
        c1.velocidad = 60;
        c2.potencia = 5;
        c2.velocidad = 100;
        c3.potencia = 2;
        c3.velocidad = 60;*/

        c1.setPotencia(2);
        c1.setVelocidad(60);
        c2.setVelocidad(-100);
        c2.setPotencia(-5);

        // System.out.println("La potencia del carro es " + c1.potencia + " y la velocidad es " + c1.velocidad);
        System.out.println("La potencia del carro 1 es " + c1.getPotencia() + " y la velocidad es " + c1.getVelocidad());
        System.out.println("La potencia del carro 2 es " + c2.getPotencia() + " y la velocidad es " + c2.getVelocidad());

        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        c1.frenar();

       // System.out.println("La potencia del carro es " + c1.potencia + " y la velocidad es " + c1.velocidad);
    }
}
