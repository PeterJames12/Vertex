package practice_reflect;

import lombok.Builder;

import lombok.Singular;
import lombok.experimental.Accessors;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Vladimir on 9/11/2017.
 */
@Builder
@Accessors(fluent = true)
@Deprecated
@Sober
@Drunk
public class Wine {
    @Singular
    private List<String> names = new LinkedList<>();

    private int productionYear;
}
