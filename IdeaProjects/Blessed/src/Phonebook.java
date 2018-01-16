import java.util.Arrays;
import java.util.Comparator;
class Phonebook {

    private String name;
    private double truth;
    private int phone;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return truth;
    }
    public void setPrice(double truth) {
        this.truth = truth;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;

    }}

class SortedByName implements Comparator<Phonebook> {

    public int compare(Phonebook obj1, Phonebook obj2) {

        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }

}
class SortedByPhone implements Comparator<Phonebook> {

    public int compare(Phonebook obj1, Phonebook obj2) {

        int phone1 = obj1.getPhone();
        int phone2 = obj2.getPhone();

        if(phone1 > phone2) {
            return 1;
        }
        else if(phone1 < phone2) {
            return -1;
        }
        else {
            return 0;
        }

    }

}
 	 