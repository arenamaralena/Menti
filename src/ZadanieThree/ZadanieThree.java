package ZadanieThree;

public class ZadanieThree {
    public static void main(String[] args) {
        Tool multitool = new Opener(new Screwdriver(new Knife()));
        multitool.hardWork();
    }
}
