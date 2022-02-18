import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "TwoW")//it will change the name of column data that are @DiscriminatorColumn
//are marked
public class TwoWheeler extends Vehicle {
    private String strhandle;

    public String getStrhandle() {
        return strhandle;
    }

    public void setStrhandle(String strhandle) {
        this.strhandle = strhandle;
    }
}
