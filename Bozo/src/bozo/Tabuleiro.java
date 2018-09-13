package bozo;

public class Tabuleiro
{
    int pontP[] = new int[10];
    String nome[] = new String[10];
    public Tabuleiro()
    {
        for (int i = 0; i < 10; i++)
        {
            pontP[i] = -1;
        }
        nome[0] = "Yahtzee";
        nome[1] = "Ases";
        nome[2] = "Dois";
        nome[3] = "Três";
        nome[4] = "Quatros";
        nome[5] = "Cincos";
        nome[6] = "Seis";
        nome[7] = "Trinca";
        nome[8] = "Quadra";
        nome[9] = "NULL";
    }
    public void exibeTabuleiro()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Posição " + i + " (" + nome[i] + ") / Pontuação: " + pontP[i]);
        }
    }
    public void calculaPontuacao(int p, Dado dados[])
    {
        int soma = 0;
        switch (p)
        {
            case 0:
                if (dados[0].face == dados[1].face && dados[0].face == dados[2].face && dados[0].face == dados[3].face && dados[0].face == dados[4].face)
                {
                    pontP[0] = 50;
                    System.out.println("YAHTZEE");
                    break;
                }
                else
                {
                    pontP[p] = 0;
                    break;
                }
            case 1:
                for (int i = 0; i < 5; i++)
                {
                    if (dados[i].face == 1)
                    {
                        soma++;
                    }
                }
                pontP[p] = soma;
                break;
            case 2:
                for (int i = 0; i < 5; i++)
                {
                    if (dados[i].face == 2)
                    {
                        soma = soma + 2;
                    }
                }
                pontP[p] = soma;
                break;
            case 3:
                for (int i = 0; i < 5; i++)
                {
                    if (dados[i].face == 3)
                    {
                        soma = soma + 3;
                    }
                }
                pontP[p] = soma;
                break;
            case 4:
                for (int i = 0; i < 5; i++)
                {
                    if (dados[i].face == 4)
                    {
                        soma = soma + 4;
                    }
                }
                pontP[p] = soma;
                break;
            case 5:
                for (int i = 0; i < 5; i++)
                {
                    if (dados[i].face == 5)
                    {
                        soma = soma + 5;
                    }
                }
                pontP[p] = soma;
                break;
            case 6:
                for (int i = 0; i < 5; i++)
                {
                    if (dados[i].face == 6)
                    {
                        soma = soma + 6;
                    }
                }
                pontP[p] = soma;
                break;
            case 7:
                for (int j = 1; j <= 6; j++)
                {
                    int c = 0;
                    for (int i = 0; i < 5; i++)
                    {
                        if (dados[i].face == j)
                        {
                            c++;
                        }
                    }
                    if (c == 3)
                    {
                        pontP[p] = j * 3;
                        break;
                    }
                    else
                    {
                        pontP[p] = 0;
                        break;
                    }

                }
            case 8:
                for (int j = 1; j <= 6; j++)
                {
                    int c = 0;
                    for (int i = 0; i < 5; i++)
                    {
                        if (dados[i].face == j)
                        {
                            c++;
                        }
                    }
                    if (c == 4)
                    {
                        pontP[p] = j * 4;
                        break;
                    }
                    else
                    {
                        pontP[p] = 0;
                        break;
                    }
                }
            case 9:
                System.out.println("NULO");
                break;
            default:
                System.out.println("Posição Inválida!!!");
        }
    }

}
