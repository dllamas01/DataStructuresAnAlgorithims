import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class InClassGraphSearch {
    public static void main(String[] args) {
//        Graph g = createGraph();
        Graph g = createGraph2();

        g.showGraph();
        System.out.printf("\n``````````BFS ToFollow-----------");
//        g.showBFS(3);
        g.showDFS(0);
    }

    private static Graph createGraph() {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);

        g.addEdge(1,2);

        g.addEdge(2,0);
        g.addEdge(2,3);

        g.addEdge(3,3);
        return g;
    }
    private  static Graph createGraph2(){
        Graph g = new Graph(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);

        g.addEdge(3, 1);
        g.addEdge(3, 2);
        g.addEdge(3,4);
        g.addEdge(3,5);

        g.addEdge(4,3);
        g.addEdge(5,3);
        return g;
    }
    static class Graph{
        private int nVert = 0;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        Graph(int v){
            this.nVert = v;
            for(int i =0; i<nVert; i++){
                ArrayList<Integer> row = new ArrayList<>();
                adjList.add(row);
            }
        }
        public void addEdge(int v1, int v2){
            adjList.get(v1).add(v2);
//            adjList.get(v2).add(v1);
        }
        public void showGraph(){
            for(int i =0; i<adjList.size(); i++) {
                System.out.printf("\nVertex:%s is connected too....", i);
                for (int j = 0; j < adjList.get(i).size(); j++) {
                    System.out.printf("---:%s", adjList.get(i).get(j));
                }
            }
        }
        public void showBFS(int startNode){
            boolean visited[] = new boolean[nVert];
            Deque<Integer> queue = new LinkedList<>();
            queue.add(startNode);
            int currentNode;
            while(queue.size() != 0){
                currentNode= queue.poll();
                System.out.printf("\nN;%s", currentNode);
                ArrayList<Integer> theConnected = adjList.get(currentNode);
                for(int item: theConnected){
                    if(!visited[item]){
                        visited[item] = true;
                        queue.add(item);
                    }
                }
            }
        }
        public void showDFS(int startNode){
            boolean visited[] = new boolean[nVert];
            Stack<Integer> stack = new Stack<>();
            stack.push(startNode);
            int currentItem;
            while(stack.empty()){
                currentItem = stack.pop();
                if(!visited[currentItem]){
                    System.out.printf(":%s", currentItem);
                    visited[currentItem] = true;
                }
                for(int i =0; i<adjList.get(i).size();i++){
                    int theItem = adjList.get(currentItem).get(i);
                    if(!visited[theItem]){
                        stack.push(theItem);
                    }
                }
            }
        }
    }
}
