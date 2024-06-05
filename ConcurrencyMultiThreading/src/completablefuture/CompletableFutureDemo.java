package completablefuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 5, 7, 4, 1, 8);

		try {

			list.stream().map(num -> CompletableFuture.supplyAsync(() -> getNumber(num)))
					.map(CompletableFuture -> CompletableFuture.thenApply(n -> n * n)).map(t -> t.join())
					.forEach(s -> System.out.println(s));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int getNumber(int n) {

		return n * n;

	}

}
