import javax.persistence.*;

@Entity
public class User1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String uname;
    private String emailid;
    @OneToOne//it will map one class with another class fields
    private Vehicle vob1;//making object of Vehicle class

    public Vehicle getVob1() {
        return vob1;
    }

    public void setVob1(Vehicle vob1) {
        this.vob1 = vob1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
}
