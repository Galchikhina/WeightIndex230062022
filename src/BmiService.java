public class BmiService {
    public int calculate(int height, int weight) {
        int weightIndex = height / weight;
        return weightIndex;
    }
}
