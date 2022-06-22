import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

//		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
//		cursos.forEach(s -> System.out.println(s.getAlunos()));

//		cursos.stream()
//		.filter(c -> c.getAlunos() > 50)
//		.forEach(s -> System.out.println(s.getAlunos()));

//		cursos.stream().map(Curso::getNome).forEach(System.out::println);

//		Optional<Curso> findAny = cursos.stream()
//		.filter(c -> c.getAlunos() > 50)
//		.findFirst();

//		OptionalDouble average = cursos.stream().mapToInt(c -> c.getAlunos()).average();
//		System.out.println(average.getAsDouble());
		
		cursos = cursos.stream()
				.filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
		
		
	}

}
