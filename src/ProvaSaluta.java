public class ProvaSaluta {
    public static void main(String[] args) {
        Saluta thread1 = new Saluta("Michele");
        Saluta thread2 = new Saluta("Andrea");
        Saluta thread3 = new Saluta("Giovanni");
        thread1.run();
        thread2.run();
        thread3.run();
    }
}
