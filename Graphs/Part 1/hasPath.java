import java.util.*;

public class hasPath {

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
    public static boolean hasPath(ArrayList<edge> graph[], int src, int dest, boolean vis[]){ //O(V+E) time complexity
        if(src == dest){
            return true; //if source and destination are the same, return true
        }
        vis[src] = true; //mark the source vertex as visited
        for (int i = 0; i < graph[src].size(); i++) { //iterate through the edges of the source vertex
            edge e = graph[src].get(i); //get the edge
            //e.dest = neighbor vertex
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){ //if the destination vertex is not visited
                //recursively call hasPath on the destination vertex
                return true; //if a path is found, return true
            }
        }
        return false; //if no path is found, return false
    }

    public static void main(String[] args) {
        
        int V = 7; //number of vertices
        ArrayList<edge> graph[] = new ArrayList[V]; //create an array of lists to store the edges
        createGraph(graph); //create the graph
        System.out.println(hasPath(graph, 0, 5, new boolean[V])); //check if there is a path from vertex 0 to vertex 5

    }
}

