package pool.listener.users;

import pool.listener.EtherUserListener;

/**
 * @author Igor Hnes on 8/26/17.
 */
public class UserFirst implements EtherUserListener {

    @Override
    public void doAction(String text) {
        System.out.println(text + " " + "from " + this.getClass().getName());

    }
}
