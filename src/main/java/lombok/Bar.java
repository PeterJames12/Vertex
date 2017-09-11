package lombok;

import java.time.LocalTime;
import java.util.List;

/**
 * @author Igor Hnes on 9/7/17.
 */
@Builder
public class Bar {

    private String name;

    private LocalTime openTime;

    private LocalTime closeTime;

    @Singular
    private List<String> barmens;
}
