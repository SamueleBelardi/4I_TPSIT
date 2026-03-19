public class Saluta extends Thread {

    String nome;

    public Saluta(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Sono il thread " + nome;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(nome + i);
            try {
                sleep(1);
            } catch (InterruptedException e) {
                System.out.println("non è andato in sleep");
            }

        }
    }
}
