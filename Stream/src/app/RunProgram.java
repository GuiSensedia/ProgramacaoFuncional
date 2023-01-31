package app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RunProgram {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		Stream<Integer> stream1 = list.stream(); //Criando uma stream a partir de uma lista.
		System.out.println(Arrays.toString(stream1.toArray()));
		System.out.println();
		
		Stream<String> stream2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(stream2.toArray()));
		System.out.println();
		
		Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);//Com .iterate, recebe dois argumentos, o primeiro é o valor inicial, e o segundo é a regra de montagem
		System.out.println(Arrays.toString(stream3.limit(10).toArray())); // .limit é usado para definir o tamanho dos elementos da stream
		System.out.println();
		
		Stream<Long> stream4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(stream4.limit(10).toArray()));
		System.out.println();
	

		
	}
}
