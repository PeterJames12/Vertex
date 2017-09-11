package lombok;

import sun.security.rsa.RSAPadding;

import java.security.Key;
import java.security.interfaces.RSAKey;
import java.util.Scanner;


/**
 * @author Igor Hnes on 9/7/17.
 */
@AllArgsConstructor
public class ValService {

    @NonNull
    private String name;

    public static void main(String[] args) {

        val valService = new ValService(null);
    }
}
