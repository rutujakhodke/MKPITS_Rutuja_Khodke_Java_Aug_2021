import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "FourW")
public class FourWheeler extends Vehicle{
    private String strwheel;

    public String getStrwheel() {
        return strwheel;
    }

    public void setStrwheel(String strwheel) {
        this.strwheel = strwheel;
    }
}

