package section15.collectionOverview.mySet;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Contact(String name){
        this.name = name;
    }

    public Contact (String name, String email){
        this.name = name;
        if(email != null){
            this.emails.add(email);
        }
    }

    public Contact (String name, long phone){
        this.name = name;
        if(phone != 0){
            this.phones.add(Long.toString(phone));
        }
    }

    public Contact (String name, String email, long phone){
        this.name = name;
        if(email != null){
            this.emails.add(email);
        }
        if(phone != 0){
            this.phones.add(Long.toString(phone));
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.emails + this.phones;
    }

    public Contact mergeContactData(Contact contact){
        Contact newContact = new Contact(this.name);
        if(this == contact && contact != null){
            for(String phone : contact.phones){
                if(!this.phones.contains(phone)){

                }
            }
        }
    }
}
