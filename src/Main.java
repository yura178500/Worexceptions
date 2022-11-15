public class Main {
    public static void main(String[] args) {
        boolean sucses = Data.checkDate("test","test","test");
        if (sucses) {
            System.out.println("Данные верны");
        } else {
            System.out.println("Данные не верны");
        }
    }
}