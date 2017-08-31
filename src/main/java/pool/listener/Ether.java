package pool.listener;

import pool.listener.impl.EtherListenerImpl;
import pool.listener.users.UserFirst;

/**
 * @author Igor Hnes on 8/26/17.
 */
public class Ether {

    public static void main(String[] args) {

        final EtherListenerImpl etherListener = new EtherListenerImpl();

        for (int i = 0; i < 100; i++) {
            etherListener.add(new UserFirst());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
