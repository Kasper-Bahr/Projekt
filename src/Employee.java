import java.util.Scanner;

public class Employee {
private final int cost = 100;

public boolean hireEmployee(User user){
    Scanner input = new Scanner(System.in);
    System.out.println("Masz"+ user.getMoney()+ "gotowki.");
    System.out.println("czy chcesz zatrudnić pracownika za. "+ cost + "gotowki (tak/nie)");
    String answer = input.nextLine();

    if (answer.equalsIgnoreCase("tak")){
        if(user.getMoney() >= cost){
            System.out.println("zatrudniono pracownika za " + cost + "gotowki");
            return true;
        } else {
            System.out.println("nie masz wystaczjaco duzo gotowki na pracownika");
            return false;
        }
    }else {
        System.out.println("nie zatrudniono pracownika");
        return false;
    }
}
}
