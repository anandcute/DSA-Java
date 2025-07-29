import java.util.ArrayList;

public class Graph {
     ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    Graph(int value){
        for(int i = 0 ; i < value ; i++){
            adjList.add(new ArrayList<Integer>());
        }
    }
    public void addEdge(int u , int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }
    public void printAdj(){
        for(int i = 0 ; i < adjList.size() ; i++){
            System.out.println("Adj list of vertices : " + i );
            for(int j = 0 ; j < adjList.get(i).size() ; j++){
                System.out.println(" " + adjList.get(i).get(j) + " ");
            }
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(0, 4);
        g.addEdge(1, 4);

        g.printAdj();
        


    }
}
