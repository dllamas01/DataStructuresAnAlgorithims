import java.util.Arrays;

public class Gree1 {
    public static void main(String[] args) {
        int[] myList= {1,5,2,4,2};
        int time =1;
        int result = mavTasks(myList, time);
        System.out.printf("\n You can get dont: %s", result);
    }

    private static int mavTasks(int[] myList, int time) {
        int currentTime =0;
        int numberOfTasks =0;
        Arrays.sort(myList);
        for(int item: myList){
            currentTime += item;
            if(currentTime>time){
                break;
            }
            numberOfTasks++;
        }
        return numberOfTasks;
    }
}
