package Dog;
import java.util.Scanner;
public class actions {
    Scanner scan = new Scanner(System.in);
    index index = new index();
    public void bark(String name) {
        System.out.println(name + " está latindo!");
    }
    public void eat(String name) {
        System.out.println("Digite o que o " + name + " irá comer: ");
        String eat = scan.nextLine();
        System.out.println(name + " está comendo " + eat);
    }
    public void pick_object(String name) {
        System.err.println("Digite o que o " + name + " irá pegar: ");
        String pick_object = scan.nextLine();
        System.out.println(name + " Pegou " + pick_object);
    }
    public void play(String name) {
        System.out.println(name + " Está brincando!");
    }
    public void sleep(String name) {
        System.out.println(name + " Está dormindo!");
    }
}
