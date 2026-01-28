package tech.codoverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record MinMax(int min, int max) {
}

public class StreamApisApp {

    void main() {
        runForFlatMap();
    }

    void runForFlatMap() {
        List<List<Integer>> list = List.of(
                List.of(6, 5, 7),
                List.of(4, 9, 3),
                List.of(8, 0, 2, 1));

        list.stream().flatMap(l -> l.stream().map(i -> i))
                .forEach(IO::println);
    }

    void runForTeeing() {
        List<Integer> list = List.of(9, 7, 5, 3, 1, 0, 2, 4, 6);

        Map<String, Long> result = list.stream()
                .collect(Collectors.teeing(
                        Collectors.filtering(n -> n % 2 == 0, Collectors.counting()),
                        Collectors.filtering(n -> n % 2 != 0, Collectors.counting()),
                        (even, odd) -> Map.of("Even", even, "Odd", odd)));

        IO.println(result);
    }

    void runForCollecting() {
        var intList = List.of(9, 7, 5, 3, 1, 0, 2, 4, 6, 8);

        var intResult = intList.stream()
                .collect(Collectors.groupingBy(i -> i > 5));
        IO.println(intResult);

        var strList = List.of("Java", "Python", "Javascript", "Dart", "Typescript");
        var strResult = strList.stream()
                .collect(Collectors.joining(", ", "Programming Lanagaue", "2026"));
        IO.println(strResult);

    }

    void runForTerminalOperations() {
        List<String> list = List.of("Java", "Javascript", "Python", "Dart", "Typescript");
        // sum, product, max/min, string join
        var result = list.stream().reduce("", (a, b) -> a + (a.isBlank() ? "" : ", ") + b);
        IO.println(result);

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        IO.println(intList.stream().reduce(0, Integer::min));

        IO.println(List.of(1, 2, 3, 4, 5).parallelStream().reduce(0, (a, b) -> a + b, Integer::sum));
    }

    void runForTakeAndDrop(List<Integer> list) {
        list.stream()
                .dropWhile(i -> !isPrime(i))
                .forEach(i -> IO.print(i + ", "));
    }

    boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    void runForMap() {
        var doc1 = new DocumentEntity(1, "Document 1", "Document 1 contents", 100);
        var doc2 = new DocumentEntity(2, "Document 2", "Document 2 contents", 160);
        var doc3 = new DocumentEntity(3, "Document 3", "Document 3 contents", 80);
        var doc4 = new DocumentEntity(4, "Document 4", "Document 4 contents", 219);
        var doc5 = new DocumentEntity(5, "Document 5", "Document 5 contents", 64);
        var doc6 = new DocumentEntity(6, "Document 6", "Document 6 contents", 516);

        List<DocumentEntity> list = List.of(doc1, doc2, doc3, doc4, doc5, doc6);
        list.stream()
                .map(DocumentDTO::from)
                .filter(dto -> dto.wordCount() > 100)
                .forEach(System.out::println);
    }

    void runForStreamOperations() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 4, 3, 2, 1, 9, 8, 7, 6, 5, 0, 1, 2, 3, 4);

        list.stream()
                .sorted()
                .distinct()
                .skip(2)
                .limit(7)
                .map(i -> i + "")
                .map(i -> i.concat(" + 0"))
                .forEach(IO::println);
    }

    void runForStreamCharacteristics() {
        Stream<Integer> stream = Arrays.stream(new Integer[] { 4, 3, 2, 1, 9, 8, 7, 6, 5, 0, 1, 2, 3, 4 });
        var inter1 = stream.filter(i -> i % 2 != 0);
        var inter2 = inter1.filter(i -> i > 3);
        inter2.forEach(IO::println);
        // stream.filter(i -> i % 2 == 0).forEach(System.out::println);
    }

    int sumAllEvenNumbersWithStream(int[] numbers) {
        return Arrays.stream(numbers).filter(i -> i % 2 == 0).reduce(0, Integer::sum);
    }

    int sumAllEvenNumbers(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                result += number;
            }
        }
        return result;
    }

}
