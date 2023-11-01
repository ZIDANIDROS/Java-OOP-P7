package App;

public class MainApp {
    public static void main(String[] args) throws Exception {

        System.out.println("\n");

        //merujuk ke class Luar
        System.out.println("Hasil Run Class Luar :");
        Luar luar = new Luar(); // Mengganti "App.Luar 1" menjadi "luar"
        Luar.Dalam dalam = luar.new Dalam(); // Mengganti "1.new" menjadi "luar.new"
        dalam.bicara();

        System.out.println("\n");

        //merujuk ke class MOuter
        System.out.println("Hasil Run Class MOuter :");
        MOuter that = new MOuter();
        that.go((int) (Math.random() * 100), (int) (Math.random() * 100));

    }
}
