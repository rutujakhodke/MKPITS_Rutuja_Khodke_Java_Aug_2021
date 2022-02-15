import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
@Entity
public class User2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String uname;
    private String emailid;
    @OneToMany(mappedBy = "uob1")//vehicle2 table mapped user2 in single table
    //it will mapped one user data with multiple vehicle data(one user have multiple vehicles)
    private Collection<Vehicle2> vob1=new ArrayList<Vehicle2>();

    public Collection<Vehicle2> getVob1() {
        return vob1;
    }

    public void setVob1(Collection<Vehicle2> vob1) {
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
