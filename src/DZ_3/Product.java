package DZ_3;

public class Product extends Money {
    public double operationMinusMoney(int dn, int kp, double sum) {
        double balance = Double.parseDouble(dn + "." + kp);
        if (balance > sum)
            return balance - sum;
        return balance;
    }

    public double operationPlusMoney(int dn, int kp, double sum) {
        double balance = Double.parseDouble(dn + "." + kp);
            return balance + sum;
    }

    public void printResul(double res){
        System.out.println("Summa balance: "+ res);
    }
}
