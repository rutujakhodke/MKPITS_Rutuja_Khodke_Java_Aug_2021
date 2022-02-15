import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Vehicle3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String name;
    private float price;
    private int modelno;

    @JoinColumn(name = "user2id")

    @ManyToMany
    private Collection<User3> uob1=new ArrayList<User3>();//vehicle having multiple users

    public Collection<User3> getUob1() {
        return uob1;
    }

    public void setUob1(Collection<User3> vob1) {
        this.uob1 = vob1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getModelno() {
        return modelno;
    }

    public void setModelno(int modelno) {
        this.modelno = modelno;
    }
}


