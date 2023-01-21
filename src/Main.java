import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("wybierz poziom trudności projektu:");
        System.out.println("1. łatwy projekt");
        System.out.println("2. średni projekt");
        System.out.println("3. trudny projekt");

        int choice = input.nextInt();
        if (choice == 1)
        {
            System.out.println("wybrano łatwy projekt");
        } else if (choice == 2) {
            System.out.println("wybrano średni projekt");
        } else if (choice == 3) {
            System.out.println("wybrano trudny projekt");
        }else
        {
            System.out.println("nie poprawny wybór spróbuj ponownie.");
        }
        input.close();

    }
}