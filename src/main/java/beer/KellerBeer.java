package beer;

/**
 * @author Vladimir on 8/21/2017.
 */
public class KellerBeer implements Beer{
    @Override
    public void drink() {
        System.out.println("You are drinking KellerBeer.");
    }
}
