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
        sb.append("Fora da Caixa:\n");
        for (ItemPedido itemPedido : itensForaCaixa) {
            sb.append(itemPedido + "\n");
        }
        sb.append("Dentro da Caixa:\n");
        for (ItemPedido itemPedido : itensDentroCaixa) {
            sb.append(itemPedido + "\n");
        }

        return sb.toString();
    }
}
