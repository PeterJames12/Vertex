package beer.replacer;

/**
 * @author Igor Hnes on 9/4/17.
 */
public class ReplaceBeerImpl implements ReplaceBeer {

    @Override
    public String replace(String oldText, String newText) {
        return oldText.replace("stop", newText);
    }
}
