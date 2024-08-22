package State;
public class ComMoeda implements State {
    MaquinaDeVenda maquina;

    public ComMoeda(MaquinaDeVenda maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Moeda já foi inserida.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Moeda ejetada.");
        maquina.setState(maquina.getSemMoedaState());
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Produto selecionado.");
        maquina.setState(maquina.getProdutoDispensadoState());
    }

    @Override
    public void dispensarProduto() {
        System.out.println("Nenhum produto foi selecionado.");
    }
}
