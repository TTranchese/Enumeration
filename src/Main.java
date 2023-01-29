public class Main {
	public static void main(String[] args) {
		enum Month{
			JANUARY,
			FEBRUARY,
			MARCH,
			APRIL,
			JUNE,
			JULY,
			AUGUST,
			SEPTEMBER,
			OCTOBER,
			NOVEMBER,
			DECEMBER
		}
		for (Month month:  Month.values()) {
			if(month.name().toLowerCase().endsWith("y")){
				System.out.println(month.toString() + " ends with y");
			} else System.out.println(month.toString() + " doesn't end with y");
		}
	}
}