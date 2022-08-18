import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }
    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tFora da Caixa:\n");
        for (ItemPedido itemPedido : itensForaCaixa) {
            sb.append("\t\t- " + itemPedido.getTipo().name() + " " +itemPedido.getNome() + "\n");
        }
        sb.append("\tDentro da Caixa:\n");
        for (ItemPedido itemPedido : itensDentroCaixa) {
            sb.append("\t\t- " + itemPedido.getTipo().name() + " " +itemPedido.getNome() + "\n");
        }

        return sb.toString();
    }
}

