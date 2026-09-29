package negocio;

public class Carro {
    int potencia;
    double velocidad;

    public void acelerar(){
        velocidad += potencia;
    }

    void frenar(){
        velocidad /= 2;
    }
}
