public class CreditPaymentService {
    public int calculate(int creditTotalAmountRub, double ratePercent, int termCreditYear) {
        double monthlyRate = ratePercent / (100 * 12);
        int monthCredit = termCreditYear * 12;
        double denominator = 1 - Math.pow((1 + monthlyRate), -monthCredit);
        int monthlyPayment = (int) (creditTotalAmountRub * (monthlyRate / denominator));
        return monthlyPayment;
    }
}
