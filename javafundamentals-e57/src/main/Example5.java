package main;

import java.util.stream.Stream;

public class Example5 {

	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8,9)
				.parallel()
				// some things
				.forEachOrdered(n -> {
					System.out.println(Thread.currentThread().getName() + " " + n);
				});

	}
}
