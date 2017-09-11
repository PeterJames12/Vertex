package tears.model;

/**
 * @author Vladimir on 8/31/2017.
 */
public abstract class AbstractEntity {

    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
