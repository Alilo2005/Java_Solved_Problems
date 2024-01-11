import java.util.LinkedList;

public class Graph {
    private final int numVertices;
    private final LinkedList<Integer>[] adjList;

    // Constructor
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // Remove an edge from the graph
    public void removeEdge(int v, int w) {
        if (v >= numVertices || w >= numVertices) {
            System.out.println("Invalid vertex");
            return;
        }

        adjList[v].remove((Integer) w);
    }

    // Print the adjacency list
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Object vertex : adjList[i]) {
                System.out.print(" -> " + vertex);
            }
            System.out.println();
        }
    }
    //convert adjacency list to adjacency matrix
    public int[][] adjListToMatrix() {
        int[][] adjMatrix = new int[numVertices][numVertices];
        // Convert the adjacency list to a matrix
        for (int i = 0; i < numVertices; i++) {
            for (int vertex : adjList[i]) {
                adjMatrix[i][vertex] = 1;
            }
        }

        return adjMatrix;
    }
    public void printAdjMatrix(int[][] adjMatrix){
       for(int i = 0;i < numVertices;i++){
          for(int j = 0;j< numVertices;j++){
              System.out.print(adjMatrix[i][j] + " ");
          }
           System.out.println();
        }
    }
    public LinkedList<Integer>[] matrixToList(int[][] adjMatrix) {
        LinkedList<Integer>[] list = new LinkedList[numVertices];

        // Initialize the list
        for (int i = 0; i < numVertices; i++) {
            list[i] = new LinkedList<>();
        }

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (adjMatrix[i][j] == 1) {
                    list[i].add(j);
                }
            }
        }

        return list;
    }


    // Main method for testing
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();

        g.removeEdge(1, 4);
        System.out.println("After removing edge 1-4:");

        g.printGraph();
        // Converting the adjacency list to a matrix
        int[][] matrix = g.adjListToMatrix();
        System.out.println("\nAdjacency Matrix:");
        g.printAdjMatrix(matrix);

// Converting the matrix back to an adjacency list
        LinkedList<Integer>[] newList = g.matrixToList(matrix);
        System.out.println("\nConverted Adjacency List from Matrix:");
        for (int i = 0; i < newList.length; i++) {
            System.out.print("Vertex " + i + ":");
            for (int vertex : newList[i]) {
                System.out.print(" -> " + vertex);
            }
            System.out.println();
        }

    }
}
