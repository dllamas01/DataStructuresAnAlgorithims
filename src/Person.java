//import java.util.ArrayList;
//
//public class Person {
//    String name;
//    int birthYear;
//    ArrayList<Person> children = new ArrayList<>();
//    ArrayList<Person> parent = new ArrayList<>();
//    Person spouse = null;
//
//    public Person( String name, int birthYear){
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
//    public ArrayList<Person> getParenimport java.util.ArrayList;
//
//    public class Person {
//        String name;
//        int birthYear;
//        ArrayList<Person> children = new ArrayList<>();
//        ArrayList<Person> parent = new ArrayList<>();
//        Person spouse = null;
//
//        public Person( String name, int birthYear){
//            this.name = name;
//            this.birthYear = birthYear;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getBirthYear() {
//            return birthYear;
//        }
//
//        public ArrayList<Person> getChildren() {
//            return children;
//        }
//
//        public ArrayList<Person> getParent() {
//            return parent;
//        }
//
//        public Person getSpouse() {
//            return spouse;
//        }
//        public void addParent( Person p ){
//            this.parent.add( p );
//        }
//        public void addChild( Person p ) {
//            this.children.add( p );
//        }
//        public void setSpouse ( Person p ){
//            this.spouse = p;
//        }
//
//        @Override
//        public String toString() {
//            String spouse = null;
//            if(this.spouse != null) spouse = this.spouse.name;
//            return "Person:" +
//                    "Name:'" + name + '\'' +
//                    ", BirthYear:" + birthYear +
//                    ", Children:" + children.size() +
//                    ", Parent:" + parent.size() +
//                    ", Spouse:" + spouse;
//        }
//    }
//    t() {
//        return parent;
//    }
//
//    public Person getSpouse() {
//        return spouse;
//    }
//    public void addParent( Person p ){
//        this.parent.add( p );
//    }
//    public void addChild( Person p ) {
//        this.children.add( p );
//    }
//    public void setSpouse ( Person p ){
//        this.spouse = p;
//    }
//
//    @Override
//    public String toString() {
//        String spouse = null;
//        if(this.spouse != null) spouse = this.spouse.name;
//        return "Person:" +
//                "Name:'" + name + '\'' +
//                ", BirthYear:" + birthYear +
//                ", Children:" + children.size() +
//                ", Parent:" + parent.size() +
//                ", Spouse:" + spouse;
//    }
//}
