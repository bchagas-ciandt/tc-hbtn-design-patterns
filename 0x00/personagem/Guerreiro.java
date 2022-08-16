public class Guerreiro extends Personagem{

    public Guerreiro(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.GUERREIRO, inteligencia, forca, vigor, resistencia, destreza);
        if (forca < inteligencia || forca < destreza) {
            throw new IllegalArgumentException("Atributos invalidos para GUERREIRO");
        };
    }

    @Override
    public double getDanoAtaque() {
        return (inteligencia * 0.05) + (forca * 0.8) + (destreza * 0.1) + (vigor * 0.05);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
