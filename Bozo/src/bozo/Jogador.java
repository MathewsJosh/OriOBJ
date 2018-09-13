package bozo;
import java.util.Scanner;

public class Jogador { 
    Dado dados [] = new Dado [5];
    Tabuleiro tab1;
    String nome;
    int pontos;
    public Jogador(int n){
        pontos = 0;
        tab1 = new Tabuleiro();
        System.out.println("Nome do jogador: "+n+": ");
        Scanner ler = new Scanner(System.in);                       ///le o nome do jogador do teclado
        nome = ler.nextLine();
        System.out.println("Insira a qtf de faces dos dados do(a) "+this.nome+": ");
        int j = ler.nextInt();
        for (int i = 0; i < 5; i++)
            dados[i] = new Dado(j);
    }
    
    public void lancaDados(){
        for (int i = 0; i<5; i++){
            dados[i].rolar();
            System.out.print("Dado "+i+": ");
            dados[i].exibirFace();
        }
    }
    
    public void escolheDados(){
        for (int j = 0; j<3; j++){
            System.out.println("Escolha uma tentativa/dado para rolar novamente");
            Scanner ler = new Scanner(System.in);                   ///lê o dado escolhido
            System.out.print("Escolha: ");
            int d = ler.nextInt();
            if (d != -1){
                dados[d].rolar();
                System.out.print("Resultado: ");
                dados[d].exibirFace();
                for (int i = 0; i<5; i++){
                    System.out.print(i+"- ");
                    dados[i].exibirFace();
                }
            }
            else
                System.out.println("Nenhum dado foi escolhido para outra tentativa!");
                
        }
    }
        
    public void escolhePosicao(){
        System.out.println("Escolha a posição onde você deseja pontuar: ");
        tab1.exibeTabuleiro();
        System.out.print("Opção: ");
        Scanner ler = new Scanner(System.in);
        int p = ler.nextInt();
        System.out.println("Posição escolhida: "+tab1.nome[p]);
        if (p != -1){
            tab1.calculaPontuacao(p, dados);
            tab1.exibeTabuleiro();
        }
        else {
            System.out.println("Posição Inválida! 0 Pontos");
            tab1.pontP[p] = 0;
        }
    }
        
    public void calculaPont(){
        for (int i=0; i<9; i++)
            pontos = tab1.pontP[i] + pontos;
    }
}