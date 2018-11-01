import java.math.BigDecimal;
import java.math.RoundingMode;

public class En5_4 {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("1");
    BigDecimal b = new BigDecimal("9");
		System.out.println(String.format("(%s / %s) * %s = %s", a, b, b, (a.divide(b, 4, RoundingMode.HALF_UP)).multiply(b)));
	} 
}
