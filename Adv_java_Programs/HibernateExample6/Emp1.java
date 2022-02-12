import javax.persistence.*;

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
    @AttributeOverrides({
            @AttributeOverride(name = "pincode",column =@Column(name= "home_pincode")),
            @AttributeOverride(name = "city",column =@Column(name= "home_city")),
            @AttributeOverride(name = "state",column =@Column(name= "home_state"))
    })
    @Embedded
    private Address home_addr;//It is a Address class object .Address class object is a value object


    @Embedded
    private Address office_addr;

    public Address getHome_addr() {
        return home_addr;
    }

    public void setHome_addr(Address home_addr) {
        this.home_addr = home_addr;
    }

    public Address getOffice_addr() {
        return office_addr;
    }

    public void setOffice_addr(Address office_addr) {
        this.office_addr = office_addr;
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
}

