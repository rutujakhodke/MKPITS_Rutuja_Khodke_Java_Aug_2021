import javax.persistence.*;

@Entity
public class Employee {//Employee class is a Entity object
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String empname;
    private String emailid;

    @Embedded //it is used to embed the value object of Address class in entity class

    private Address aobj;//It is a Address class object .Address class object is a value object

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

    public Address getAobj() {
        return aobj;
    }

    public void setAobj(Address aobj) {
        this.aobj = aobj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
