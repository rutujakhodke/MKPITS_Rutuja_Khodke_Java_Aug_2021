import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)//it sets the strategy of table.
//it will make 3 table instead of single table
@DiscriminatorColumn(name = "Vtype",discriminatorType = DiscriminatorType.STRING)//it will change
//the column name that we want to change
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vid", nullable = false)
    private Integer vid;

    private String vname;

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

}
