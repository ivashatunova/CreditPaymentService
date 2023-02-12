public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditTotalAmountRub = 1_000_000;
        double ratePercent = 9.99;

        int termCreditYear1 = 1;
        int monthlyPayment1Year = service.calculate(creditTotalAmountRub, ratePercent, termCreditYear1);
        System.out.println(monthlyPayment1Year);

        int termCreditYear2 = 2;
        int monthlyPayment2Year = service.calculate(creditTotalAmountRub, ratePercent, termCreditYear2);
        System.out.println(monthlyPayment2Year);

        int termCreditYear3 = 3;
        int monthlyPayment3Year = service.calculate(creditTotalAmountRub, ratePercent, termCreditYear3);
        System.out.println(monthlyPayment3Year);
    }
}
