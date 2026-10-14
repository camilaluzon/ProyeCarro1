package carro;

public class Carro {
    private int potencia;
    private double velocidad;

    //atributo de clase
    private static int numCarros = 0;
    //constante de clase
    private static final double IVA = 0.12;

    public Carro(int potencia, double velocidad){
        /*this.potencia = potencia;
        this.velocidad = velocidad;
         */

        // Si se validan datos llamo a los set
        setVelocidad(velocidad);
        setPotencia(potencia);
        numCarros++;
    }

    public Carro() {
        numCarros++;
    }

      /*
    métodos para ingresar informacion
    set()
    "siempre" el tipo de retorno es void
    siempre recibe un parámetro
    parámetro generalmente es del mismo tipo del atributo
     */

    public void setPotencia(int potencia){
        // se actualiza solo si el dato es correcto
        if(potencia > 0)
            this.potencia = potencia;
    }
    public void setVelocidad(double velocidad){
        //se actualiza si el dato es correcto sino se setea
        if(velocidad < 0)
            velocidad=0;
        this.velocidad=velocidad;
    }

    /*
    metodo para sacar informacion
    get()
    siempre retorna valor
    el tipo de retorno generalmente es del mismo tipo de atributo
     */

    public int getPotencia(){
        return potencia;
    }
    public double getVelocidad(){
        return velocidad;
    }
    public static int getNumCarros(){
        return numCarros;
    }
    public static double getIva(){
        return IVA;
    }

    public double calcularPrecioVenta(double precio){
        return precio + (precio * IVA);
    }
    public void acelerar(){
        velocidad += potencia;
    }
    void frenar(){
        velocidad /= 2;
    }
}
