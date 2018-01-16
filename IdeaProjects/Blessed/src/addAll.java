import java.util.*;
public class addAll {
    public static void main(String[] args) {
        String[] planetArray = {"Earth ","Mars ", "Venera ","Saturn "};
        List <String> planetList = Arrays.asList(planetArray);

        ArrayList<String> planetList2 = new ArrayList<>();
        planetList2.add ("Uran ");
        planetList2.add ("Jupiter ");
        planetList2.add ("Mercury ");
        planetList2.add ("Neptun ");

        for(String s : planetList2)
            System.out.printf("%s", s);
        System.out.println();

        Collections.addAll(planetList2, planetArray);

        for(String s : planetList2)
            System.out.printf("%s", s);
        System.out.println();

        System.out.println(Collections.frequency(planetList2, "Earth"));
         planetList2.add("Earth");

        System.out.println(Collections.frequency(planetList2, "Earth"));
        System.out.println();

        boolean check = Collections.disjoint(planetList,planetList2);
        System.out.println(check);

        if(check)
            System.out.println("This lists have nothing the same");
        else
            System.out.println("This lists have something the same");
        Arrays.sort(planetArray);
        System.out.println(planetList2);;



    }

}
