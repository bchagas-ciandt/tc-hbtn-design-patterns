import java.util.Objects;

public class ItemPedido {

    private String nome;
    private TipoItemPedido tipo;

    public ItemPedido() {
    }

    public ItemPedido(String nome, TipoItemPedido tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoItemPedido getTipo() {
        return tipo;
    }

    public void setTipo(TipoItemPedido tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "        - " + getTipo().name() + " " +getNome();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedido that = (ItemPedido) o;
        return getTipo() == that.getTipo() && Objects.equals(getNome(), that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo.toString().charAt(0), nome.charAt(0));
    }


}
