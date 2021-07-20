package ru.task7.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//з с файлами с тестами  ( )
public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.runFirstStreamTask();
    main.runSecondStreamTask();
    main.runThirdStreamTask();
    main.runFourStreamTask();
  }

  public void runFirstStreamTask() {
    Random random = new Random();

    Set<Integer> integerSet =
        Stream.generate(
                () -> {
                  return random.nextInt(1000) - 500;
                })
            .filter(integer -> integer > 0 && integer % 2 != 0)
            .map(integer -> integer * 2)
            .peek(System.out::println)
            .limit(15)
            .collect(Collectors.toSet());

    System.out.println(Arrays.toString(integerSet.toArray()));
    System.out.println(integerSet.stream().mapToInt(Integer::intValue).sum());
  }

  public void runSecondStreamTask() {
    List<String> names1 = new ArrayList<>();
    names1.add("Nikita");
    List<String> names2 = new ArrayList<>();
    names2.add("Nikita");
    List<String> names3 = new ArrayList<>();
    names3.add("Maestro");
    List<String> names4 = new ArrayList<>();
    names4.add("Rose");
    System.out.println(
        Stream.of(names1, names2, names3, names4)
            .flatMap(Collection::stream)
            .distinct()
            .collect(Collectors.toList()));
  }

  public void runThirdStreamTask() {
    Map<String, Double> map = new HashMap<>();
    map.put("Asya", 67.0);
    map.put("Mark", 76.0);
    map.put("Rick", 78.0);
    System.out.println(
        map.values().stream().mapToDouble(Double::doubleValue).average().getAsDouble());
  }

  public void runFourStreamTask() {
    List<Long> list1 = new ArrayList<>();
    list1.add(1L);
    list1.add(2L);
    list1.add(3L);
    List<Long> list2 = new ArrayList<>();
    list2.add(3L);
    list2.add(4L);
    list2.add(5L);

    Set<Long> result =
        list1.stream().distinct().filter(list2::contains).collect(Collectors.toSet());
    result.forEach(System.out::println);
  }
}
