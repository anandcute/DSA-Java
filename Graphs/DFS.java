import java.util.ArrayList;

public class DFS {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    public DFS(int value){
        for(int i = 0 ; i < value ; i++){
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int u , int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    // public void printAdj(){
    //     for(int i = 0 ; i < adjList.size() ; i++){
    //         System.out.println("Adjacent of vertex : " + i );
    //         for(int j = 0 ; j < adjList.get(i).size();j++){
    //             System.out.println(adjList.get(i).get(j));
    //         }
    //     }
    // }
    public void dfs(int v){
        int V = adjList.size();
        boolean[] visited = new boolean[V];
        dfs2(v, visited);
    }
    public void dfs2(int v ,boolean[] visited){
        visited[v] = true;
        System.out.print(v + " ");
        for(int i = 0 ; i < adjList.get(v).size(); i++){
            int av = adjList.get(v).get(i);
            if(!visited[av]){
                dfs2(av, visited);
            }
        }

    }

    public static void main(String[] args) {
        DFS g = new DFS(5);
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(0, 4);
        g.addEdge(1, 4);

        // g.printAdj();

        g.dfs(0);
    }
}
