package information;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class BuddyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String phoneNo;

    public BuddyInfo() {
    }

    public long getId() {
        return id;
    }



    public String getName(){
        return this.name;
    }

    public String getphoneNo(){
        return this.phoneNo;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }


    public void setBuddyInfo(String name, String phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "information.BuddyInfo{" +
                "name='" + name + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
