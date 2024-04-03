public class Main {
    public static void main(String[] args) {
       BmiService service = new BmiService();

       double heightM = 1.86;
       int weightKg = 92;
       double bmiKgm2 = service.calculate (weightKg, heightM);

 System.out.println (Math.round (bmiKgm2));
    }
}