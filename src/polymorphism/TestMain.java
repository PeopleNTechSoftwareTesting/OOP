package polymorphism;

public class TestMain {
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		System.out.println(cal.areaOfLand(10, 15));
		System.out.println(cal.areaOfLand(15, "BD"));
		System.out.println(cal.areaOfLand("USA", 1));
		System.out.println(cal.areaOfLand(10, 15, 25));
		System.out.println(cal.areaOfLand(5, 16, 18, 26));

		ModernCalculator mdcal = new ModernCalculator();
		System.out.println(mdcal.areaOfLand(5, 16, 18, 26));

	}
}
