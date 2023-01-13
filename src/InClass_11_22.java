import java.util.ArrayList;
import java.util.Collections;

public class InClass_11_22 {
    public static void main(String[] args) {
        ArrayList<Item> myWork = new ArrayList<>();
        myWork.add(new Item(100,3,1));
        myWork.add(new Item(200,10,1));
        myWork.add(new Item(300,20,3));
        myWork.add(new Item(400,30,3));
        myWork.add(new Item(250,40,1));
        Collections.sort(myWork);
        for(Item item:myWork){
            System.out.printf("\n ID:%s priority: %s",item.id, item.priority);
        }
    }
    public static class Item implements Comparable<Item>{
        public int id;
        public int trans_time;
        public int priority;

        public Item(int id, int trans_time, int priority) {
            this.id = id;
            this.trans_time = trans_time;
            this.priority = priority;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getTrans_time() {
            return trans_time;
        }

        public void setTrans_time(int trans_time) {
            this.trans_time = trans_time;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        @Override
        public int compareTo(Item o) {
            if(o.priority>this.priority) {
                return 1;
            }
            else if(o.priority<this.priority){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
