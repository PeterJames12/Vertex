package tears.model;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class Transaction {

    private String account;
    private String status;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
