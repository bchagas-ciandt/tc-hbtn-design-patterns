public class PedidoBuilder extends PedidoAbstractBuilder{
    private Pedido pedido;

    public PedidoBuilder() {
        pedido = new Pedido();
    }

    @Override
    public void setLanche(TipoLanche tipo) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(tipo.name(), TipoItemPedido.LANCHE));
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(tamanho.name(), TipoItemPedido.BATATA));
    }

    @Override
    public void setBrinde(TipoBrinde brinde) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(brinde.name(), TipoItemPedido.BRINDE));
    }

    @Override
    public void setBebida(TipoBebida bebida) {
        pedido.adicionarItemForaCaixa(new ItemPedido(bebida.name(), TipoItemPedido.BEBIDA));
    }

    public Pedido build() {
        return pedido;
    }
}
