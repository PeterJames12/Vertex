package pool.listener.impl;

import pool.listener.EtherListener;
import pool.listener.EtherUserListener;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Igor Hnes on 8/26/17.
 */
public class EtherListenerImpl implements EtherListener {

    private ArrayList<EtherUserListener> etherActionListeners = new ArrayList<>();
    private int etherUserCount;

    @Override
    public ArrayList<EtherUserListener> getListeners() {
        return etherActionListeners;
    }

    @Override
    public void add(EtherUserListener actionListener) {
        System.out.println("Started " + actionListener.getClass().getName() + " " + etherUserCount);

        etherUserCount++;
        etherActionListeners.add(actionListener);
        if (etherUserCount == 10) {
            send(etherActionListeners);
        }
        removeAll();
    }

    @Override
    public void remove(EtherUserListener actionListener) {
        etherActionListeners.remove(actionListener);
    }

    @Override
    public void removeAll() {
        etherActionListeners.clear();
    }

    @Override
    public void notify(String text) {
        etherActionListeners.forEach(s -> s.doAction(text));
    }

    public void createMessage(String message) {
        System.out.println("send message " + message);
        notify(message);
    }

    private void send(List<EtherUserListener> etherUserListener) {
        etherUserListener.forEach(s -> System.err.println("sent " + s.getClass().getName()));
        etherUserCount = 0;
    }
}
