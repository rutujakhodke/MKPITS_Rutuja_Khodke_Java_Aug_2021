import javax.persistence.*;

@Entity
//@NamedQuery(name = "sbyid",query = "from Student3 where id> :Id")//HQL Query

//@NamedNativeQuery(name = "sbyname",query = "select * from Student3 where name ='Rutuja'",resultClass = Student3.class)//Pure SQL Query
//it will return query in a object form
public class Student4 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String name;
    private String address;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}


