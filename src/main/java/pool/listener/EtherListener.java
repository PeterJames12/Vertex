package pool.listener;

import java.util.ArrayList;

/**
 * @author Igor Hnes on 8/26/17.
 */
public interface EtherListener {


    ArrayList<EtherUserListener> getListeners();

    void add(EtherUserListener actionListener);

    void remove(EtherUserListener actionListener);

    void removeAll();

    void notify(String text);
}
