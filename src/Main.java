import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    User user = new User();
    Employee employee = new Employee();
    employee.hireEmployee(user);





        Random random = new Random();
        int numProject = random.nextInt(10) + 5;

        Project[] projects = new Project[numProject];



        Scanner input = new Scanner(System.in);

        System.out.println("wybierz poziom trudności projektu:");
        System.out.println("1. łatwy projekt");
        System.out.println("2. średni projekt");
        System.out.println("3. trudny projekt");

        int choice = input.nextInt();
        if (choice == 1)
        {
            System.out.println("wybrano łatwy projekt");
            Project easyProject = new Project("Strona internetowa", 1, 1, 1, 0, 1, 0,"Firma z oknami", "01.04.2020", 500, 3000, 14,"łatwy");
            easyProject.viewProjectDetails();
        } else if (choice == 2) {
            System.out.println("wybrano średni projekt");
            Project mediumProject = new Project("prosta gra dla dzieci", 1, 1, 0, 0, 0, 0,"Przedszkole", "10.06.2020", 500, 1500, 30,"średni");
            mediumProject.viewProjectDetails();
        } else if (choice == 3) {
            Project hardProject = new Project("aplikacja na telefon", 1, 1, 1, 1, 1, 1,"Firma RTVAGD", "10.06.2021", 8000, 30000, 30,"trudny");
            hardProject.viewProjectDetails();
            System.out.println("wybrano trudny projekt");
        }else
        {
            System.out.println("nie poprawny wybór spróbuj ponownie.");
        }
        input.close();

    }
}