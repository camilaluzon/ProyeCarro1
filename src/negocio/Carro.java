package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    /*
    métodos para ingresar informacion
    set()
    "siempre" el tipo de retorno es void
    siempre recibe un parámetro
    parámetro generalmente es del mismo tipo del atributo
     */

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public void setVelocidad(double velocidad){
        this.velocidad=velocidad;
    }
    public void acelerar(){
        velocidad += potencia;
    }
    void frenar(){
        velocidad /= 2;
    }
}
