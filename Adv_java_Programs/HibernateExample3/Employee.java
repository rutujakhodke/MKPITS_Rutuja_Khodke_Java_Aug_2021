import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it will automatically increment the id value
    @Column(name = "empid",nullable = false)
    private int empid;

    private String empname;
    @Lob//it will used when varchar(255) is limited and we want to extend the character limit then @Lob is used
    private String address;

    private String empdesc;
    @Temporal(TemporalType.DATE)//it will set only date in table.it is used to set specific date or time in table as per our requirement.
    private Date doj;

    //private static String empdes;//hibernate does not recognize the static data member and not send in the table.
    @Transient //hibernate will not consider the data member and not send in database.it will ignore the data member

    private String empdes;

    public String getEmpdes() {
        return empdes;
    }

    public void setEmpdes(String empdes) {
        this.empdes = empdes;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmpdesc() {
        return empdesc;
    }

    public void setEmpdesc(String empdesc) {
        this.empdesc = empdesc;
    }


}
