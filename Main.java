public class Main {
    public static void main(String[] args) {
        BmiService BMI = new BmiService();
                double BMIIvan = BMI.calculate(80,1.72);
        System.out.println(BMIIvan);
    }
}
