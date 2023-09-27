public class BmiService {

    public double calculate(double height, double weight){

        double index;
        if (weight > 0) {
            index = weight / (height*height);
        } else {
            index = 0;
        }
        return index;
    }
}