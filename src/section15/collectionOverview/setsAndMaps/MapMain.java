package section15.collectionOverview.setsAndMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println("-".repeat(40));

        Map<String, Contact> contacts = new HashMap<>();
        for(Contact contact : fullList){
            contacts.put(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", values = " + v));

        System.out.println("-".repeat(40));
        System.out.println(contacts.get("Charlie Brown"));

        Contact defaultContact = new Contact("Chuck Brown");
        System.out.println(contacts.getOrDefault("Chuck Brown", defaultContact));

        System.out.println("-".repeat(40));
        contacts.clear();
        for(Contact contact : fullList){
            Contact duplicate = contacts.put(contact.getName(), contact);
            if(duplicate != null){
//                System.out.println("duplicate = " + duplicate);
//                System.out.println("current = " + contact);
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", values = " + v));

        System.out.println("-".repeat(40));
        contacts.clear();

        for(Contact contact : fullList){
            contacts.putIfAbsent(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", values = " + v));

        System.out.println("-".repeat(40));
        contacts.clear();

        for(Contact contact : fullList){
            Contact duplicate = contacts.putIfAbsent(contact.getName(), contact);
            if(duplicate != null){
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", values = " + v));

        System.out.println("-----------------------------");
        contacts.clear();
        fullList.forEach(contact -> contacts.merge(contact.getName(), contact,
                Contact::mergeContactData
        ));
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("-----------------------------");
        for(String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}){
            contacts.computeIfAbsent(contactName, Contact::new);
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("-----------------------------");
        for(String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}){
            contacts.computeIfPresent(contactName, (k, v) -> {
                v.addEmail("Fun Place");
                return v;
            });
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("-----------------------------");
        contacts.replaceAll((k, v) -> {
            String newEmail = k.replaceAll(" ", "") + "@funplace.com";
            v.replaceEmailIfExist("DDuck@funplace.com", newEmail);
            return v;
        });

        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" +v));

        System.out.println("-----------------------------");
        Contact daisy = new Contact("Daisy Jane Duck", "daisyj@duck.com");
        Contact replacedContact = contacts.replace("Daisy Duck", daisy);
        System.out.println("Daisy = " + daisy);
        System.out.println("Replaced Contact = " + replacedContact);
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" +v));

        System.out.println("-----------------------------");
        Contact updatedDaisy = replacedContact.mergeContactData(daisy);
        System.out.println("updatedDaisy = " + updatedDaisy);
        boolean success = contacts.replace("Daisy Duck", daisy, updatedDaisy);
        if(success){
            System.out.println("Successfully updated element");
        } else {
            System.out.printf("Did not match both key: %s and value: %s %n", "Daisy Duck", daisy);
        }

        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

        System.out.println("-----------------------------");
        success = contacts.remove("Daisy Duck", updatedDaisy);
        if(success){
            System.out.println("Successfully removed element");
        } else {
            System.out.printf("Did not match in both key: %s and value: %s %n", "Daisy Duck", updatedDaisy);
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

    }
}
