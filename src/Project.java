public class Project {

  private String projectName;
  private int frontEnd, backEnd, database, mobile, wordPress, prestaShop;
  private String client;
  private String deadline;
  private int penalty;
  private int price;
  private int paymentPeriod;
  private String complexity;

    public Project(String projectName, int frontEnd, int backEnd, int database, int mobile, int wordPress, int prestaShop, String client, String deadline, int penalty, int price, int paymentPeriod, String complexity) {
        this.projectName = projectName;
        this.frontEnd = frontEnd;
        this.backEnd = backEnd;
        this.database = database;
        this.mobile = mobile;
        this.wordPress = wordPress;
        this.prestaShop = prestaShop;
        this.client = client;
        this.deadline = deadline;
        this.penalty = penalty;
        this.price = price;
        this.paymentPeriod = paymentPeriod;
        this.complexity = complexity;
    }
    public void viewProjectDetails(){
        System.out.println("Nazwa projektu: " + projectName);
        System.out.println("Ilość dni roboczych");
        System.out.println("Front-End" + frontEnd);
        System.out.println("Back-End " + backEnd);
        System.out.println("Database " + database);
        System.out.println("Mobile" + mobile);
        System.out.println("WordPress" + wordPress);
        System.out.println("prestaShop" + prestaShop);
        System.out.println("Klient" + client);
        System.out.println("Termin oddania: " + deadline);
        System.out.println("Wyskość kara za przekorczenia terminu" + penalty);
        System.out.println("Cena jaką klient zapłaci za realizacje projektu" + price);
        System.out.println("Termin płatności: " + paymentPeriod);
        System.out.println("Poziom złożoności " + complexity);

    }

    public String getProjectName() {
        return projectName;
    }

    public int getFrontEnd() {
        return frontEnd;
    }

    public int getBackEnd() {
        return backEnd;
    }

    public int getDatabase() {
        return database;
    }

    public int getMobile() {
        return mobile;
    }

    public int getWordPress() {
        return wordPress;
    }

    public int getPrestaShop() {
        return prestaShop;
    }

    public String getClient() {
        return client;
    }

    public String getDeadline() {
        return deadline;
    }

    public int getPenalty() {
        return penalty;
    }

    public int getPrice() {
        return price;
    }

    public int getPaymentPeriod() {
        return paymentPeriod;
    }

    public String getComplexity() {
        return complexity;
    }
}
