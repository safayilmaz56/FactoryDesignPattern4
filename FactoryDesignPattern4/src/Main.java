public class Main {
    public static void main(String[] args) {
        OyunFactory oyunFactory = new OyunFactory();
        IOyun atariOyunu = oyunFactory.factoryMethod("Atari");
        IOyun pcOyunu = oyunFactory.factoryMethod("PC");
        IOyun psOyunu = oyunFactory.factoryMethod("PS");
        IOyun oyun = oyunFactory.factoryMethod("Konsol");


        atariOyunu.platform();
        pcOyunu.platform();
        psOyunu.platform();
        oyun.platform();
    }
}