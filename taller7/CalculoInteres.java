public class CalculoInteres {
    public static void main (String[] args) {
        double monto = 1000;
        int años = 10;
        double interes = 0.05;
        double total, profit;

        for (int i = 1; i <= 10; i++) {
            profit = monto * interes;
            total = monto + profit;
            monto = total;
            System.out.println("El monto de el año " + i + " es de " + total);
        }
    }
}
