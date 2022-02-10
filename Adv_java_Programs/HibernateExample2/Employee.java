import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")//it is used to change the table name in database
public class Employee {
    @Id
@Column(name = "emp_id")  //it is used to change the column name of table in database
    private int empid;
@Column(name = "emp_name")
private String empname;
@Column(name = "emp_addr")
    private String address;

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
}
