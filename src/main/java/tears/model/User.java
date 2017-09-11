package tears.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alex on 8/17/17.
 */
public class User extends AbstractEntity{

    @Getter @Setter private String name;
    @Getter @Setter private String surname;
    @Getter @Setter private int age;
    @Getter @Setter private String email;
    @Getter @Setter private String password;

}
