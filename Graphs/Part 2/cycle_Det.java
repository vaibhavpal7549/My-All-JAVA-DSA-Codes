import java.util.*;

public class cycle_Det {

    static class edge { //edge class to represent an edge in the graph
        int src;
        int dest;

        public edge(int s, int d) { //constructor to initialize the edge
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); //initialize each list in the array
        }
        //add edges to the graph
        //0 -vertex
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));


        //1 vertex
        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));

        //2 vertex
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        //3 vertex
        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));


        //4 vertex
        graph[4].add(new edge(4, 3));
    }

    public static boolean detectCycle(ArrayList<edge> graph[]){
        boolean vis[] = new boolean[graph.length]; //create a visited array to keep track of visited vertices
        for (int i = 0; i < graph.length; i++) { //iterate through all the vertices
            if (!vis[i]) { //if the vertex is not visited
                if (detectCycleUtil(graph, vis, i, -1)) { //perform DFS on the vertex
                    return true; //if a cycle is detected, return true
                    //cycle exists in one of the parts of the graph
                }
            }
        }
        return false; //return false if no cycle is detected
    }


    public static boolean detectCycleUtil(ArrayList<edge> graph[], boolean vis[], int curr, int parent) {
        vis[curr] = true; //mark the current vertex as visited
        for (int i = 0; i < graph[curr].size(); i++) { //iterate through the edges of the current vertex
            edge e = graph[curr].get(i); //get the edge
            //case 3
            if(!vis[e.dest] && detectCycleUtil(graph, vis, e.dest, curr)){ //if the destination vertex is not visited, perform DFS on it
                return true; //if a cycle is detected, return true
            }
            //case 1
            else if(e.dest != parent){ //if the destination vertex is visited and is not the parent of the current vertex, then there is a cycle
                return true; //return true if a cycle is detected
            }
            
        }
        return false; //return false if no cycle is detected
    }

    public static void main(String[] args) {
        
        int V = 5; //number of vertices
        ArrayList<edge> graph[] = new ArrayList[V]; //create an array of lists to store the edges
        createGraph(graph); //create the graph
        detectCycle(graph); //perform DFS on the graph

    }
}

