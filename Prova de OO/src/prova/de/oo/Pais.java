package prova.de.oo;

import java.util.Arrays;

public class Pais
{
    protected String nome, capital;
    protected float dimensao;
    protected int i = 0;
    String front[] = new String[i+1];

    public Pais(String name, String capitalInicial, float dimension)
    {
        this.nome = name;
        this.capital = capitalInicial;
        this.dimensao = dimension;
    }
   

    public boolean equals(Pais outro)
    {
        return this.nome.equals(outro.getNome());
    }

    public void fronteireiros(Pais outro)
    {
        if (equals(outro))
        {
            System.out.println("Esse pais não pode fazer fronteira consigo mesmo!");
        }
        else
        {
            front[i]=outro.nome;
            i++;
        }
    }

    public void imprimeFronteiras()
    {
        System.out.println("Fronteiras: "+Arrays.toString(front));
    }
    
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setFront(String[] fronteiras)
    {
        this.front = fronteiras;
    }

    public String detalhes(int x)
    {
        return "Pais{" + "nome=" + nome + ", capital=" + capital + ", dimensao=" + dimensao + ", fronteiras=" + front[x] + '}';
    }

    public String getCapital()
    {
        return capital;
    }

    public void setCapital(String capital)
    {
        this.capital = capital;
    }

    public float getDimensao()
    {
        return dimensao;
    }

    public void setDimensao(float dimensao)
    {
        this.dimensao = dimensao;
    }

}
