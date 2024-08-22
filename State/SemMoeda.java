package State;
public class SemMoeda implements State {
    MaquinaDeVenda maquina;

    public SemMoeda(MaquinaDeVenda maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Moeda inserida.");
        maquina.setState(maquina.getComMoedaState());
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Não há moeda para ejetar.");
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Insira uma moeda primeiro.");
    }

    @Override
    public void dispensarProduto() {
        System.out.println("Nenhum produto foi selecionado.");
    }
}
