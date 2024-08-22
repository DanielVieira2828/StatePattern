package SemPattern;
public class MaquinaDeVendaSemState {
    enum Estado { SEM_MOEDA, COM_MOEDA, PRODUTO_DISPENSADO }
    private Estado estadoAtual;

    public MaquinaDeVendaSemState() {
        estadoAtual = Estado.SEM_MOEDA;
    }

    public void inserirMoeda() {
        switch (estadoAtual) {
            case SEM_MOEDA:
                System.out.println("Moeda inserida.");
                estadoAtual = Estado.COM_MOEDA;
                break;
            case COM_MOEDA:
                System.out.println("Moeda já foi inserida.");
                break;
            case PRODUTO_DISPENSADO:
                System.out.println("Aguarde, o produto está sendo dispensado.");
                break;
        }
    }

    public void ejetarMoeda() {
        switch (estadoAtual) {
            case SEM_MOEDA:
                System.out.println("Não há moeda para ejetar.");
                break;
            case COM_MOEDA:
                System.out.println("Moeda ejetada.");
                estadoAtual = Estado.SEM_MOEDA;
                break;
            case PRODUTO_DISPENSADO:
                System.out.println("Produto já foi selecionado, não é possível ejetar a moeda.");
                break;
        }
    }

    public void selecionarProduto() {
        switch (estadoAtual) {
            case SEM_MOEDA:
                System.out.println("Insira uma moeda primeiro.");
                break;
            case COM_MOEDA:
                System.out.println("Produto selecionado.");
                estadoAtual = Estado.PRODUTO_DISPENSADO;
                break;
            case PRODUTO_DISPENSADO:
                System.out.println("Produto já foi selecionado.");
                break;
        }
    }

    public void dispensarProduto() {
        switch (estadoAtual) {
            case SEM_MOEDA:
                System.out.println("Nenhum produto foi selecionado.");
                break;
            case COM_MOEDA:
                System.out.println("Nenhum produto foi selecionado.");
                break;
            case PRODUTO_DISPENSADO:
                System.out.println("Produto dispensado.");
                estadoAtual = Estado.SEM_MOEDA;
                break;
        }
    }
}
