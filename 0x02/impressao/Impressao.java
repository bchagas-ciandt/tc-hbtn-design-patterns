public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao() {
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public double calcularTotal() {
        if (ehFrenteVerso) {
            return (paginasColoridas * valorColoridasFrenteVerso) + ((paginasTotais - paginasColoridas) * valorPretoBrancoFrenteVerso);
        }
        return (paginasColoridas * valorColoridasFrenteApenas) + ((paginasTotais - paginasColoridas) * valorPretoBrancoFrenteApenas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("total de paginas: " + paginasTotais + ", ");
        sb.append("total coloridas: " + paginasColoridas + ", ");
        sb.append("total preto e branco: " + (paginasTotais - paginasColoridas) + ", ");
        if (ehFrenteVerso) {
            sb.append("frente e verso. ");
        } else {
            sb.append("frente apenas. ");
        }
        sb.append(String.format("total: R$ %.2f", calcularTotal()));
       return sb.toString();
    }
}
