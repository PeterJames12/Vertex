package practice_reflect;

import lombok.SneakyThrows;
import lombok.val;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author Vladimir on 9/11/2017.
 */

public class Reflections {
    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("\"\"");

        final String filePath = "src/main/resources/file.txt";

        val wine = Wine.builder()
                .productionYear(1299)
                .name("Martini")
                .name("Inkerman")
                .build();

        final Annotation[] annotations = wine.getClass().getDeclaredAnnotations();

        List<String> list = new LinkedList<>();
        for (Annotation annotation : annotations) {
            list.add(annotation.toString());
        }

        Files.write(Paths.get(filePath), list);

        Map<String, String> map = new TreeMap<>();

        final Class<Wine> wineClass = Wine.class;
        final String simpleWName = wineClass.getSimpleName();

        int count = 1;

        for (Annotation annotation : wineClass.getAnnotations()) {
            map.put(simpleWName + " " + count +
                            " annotation",
                    annotation.toString());
            count++;
        }

        final Class<Beer> beerClass = Beer.class;
        final String simpleBName = beerClass.getSimpleName();

        count = 1;

        for (Annotation annotation : beerClass.getAnnotations()) {
            map.put(simpleBName + " " + count +
                            " annotation",
                    annotation.toString());
            count++;
        }

        final Class<Vodka> vodkaClass = Vodka.class;
        final String simpleVName = vodkaClass.getSimpleName();

        count = 1;

        for (Annotation annotation : vodkaClass.getAnnotations()) {
            map.put(simpleVName + "" + count +
                            " annotation",
                    annotation.toString());
            count++;
        }

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }

        System.out.println();

        map.forEach((key, value) -> System.out.println("Class "
        + key
        + value));
    }
}
