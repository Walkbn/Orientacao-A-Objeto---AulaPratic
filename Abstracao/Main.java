package Abstracao;
public class Main{
    public static void main (String[]args) {
        Carro onix = new Carro ("Chevrolet", "Onix", 2020, 0);
        Carro hb20 = new Carro ("Hyundai", "HB20", 2022, 0);
        Carro tiggo = new Carro ("Caoa Cherry", "Tiggo", 2024, 0);
        Carro haval = new Carro ("GWM", "Haval", 2024, 0);
        onix.aumentarVelocidade();
        hb20.aumentarVelocidade();
        tiggo.aumentarVelocidade();
        haval.aumentarVelocidade();
    }
}