import java.util.Scanner;
public class dog {
    Scanner scan = new Scanner(System.in);
    public String name(String name) {
        System.out.println("Digite o nome do seu cachorro: ");
        return name = scan.next();
    }
    public String tip(String tip) {
        System.out.println("Digite a raça do seu cachorro: ");
        return tip = scan.next();
    }
    public int year_old(int year_old) {
        System.out.println("Digite a idade do seu cachorro: ");
        return year_old = scan.nextInt();
    }
    public double height (double height) {
        System.out.println("Digite o peso do seu cachorro: ");
        return height = scan.nextDouble();
    }
    public String color(String color) {
        System.out.println("Digite a cor do seu cachorro: ");
        return color = scan.next();
    }
}
