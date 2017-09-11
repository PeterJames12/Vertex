package lombok;

import annotation.Todo;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Igor Hnes on 9/7/17.
 */
@RequiredArgsConstructor(staticName = "of")
@Accessors(fluent = true)
public class Wine {

    @Getter
    private final String name;

    private int avb = 16;

    @Getter
    @Setter
    private int producedYear;

    public enum WINE_TYPE {WHITE,RED, DRY,}

    private Map<WINE_TYPE, Integer> wineMap = new HashMap<>();
}
