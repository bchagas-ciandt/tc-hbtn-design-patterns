public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanho, int totalDePaginas, int quantidadeDePaginasColoridas, boolean ehFrenteVerso) {
        Impressao impressao = null;
        if (tamanho == TamanhoImpressao.A2) {
            impressao = new Impressao();
            impressao.setEhFrenteVerso(ehFrenteVerso);
            impressao.setPaginasTotais(totalDePaginas);
            impressao.setPaginasColoridas(quantidadeDePaginasColoridas);
            if (ehFrenteVerso) {
                impressao.setValorColoridasFrenteVerso(0.28);
                impressao.setValorPretoBrancoFrenteVerso(0.18);
            } else {
                impressao.setValorColoridasFrenteApenas(0.32);
                impressao.setValorPretoBrancoFrenteApenas(0.22);
            }
        } else if (tamanho == TamanhoImpressao.A3) {
            impressao = new Impressao();
            impressao.setEhFrenteVerso(ehFrenteVerso);
            impressao.setPaginasTotais(totalDePaginas);
            impressao.setPaginasColoridas(quantidadeDePaginasColoridas);
            if (ehFrenteVerso) {
                impressao.setValorColoridasFrenteVerso(0.25);
                impressao.setValorPretoBrancoFrenteVerso(0.15);
            } else {
                impressao.setValorColoridasFrenteApenas(0.30);
                impressao.setValorPretoBrancoFrenteApenas(0.20);
            }
        } else {
            impressao = new Impressao();
            impressao.setEhFrenteVerso(ehFrenteVerso);
            impressao.setPaginasTotais(totalDePaginas);
            impressao.setPaginasColoridas(quantidadeDePaginasColoridas);
            if (ehFrenteVerso) {
                impressao.setValorColoridasFrenteVerso(0.20);
                impressao.setValorPretoBrancoFrenteVerso(0.10);
            } else {
                impressao.setValorColoridasFrenteApenas(0.25);
                impressao.setValorPretoBrancoFrenteApenas(0.15);
            }
        }
        return impressao;
    }
}
