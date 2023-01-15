public class OyunFactory {

    public IOyun factoryMethod(String oyunTipi){
        switch (oyunTipi){
            case "Atari":
                return new Atari();
            case "PC":
                return new PC();
            case "PS":
                return new PS();
            default:
                throw new RuntimeException(oyunTipi + " desteklenmemektedir");
        }
    }
}
