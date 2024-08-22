package State;
public class ProdutoDispensado implements State {
    MaquinaDeVenda maquina;

    public ProdutoDispensado(MaquinaDeVenda maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Aguarde, o produto está sendo dispensado.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Produto já foi selecionado, não é possível ejetar a moeda.");
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Produto já foi selecionado.");
    }

    @Override
    public void dispensarProduto() {
        System.out.println("Produto dispensado.");
        maquina.setState(maquina.getSemMoedaState());
    }
}
