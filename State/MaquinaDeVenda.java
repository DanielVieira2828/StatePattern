package State;
public class MaquinaDeVenda {
    State semMoedaState;
    State comMoedaState;
    State produtoDispensadoState;

    State estadoAtual;

    public MaquinaDeVenda() {
        semMoedaState = new SemMoeda(this);
        comMoedaState = new ComMoeda(this);
        produtoDispensadoState = new ProdutoDispensado(this);

        estadoAtual = semMoedaState;
    }

    public void setState(State novoEstado) {
        estadoAtual = novoEstado;
    }

    public void inserirMoeda() {
        estadoAtual.inserirMoeda();
    }

    public void ejetarMoeda() {
        estadoAtual.ejetarMoeda();
    }

    public void selecionarProduto() {
        estadoAtual.selecionarProduto();
    }

    public void dispensarProduto() {
        estadoAtual.dispensarProduto();
    }

    public State getSemMoedaState() {
        return semMoedaState;
    }

    public State getComMoedaState() {
        return comMoedaState;
    }

    public State getProdutoDispensadoState() {
        return produtoDispensadoState;
    }
}