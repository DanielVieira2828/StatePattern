package State;
public class Main {
    public static void main(String[] args) {
        MaquinaDeVenda maquina = new MaquinaDeVenda();

        maquina.inserirMoeda();
        maquina.selecionarProduto();
        maquina.dispensarProduto();
    }
}
