public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia tipo, String nome) {
        if(tipo == TipoMedia.MP3) {
            System.out.println("Reproduzindo MP3: "+ nome);
        }
        if (tipo == TipoMedia.VLC) {
            System.out.println("Reproduzindo VLC: "+ nome);
        }
    }
}
