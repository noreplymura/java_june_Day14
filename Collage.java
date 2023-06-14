import java.io.*;
import java.util.*;
class Collage {
    public String name;
    public String address;
    Collage(String name,String address){
        this.name=name;
        this.address=address;
    }
}
class University {
    private final List<Collage> collage;
    University(List<Collage> collages) {
        this.collage= collages;
    }
    public List<Collage> getToCollagesUniversity() {
        return collage;
    }
}
class CompositionExample {
    public static void main(String[] args) {
        Collage c1 = new Collage("ABES Engineering ", "Ghaziabad");
        Collage c2 = new Collage("AKG Engineering ", "Ghaziabad");
        Collage c3 = new Collage("MTIP Engineering ", "palamner");
        List<Collage> collage = new ArrayList<Collage>();
        collage.add(c1);
        collage.add(c2);
       2 collage.add(c3);
        University university = new University(collage);
        List<Collage> collages = university.getToCollagesUniversity();
        for (Collage cg : collage) {
            System.out.println("Name :" + cg.name + " \n " + "Addres :" + cg.address);
         }
    }
}