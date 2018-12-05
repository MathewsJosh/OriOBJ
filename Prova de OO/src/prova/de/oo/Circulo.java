package prova.de.oo;


public abstract class Circulo
{
    double diametro;
    double raio;

    public Circulo(double diametro)
    {
        this.diametro = diametro;
        this.raio=diametro/2;
    }
    
}
