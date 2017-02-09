package information;

import javax.persistence.*;
import java.util.*;


@Entity
public class AddressBook {

    public long getId() {
        return id;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(cascade= CascadeType.PERSIST)
    private List<BuddyInfo> buddyInfoList = new ArrayList<BuddyInfo>() ;




    public List<BuddyInfo> getBuddyInfoList() {
        return buddyInfoList;
    }

    public void setBuddyInfoList(List<BuddyInfo> buddyInfoList) {
        this.buddyInfoList = buddyInfoList;
    }
public void add(BuddyInfo b){
        buddyInfoList.add(b);
}
    public void deleteBuddyInfo (BuddyInfo buddy){
        this.buddyInfoList.remove(buddy);
    }

    @Override
    public String toString() {
        String list = "";
        Iterator<BuddyInfo> iterator = buddyInfoList.iterator();
        while(iterator.hasNext()){
            list+=iterator.next().toString();
        }
        return list;
    }


}
