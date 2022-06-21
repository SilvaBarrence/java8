import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do c�digo");
		palavras.add("caelum");

//		palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));
//		palavras.sort(Comparator.comparing(s -> s.length()));
//		palavras.sort(Comparator.comparing(String::length)); 
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
//		palavras.forEach(s -> System.out.println(s));
		palavras.forEach( System.out::println);
	}

}
