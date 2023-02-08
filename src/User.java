public class User {
    private int money;

    public User(){
       this.money = (int) (Math.random()*1000+1);
    }
    public int getMoney(){
        return money;
    }
}
