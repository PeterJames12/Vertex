package io;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * @author Vladimir on 9/4/2017.
 */
public interface UserWriter {
    void saveToFile(List<User> users) throws IOException;
}
