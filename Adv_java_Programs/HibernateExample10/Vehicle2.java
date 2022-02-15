import javax.persistence.*;

@Entity
public class Vehicle2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String name;
    private float price;
    private int modelno;
    @ManyToOne//multiple vehicles have single user
    @JoinColumn(name = "user2id")

     private User2 uob1;

    public User2 getUob1() {
        return uob1;
    }

    public void setUob1(User2 uob1) {
        this.uob1 = uob1;
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


