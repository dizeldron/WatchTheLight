import java.util.Arrays;

public class Phonebook2 extends Phonebook {

    public static void main(String[]args){

        Phonebook [] p = new Phonebook[5];
        p[0] = new Phonebook();
        p[0].setName(" Lunat ");
        p[0].setPrice(110.11);
        p[0].setPhone(774982);

        p[1] = new Phonebook();
        p[1].setName( " Stas ");
        p[1].setPrice(109.12);
        p[1].setPhone(774999);

        p[2] = new Phonebook();
        p[2].setName(" Caxap ");
        p[2].setPrice(99.9);
        p[2].setPhone(774000);

        p[3] = new Phonebook();
        p[3].setName(" 123 ");
        p[3].setPrice(-65.089);
        p[3].setPhone(114999);

        p[4] = new Phonebook();
        p[4].setName(" Babadjohns ");
        p[4].setPrice(22.0987);
        p[4].setPhone(722229);

        System.out.println("============ not sorted ==============");

        for(Phonebook i : p) {
            System.out.println("Name:" + i.getName() + "; Truth: "
                    + i.getPrice()+
                    "; Phone: " + i.getPhone());

        }
        System.out.println();

        System.out.println("========== sorted by Truth ===========");

        Arrays.sort(p, new SortedByPhone());

        for(Phonebook i : p) {
            System.out.println("Name: " + i.getName() +
                    "; Truth: " + i.getPrice() +
                    "; Phone: " + i.getPhone());

        }
        System.out.println();

        System.out.println("========== sorted by Phone ===========");

        Arrays.sort(p, new SortedByName());
        for(Phonebook i : p) {
            System.out.println("Name: " + i.getName() +
                    " price: " + i.getPrice() +
                    "; Phone: " + i.getPhone());

        }
    }

}

