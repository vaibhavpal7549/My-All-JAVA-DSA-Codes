import java.util.*;
public class creating_graph {

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
    public static void main(String[] args) {
        
        int V = 5; //number of vertices
        //int arr [] = new int[V]; //create an array to store the vertices
        ArrayList<edge> graph[] = new ArrayList[V]; //create an array of lists to store the edges
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>(); //initialize each list in the array
        }
    
        //add edges to the graph
        //0 -vertex
        graph[0].add(new edge(0, 1, 5));

        //1 vertex
        graph[1].add(new edge(1, 0, 5));
        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 3));

        //2 vertex
        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 3, 1));
        graph[2].add(new edge(2, 4, 4));

        //3 vertex
        graph[3].add(new edge(3, 1, 3));
        graph[3].add(new edge(3, 2, 1));

        //4 vertex
        graph[4].add(new edge(4, 2, 2));
    
        //print the edges of the graph
        //2's neighbours
        for (int i = 0; i < graph[2].size(); i++) {
            edge e = graph[2].get(i); //get the edge from the list of edges for vertex 2
            System.out.println("Edge from " + e.src + " to " + e.dest + " with weight " + e.wt);
        }
    }
}
