import java.util.ArrayList;
import java.util.Collections;

public class GreedyTask {
    public static void main(String[] args) {
        ArrayList<Task> myList = new ArrayList<>();
        myList.add(new Task("Paint Bedroom", 2));
        myList.add(new Task("Paint LivingRoom", 5));
        myList.add(new Task("Sweep Patio", 2));
        myList.add(new Task("Paint Basement", 1));
        myList.add(new Task("Paint Kitchen", 4));
        int time = 8;
        Collections.sort(myList);
        ArrayList<Task> toDoList = navTasks(myList,0);
        System.out.printf("\n --------------");
        showTheList(myList);
    }

    private static ArrayList<Task> navTasks(ArrayList<Task> myList, int time) {
        int currentTIme =0;
        int numberOfTaks =0;
        ArrayList<Task> toDoList = new ArrayList<>();
        for(Task t: myList){
            currentTIme += t.getTime();
            if(currentTIme>time){
                break;
            }
            toDoList.add(t);
        }
        return toDoList;
    }

    private static void showTheList(ArrayList<Task> myList) {
        for( Task t : myList ) {
            System.out.printf("\nN:%s T:%s", t.gettName(), t.getTime());
        }
    }

}
