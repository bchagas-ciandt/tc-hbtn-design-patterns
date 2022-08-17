import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BebidaComLeite extends BebidaDecorator{

    public BebidaComLeite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> listRetorno = super.obterIngredientes();
        listRetorno.add("leite");
        return listRetorno;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}
