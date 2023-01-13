//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class AncesteryDriver{
//    public static void main(String[] args) {
//        FamilyTree familyt = configureTree();
//        TreeMap<String, Person> treeEntries = familyt.getAllPeople();
//
//        showAllPeople(treeEntries);
//        familyt = AddNewPerson( familyt );
//        System.out.printf("\nAll people related to Maggie");
//        TreeMap<String, Person> tEntries = familyt.getAllPeople();
//        showAllPeople(tEntries);
//        String name = "Jackie";
//        System.out.printf("\nShowing Descendants of %s", name);
//        ShowDirectDescendants( name );
//        name = "Abbey";
//        System.out.printf("\nShowing Descendants of %s", name);
//        ShowDirectDescendants( name);
//        name = "Lisa";
//        System.out.printf("\nShowing Descendants of %s", name);
//        ShowDirectDescendants( name);
//
//        name = "Mona";
//        System.out.printf("\nShowing Descendants of %s", name);
//        ShowDirectDescendants( name);
//
//        name="Homer";
//        System.out.printf("\nShowing the Siblings of %s", name);
//        ShowMySiblings( name);
//        name="Maggie";
//        System.out.printf("\nShowing the Siblings of %s", name);
//        ShowMySiblings(name);
//
//        name="Clancy";
//        System.out.printf("\nShowing Siblings of %s", name);
//        ShowMySiblings(name);
//    }
//    private static FamilyTree configureTree() {
//        FamilyTree familyt = new FamilyTree();
//        Person bart = new Person( "Bart", 2020 );
//        familyt.addPerson( "Bart", bart);
//        Person lisa = new Person( "Lisa", 2021 );
//        familyt.addPerson("Lisa", lisa);
//        Person maggie = new Person( "Maggie", 2022);
//        familyt.addPerson("Maggie", maggie);
//
//        Person marge = new Person( "Marge", 1990);
//        Person homer = new Person( "Homer", 1991);
//        homer.spouse = marge;
//        familyt.addPerson("Homer", homer);
//        marge.spouse = homer;
//        familyt.addPerson( "Marge", marge);
//
//        familyt.addParent("Bart", homer);
//        familyt.addParent( "Lisa", homer);
//        familyt.addParent("Maggie", homer);
//        familyt.addParent("Bart", marge );
//        familyt.addParent( "Lisa", marge);
//        familyt.addParent("Maggie", marge);
//
//        familyt.addChild("Marge",bart);
//        familyt.addChild("Marge",lisa);
//        familyt.addChild("Marge",maggie);
//        familyt.addChild("Homer", bart);
//        familyt.addChild("Homer", lisa);
//        familyt.addChild("Homer", maggie);
//
//        //Adding Homers Parents
//        Person Abraham  = new Person("Abraham", 1927);
//        Person Mona = new Person("Mona", 1929);
//        //Adding Abe's kids
//        Person Abbey = new Person("Abbey", 1968);
//        Person Herb = new Person("Herb", 1985);
//        familyt.addPerson("Mona", Mona);
//        familyt.addPerson("Abraham",Abraham);
//        Mona.spouse = Abraham;
//        Abraham.spouse = Mona;
//        familyt.addChild("Mona", homer);
//        familyt.addChild("Abraham", homer);
//
//        familyt.addParent("Homer", Mona);
//        familyt.addParent("Homer", Abraham);
//
//        //Adding kids of Abraham
//        familyt.addPerson("Abbey", Abbey);
//        familyt.addPerson("Herb", Herb);
//
//        familyt.addChild("Abraham", Abbey);
//        familyt.addChild("Abraham", Herb);
//
//
//        familyt.addParent("Abbey", Abraham);
//        familyt.addParent("Herb", Abraham);
//
//
//        // Adding Marge's Sisters
//        Person patty = new Person( "Patty", 1992 );
//        familyt.addPerson("Patty", patty);
//        Person Selma = new Person( "Selma", 1991 );
//        familyt.addPerson("Selma", Selma);
//
//        //Adding the Parents of Marge's family tree
//        Person clancy = new Person( "Clancy", 1960 );  //This code creates the new person so that they can be added
//        Person jackie = new Person( "Jackie", 1961 );
//        //Assigning them to their spouses
//        clancy.spouse = jackie;
//        jackie.spouse = clancy;
//        //Adding them to the family tree
//        familyt.addPerson( "Jackie", jackie);
//        familyt.addPerson("Clancy", clancy);
//        //Adding Clancy's kids
//        familyt.addChild("Clancy", marge);
//        familyt.addChild("Clancy", Selma);
//        familyt.addChild("Clancy", patty);
//        //Adding Jackie's Kids
//        familyt.addChild("Jackie", marge);
//        familyt.addChild("Jackie", Selma);
//        familyt.addChild("Jackie", patty);
//        //Assigning the parent to the kids
//        familyt.addParent("Marge", clancy);
//        familyt.addParent("Marge", jackie);
//
//        familyt.addParent("Patty", jackie);
//        familyt.addParent("Patty", clancy);
//
//
//        familyt.addParent("Selma", jackie);
//        familyt.addParent("Selma", clancy);
//
//        return familyt;
//    }
//
//    private static void ShowMySiblings(String person) {
//        FamilyTree familyt = configureTree();
//        TreeMap<String, Person> treeEntries = familyt.getAllPeople();
//        Person person1 = treeEntries.get(person);
//        System.out.printf("\n Showing Siblings of: ", person1 );
//
//        if( person1.parent.isEmpty()  || person1.parent.get(0).children.isEmpty()){
//            System.out.println("No siblings found");
//            return;
//        }
//
//        for (Person persons : person1.parent.get(0).children) {
//            System.out.println(persons);
//        }
//
//
//    }
//
//    private static void ShowDirectDescendants(String ancestor) {
//        FamilyTree familyt = configureTree();
//        TreeMap<String, Person> treeEntries = familyt.getAllPeople();
//        for (String persons : treeEntries.keySet()){
//            Person person = treeEntries.get(persons);
//            if(person.getName().equals(ancestor)){
//                ArrayList<Person> childrenList1 = person.children;
//                for(Person child : childrenList1){
//                    System.out.println("\n" + child.getName());
//                    if(child.children.size() != 0) {
//                        ArrayList<Person> childrenList2 = child.children;
//                        for (Person childs : childrenList2) {
//                            System.out.println("\n" + childs.getName());
//                        }
//
//                    }
//                }
//            }
//        }
//    }
//    private static void showAllPeople(TreeMap<String, Person> treeEntries) {
//        for (String name : treeEntries.keySet()) {
//            Person m = treeEntries.get(name);
//            System.out.printf("\n%s", m.toString());
//        }
//    }
//    private static FamilyTree AddNewPerson(FamilyTree familyt) {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("\nEnter Name:");
//        String name = sc.nextLine();
//        System.out.printf("\nEnter Birth Year:");
//        int year = sc.nextInt();
//        Person person = new Person(name, year );
//
//        Scanner mom = new Scanner(System.in);
//        System.out.printf("\nEnter The Mother's Name:");
//        String momname = mom.nextLine();
//        System.out.printf("\nEnter The Mother's Birth Year:");
//        Integer momyear = mom.nextInt();
//        Person Mother = new Person(momname, momyear );
//
//        Scanner dad = new Scanner(System.in);
//        System.out.printf("Enter The Father's Name:");
//        String fatherName = dad.nextLine();
//        System.out.printf("Enter The Father's Birth Year:");
//        Integer dadyear = dad.nextInt();
//        Person Dad = new Person(fatherName, dadyear );
//
//        Scanner spouse_sc = new Scanner(System.in);
//        System.out.printf("Enter Spouse:");
//        String spouse = spouse_sc.nextLine();
//        System.out.printf("Enter Spouse's Birth Year:");
//        Integer spouseyear = spouse_sc.nextInt();
//        Person personSpouse = new Person(spouse, spouseyear );
//
//        familyt.addPerson(name , person);
//        familyt.addPerson(momname , Mother);
//        familyt.addPerson(fatherName , Dad);
//        familyt.addPerson(spouse, personSpouse);
//        familyt.addParent(name, Mother);
//        familyt.addParent(name, Dad);
//        familyt.addChild(momname, person);
//        familyt.addChild(fatherName, person);
//
//        person.spouse = personSpouse;
//
//        return familyt;
//    }
//
//
//    private static void showThisPersonsTree(HashMap<String, Person> treeEntries, String searchPerson) {
//        System.out.printf("\n =");
//        if (treeEntries.containsKey(searchPerson)) {
//            Person targetPerson = treeEntries.get(searchPerson);
//            boolean gotMoreToDo = true;
//            while (gotMoreToDo) {
//                gotMoreToDo = false;
//
//            }
//        } else {
//            System.out.printf("\n The Person:%s does not exist", searchPerson);
//        }
//        for (String name : treeEntries.keySet()) {
//            Person m = treeEntries.get(name);
//            System.out.printf("\n%s", m.toString());
//        }
//    }
//}
