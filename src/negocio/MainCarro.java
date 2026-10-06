package negocio;

public class MainCarro {
    static void main() {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        Carro c4 = new Carro();

        /*c1.potencia = 2;
        c1.velocidad = 60;
        c2.potencia = 5;
        c2.velocidad = 100;
        c3.potencia = 2;
        c3.velocidad = 60;*/

        c1.setPotencia(2);
        c1.setVelocidad(60);

        // System.out.println("La potencia del carro es " + c1.potencia + " y la velocidad es " + c1.velocidad);
        System.out.println("La potencia del carro es " + c1.getPotencia() + " y la velocidad es " + c1.getVelocidad());

        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        c1.frenar();

       // System.out.println("La potencia del carro es " + c1.potencia + " y la velocidad es " + c1.velocidad);
    }
}
