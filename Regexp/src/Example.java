import java.util.regex.Pattern;

public class Example {
	public static final void main(String [] args) {
		System.out.println(Pattern.matches("\\w*@{1}\\w*[.][\\w&&[^0-9]]{3}", "cato@yahoo.cvm"));
	}
}
