public class CheckingAccount {
    private String name;
    private int age;
    private double checkingAmount;
    private String username;
    private String password;

    public CheckingAccount(String _name, String _user, String _pass) {
        name = _name;
        username = _user;
        password = _pass;
    }

    public void withdrawMoney(int amount){
        checkingAmount -= amount;
    }

    public String toString() {
        return "Hi " + name + "!";
    }

    public static void main(String[] args) {
        CheckingAccount user1 = new CheckingAccount("Charles Wang", "thewangclass", "theverybestpasswordthereeverwas");
        System.out.println(user1);

        CheckingAccount user2 = new CheckingAccount("My Alter Ego", "classwangthe", "notthebestpassword");
        System.out.println(user2);
    }
}
