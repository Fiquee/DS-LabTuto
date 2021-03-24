

package dslab10;

public class DSLab10 {
    
    public static void main(String[] args) {
        
        //Question 1
        Graph<String,Integer> graph = new Graph();
        for(char i = 'A' ; i < 'H' ; i++){
            graph.addVertice(i+"");
        }
        graph.addEdge("A","B",1);
        graph.addEdge("A","C",1);
        graph.addEdge("B","D",1);
        graph.addEdge("B","E",1);
        graph.addEdge("E","G",1);
        graph.addEdge("C","F",1);
        graph.showGraph();
        
        System.out.println("Find the path from A to G");
        graph.DFS("A","G");
        
        //Question 2
        
    }
    
}
