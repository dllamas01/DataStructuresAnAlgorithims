//import java.util.ArrayList;
//
//public class PersonNode {
//    String name;
//    int birthYear;
//    ArrayList<Person> children = new ArrayList<>();
//    ArrayList<Person>  parent = new ArrayList<>();
//    Person spouse = null;
//
//    public PersonNode(String name, int birthYear){
//        this.name = name;
//        this.birthYear = birthYear;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getBirthYear() {
//        return birthYear;
//    }
//
//    public ArrayList<Person> getChildren() {
//        return children;
//    }
//
//    public ArrayList<Person> getParent() {
//        return parent;
//    }
//
//    public Person getSpouse() {
//        return spouse;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setBirthYear(int birthYear) {
//        this.birthYear = birthYear;
//    }
//    public void setSpouse(Person spouse) {
//        this.spouse = spouse;
//    }
//    public void addParent(Person p){
//        this.parent.add(p);
//    }
//    public void addChild(Person p){
//        this.children.add(p);
//    }
//
//    @Override
//    public String toString() {
//        return "PersonNode{" +
//                "name='" + name + '\'' +
//                ", birthYear=" + birthYear +
//                ", children=" + children +
//                ", parent=" + parent +
//                ", spouse=" + spouse +
//                '}';
//    }
//}