public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.65;
        double weight = 74.0;

        double index = service.calculate(height, weight);
        int indexResult = (int) index;
        System.out.println(indexResult);
    }
}