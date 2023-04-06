public class CreditPaymentService {
    public int calculate(int amount, double percent, int time) {
        int month= time*12;
        double i = (percent * .01) / 12;

        double  result;
        result = amount * (Math.pow((1 + i), month) * i) / ((Math.pow((1+i),month)) -1);
        return (int) result;
    }

}
