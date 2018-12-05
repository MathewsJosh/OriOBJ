package prova.de.oo;

public class SetorPessoal
{
    int tam;
    float x=0;
    Funcionario vet[]=new Funcionario[tam];

    public SetorPessoal(int tam)
    {
        this.tam = tam;
    }

    public void addFuncionario()
    {
        this.tam++;
    }

    public void imprimeTUTO()
    {
        for (int i = 0; i < tam; i++)
        {
            System.out.println("Funcionario: "+vet[i].nome);
            System.out.println("Salario: "+vet[i].salario);
        }
    }
    
    public float somaPags()
    {
        for (int i = 0; i < tam; i++)
        {
            this.x+=vet[i].salario;
        }
        return this.x;
    }
    
    public void salarao()
    {
        int sal=0;
        float maior=vet[0].salario;
        for (int i = 0; i < tam; i++)
        {
            if(maior<vet[i].salario)
                sal=i;
        }
        System.out.println("Funcionario com maior salario: "+vet[sal].nome);
        //return sal;
    }
    
    
    
}
