public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia tipo, String nome) {
        if(tipo == TipoMedia.MP3) {
            System.out.printf("Reproduzindo MP3: %s", nome);
        }
        if (tipo == TipoMedia.VLC) {
            System.out.printf("Reproduzindo VLC: %s", nome);
        }
    }
}
