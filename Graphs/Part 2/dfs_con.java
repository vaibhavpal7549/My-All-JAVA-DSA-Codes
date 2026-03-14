import java.util.*;

public class dfs_con {

    static class edge { //edge class to represent an edge in the graph
        int src;
        int dest;
        int wt;

        public edge(int s, int d, int w) { //constructor to initialize the edge
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); //initialize each list in the array
        }
        //add edges to the graph
        //0 -vertex
        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));

        //1 vertex
        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));

        //2 vertex
        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));

        //3 vertex
        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));


        //4 vertex
        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 5, 1));

        //5 vertex
        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5, 6, 1));

        graph[5].add(new edge(6, 5, 1));



    }

    public static void dfs(ArrayList<edge> graph[]) { //O(V + E)
        boolean visited[] = new boolean[graph.length]; //create a boolean array to keep track of visited vertices
        for (int i = 0; i < graph.length; i++) { //iterate through all the vertices
            dfsUtil(graph, i, visited);
        }
    }

    public static void dfsUtil(ArrayList<edge> graph[], int curr, boolean visited[]) { //O(V + E)
        System.out.print(curr + " "); //print the current vertex
        visited[curr] = true; //mark the current vertex as visited
        for (int i = 0; i < graph[curr].size(); i++) { //iterate through the edges of the current vertex
            edge e = graph[curr].get(i); //get the edge from the list of edges for the current vertex
            if (!visited[e.dest]) { //if the destination vertex is not visited, perform DFS on it
                dfsUtil(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        
        int V = 7; //number of vertices
        ArrayList<edge> graph[] = new ArrayList[V]; //create an array of lists to store the edges
        createGraph(graph); //create the graph
        dfs(graph); //perform DFS on the graph

    }
}

