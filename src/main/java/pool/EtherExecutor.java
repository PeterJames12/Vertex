package pool;

/**
 * @author Igor Hnes on 8/23/17.
 */
public class EtherExecutor {

    public static void main(String[] args) throws InterruptedException {

        String address = "0xdjerhj";

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50) {
                final TransactionalExecutor transactionalExecutor = new TransactionalExecutor("0.01", address);
                transactionalExecutor.setDaemon(true);
                transactionalExecutor.start();
                transactionalExecutor.join();

                final EtherEmailSender etherEmailSender = new EtherEmailSender(address);
                final Thread thread = new Thread(etherEmailSender);
                thread.setDaemon(true);
                thread.start();
            }
        }
    }

    private static class TransactionalExecutor extends Thread {

        private final String ether;
        private final String address;

        private TransactionalExecutor(String ether, String address) {
            this.ether = ether;
            this.address = address;
        }

        {
            setName("Transactional executor");
        }

        @Override
        public void run() {
            sendTransaction(ether, address);
        }

        private void sendTransaction(String ether, String address) {
            System.out.println(Thread.currentThread().getName() + " started");
            System.out.println(ether + " sent to " + address);
        }
    }

    private static class EtherEmailSender implements Runnable {

        private final String address;

        private EtherEmailSender(String address) {
            this.address = address;
        }

        @Override
        public void run() {
            sendMessage(address);
        }

        private void sendMessage(String address) {
            System.out.println(Thread.currentThread().getName() + " started");
            System.out.println("message successful sent to " + address);
        }
    }
}
