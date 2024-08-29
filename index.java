import java.util.Scanner;
public class index {
    static Scanner scan = new Scanner(System.in);
    static dog dog = new dog();
    static actions actions = new actions();
    public static void main(String[] args) {
        int loop = 0, menu = 0, year_old = 0;
        double height = 0;
        String name = "", tip = "", color = "";
        name = dog.name(name);
        tip = dog.tip(tip);
        color = dog.color(color);
        height = dog.height(height);
        year_old = dog.year_old(year_old);
        while (loop==0) {
            menu = menu(menu);
            switch (menu) {
                case 1: actions.bark(name); break;
                case 2: actions.eat(name); break;
                case 3: actions.pick_object(name); break;
                case 4: actions.play(name); break;
                case 5: actions.sleep(name); break;
            }
        }
    }
    public static int menu(int menu) {
        System.out.println("====== Cachorro Virtual ======\nDigite uma opção: \n1 - Latir\n2 - Comer\n3 - Buscar Objeto\n4 - Brincar\n5 - Dormir");
        return menu = scan.nextInt();
    }
}   