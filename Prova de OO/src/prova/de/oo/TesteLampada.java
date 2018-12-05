package prova.de.oo;

public class TesteLampada
{
    boolean ligada;
    public TesteLampada()
    {
        ligada=false;
    }   
    public void ligarLamp()
    {
        this.ligada=true;
    }
    public void desligarLamp()
    {
        this.ligada=false;
    }
    public boolean estaLigada()
    { 
        if(ligada)
            System.out.println("A lampada está ligada!");
        else
            System.out.println("A lampada está desligada!");
        return ligada;
    }
}
