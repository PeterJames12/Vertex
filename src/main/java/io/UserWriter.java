package io;

import java.io.IOException;
import java.util.List;

/**
 * @author Igor Hnes on 9/4/17.
 */
public interface UserWriter {

    void save(List<User> users) throws IOException;
}
