import java.util.ArrayList;

public class HasPath {
    static class Edge {
        int src;  //Source
        int dest; //Destination
        int wt;   //Weight

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        //0 -> vertex
        graph[0].add(new Edge(0, 1, 1));

        //1 -> vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 1));

        //2 -> vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 1));

        //3 -> vertex
        graph[3].add(new Edge(1, 1, 1));
        graph[3].add(new Edge(2, 2, 1));

        //4 -> vertex
        graph[4].add(new Edge(4, 2, 1));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]){
        //visit
        System.out.print(curr+ " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);  
            //e.dest = neighbor
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
          
        /*        
              0-------1
                     / \
                    /   \  
                   /     \
                  2-------3
                  |
                  |
                  |
                  4
        */

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(hasPath(graph, 0, 4, new boolean[V]));
    }
}
