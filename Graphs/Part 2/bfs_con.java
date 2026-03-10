import java.util.*;

public class bfs_con {

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

    public static void bfs(ArrayList<edge> graph[]) { //O(V + E)
        boolean visited[] = new boolean[graph.length]; //create a boolean array to keep track of visited vertices
        for (int i = 0; i < graph.length; i++) { //for each vertex in the graph
            if (!visited[i]) { //if the vertex has not been visited
                bfsutil(graph, visited); //perform BFS on the vertex
            }
        }

    }

    public static void bfsutil(ArrayList<edge> graph[], boolean visited[]) { //O(V + E)

        Queue<Integer> q = new LinkedList<>(); //create a queue to store the vertices to be visited
        q.add(0); //add the starting vertex to the queue

        while (!q.isEmpty()) { //while the queue is not empty
            int curr = q.remove(); //remove the first vertex from the queue

            if (!visited[curr]) { //if the vertex has not been visited
                System.out.print(curr + " "); //print the vertex
                visited[curr] = true; //mark the vertex as visited
                for (int i = 0; i < graph[curr].size(); i++) { //for each edge of the current vertex
                    edge e = graph[curr].get(i); //get the edge from the list of edges for the current vertex
                    q.add(e.dest); //add the destination vertex to the queue
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int V = 7; //number of vertices
        ArrayList<edge> graph[] = new ArrayList[V]; //create an array of lists to store the edges
        createGraph(graph); //create the graph
        bfs(graph); //perform BFS on the graph

    }
}

