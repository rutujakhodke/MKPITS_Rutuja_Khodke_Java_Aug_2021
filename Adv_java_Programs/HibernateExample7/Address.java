import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable //value object is marked as @Embeddable
//it is optional
public class Address implements Serializable {
    private static final long serialVersionUID = 3598949303430179531L;
    private int pincode;
    private String city;
    private String state;

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pincode=" + pincode +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

