import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Emp1 {//Employee class is a Entity object

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String empname;
    private String emailid;

    //    @Embedded //it is used to embed the value object of Address class
    //we can configure home address or office address
    @ElementCollection(fetch = FetchType.EAGER)//we have to make eager to fetch the list of address out of session also
    //it is used for to set the list of object in table
            @JoinTable(name = "empaddress",joinColumns = @JoinColumn(name = "empid"))//to change the table name that was taken automatically by hibernate
    Set<Address> addr1=new HashSet<Address>();

    public Set<Address> getAddr1() {
        return addr1;
    }

    public void setAddr1(Set<Address> addr1) {
        this.addr1 = addr1;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp1{" +
                "id=" + id +
                ", empname='" + empname + '\'' +
                ", emailid='" + emailid + '\'' +
                ", addr1=" + addr1 +
                '}';
    }
}


