package lombok;

import java.time.LocalTime;

/**
 * @author Igor Hnes on 9/7/17.
 */
public class BarService {

    public static void main(String[] args) {

        final Bar bar = Bar.builder()
                .openTime(LocalTime.of(7, 0))
                .closeTime(LocalTime.of(23, 0))
                .barmen("Alex")
                .barmen("Smit")
                .barmen("Bob")
                .build();
    }
}
