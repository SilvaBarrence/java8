import java.util.ArrayList;
import java.util.List;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));

		palavras.forEach(s -> System.out.println(s));
	}

}
