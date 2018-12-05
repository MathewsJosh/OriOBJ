package prova.de.oo;

public class CalcArea extends Circulo
{
    double area;

    public CalcArea(double diametro)
    {
        super(diametro);
    }

    public double areaCirc(){
        return 3.14*raio*raio;
    }
    
     public double areaQuadr(float lado){
        return lado*lado;
    }
    
    
}
