public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println();
        System.out.println("Индекс массы тела, рост 167, вес 55");
        System.out.println(service.calculate(167, 55));

        System.out.println();
        System.out.println("Индекс массы тела, рост 170, вес 60");
        System.out.println(service.calculate(170, 60));

    }
}
