package SemPattern;
public class MainSemState {
    public static void main(String[] args) {
        MaquinaDeVendaSemState maquina = new MaquinaDeVendaSemState();

        maquina.inserirMoeda();
        maquina.selecionarProduto();
        maquina.dispensarProduto();
    }
}
