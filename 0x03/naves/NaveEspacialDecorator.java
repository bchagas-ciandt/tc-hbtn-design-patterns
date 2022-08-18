public class NaveEspacialDecorator extends NaveEspacial{
    private NaveEspacial nave;

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial.getSaude(), naveEspacial.getAtaque());
        this.nave = naveEspacial;
    }

    @Override
    public int getSaude() {
        return nave.getSaude();
    }

    @Override
    public int getAtaque() {
        return nave.getAtaque();
    }
}
