package hibernate_360;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    /**
     * tells hibernate that this table relates to the student table
     * also allows mapping to this table
      */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /**
     * lets hibernate know what each column relates to
     * and makes getters and setters for each element
     */
    @Column(name = "s_id")
    private int s_id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "major")
    private String major;


    public int getS_ID() {
        return s_id;
    }

    public void setS_ID() {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        this.phone = phone;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor() {
        this.major = major;
    }

    /**
     *outputs each element into a string
     */
    public String toString() {
        return Integer.toString(s_id) + " " + name + " " + address + " " + phone + " " + major;
    }
}
