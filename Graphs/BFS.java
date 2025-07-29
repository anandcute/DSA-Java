import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    BFS(int value){
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
            System.out.print("Adjacency list of vertex " + i + " : ");
            for(int j = 0 ; j < adjList.get(i).size(); j++){
                System.out.println(adjList.get(i).get(j));
            }
        }
    }

    public void bfs(int V){
        int v = adjList.size(); // total no veritces
        boolean[] visited = new boolean[v];
        visited[V] = true;

        Queue<Integer>  queue = new LinkedList<>();
        queue.add(V);

        while (queue.size() != 0) {
            int vertex = queue.remove();
            System.out.print(vertex + " ");
            for(int i = 0 ; i < adjList.get(vertex).size() ; i++){
                int av = adjList.get(vertex).get(i);
                if(!visited[av]){
                    queue.add(av);
                    visited[av] = true;
                }
            }
        }

    }
    public static void main(String[] args) {
        BFS g = new BFS(5);
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(0, 4);
        g.addEdge(1, 4);

        g.printAdj();

        g.bfs(0);
    }
}
