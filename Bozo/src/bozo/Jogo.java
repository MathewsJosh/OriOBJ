package bozo;

public class Jogo {
    
    Jogador [] jogador;                     //vetor jogador com alocação dinâmica
    
    public Jogo(int n){
        jogador = new Jogador [n];
        for (int i = 0; i<n; i++)
            jogador[i] = new Jogador(i);
    }
    
    public void iniciarJogo(){
        System.out.println("Inicio!");
        System.out.println(jogador[0].nome+"...rolará os dados");
        jogador[0].lancaDados();
        jogador[0].escolheDados();
        jogador[0].escolhePosicao();
    }
    
}