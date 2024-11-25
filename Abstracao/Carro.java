package Abstracao;
public class Carro {
    String marca, modelo;
    int ano, velocidade;
    Carro (String marca, String modelo, int ano, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }
    public void aumentarVelocidade() {
        System.out.println("---------------------------");
        System.out.println("O " + modelo + " da marca " + marca + " está à " + velocidade + " km/h");
        System.out.println("Você acabou de aumentar a velocidade.");
        System.out.println("A velocidade atual agora é " + velocidade + " km/h");
    }
}