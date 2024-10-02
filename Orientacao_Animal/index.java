package Orientacao_Animal;
public class index {
    public static void main(String[] args) {
        Animal fox = new Animal();
        fox.nome = "Fox";
        fox.especie = "Foxy";
        fox.cor = "Cinza";
        fox.idade = 5;
        fox.dados();
        
        Animal pivot = new Animal();
        pivot.nome = "Pivot";
        pivot.especie = "Papagaio";
        pivot.cor = "Verde";
        pivot.idade = 7;
        pivot.dados();

        Animal bratt = new Animal();
        bratt.nome = "Bratt";
        bratt.especie = "Pitbull";
        bratt.cor = "Cinza Claro";
        bratt.idade = 4;
        bratt.dados();
    }
}