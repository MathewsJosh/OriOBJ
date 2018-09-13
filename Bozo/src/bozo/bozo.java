package bozo;
import java.util.Scanner;

public class bozo {
    
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos Jogadores são? R: ");
        n = ler.nextInt();                                         ///lê qtd jogadores
        Jogo bozo = new Jogo(n);
        bozo.iniciarJogo();
    }
}
