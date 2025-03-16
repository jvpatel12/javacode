package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Primsalgo {

    static class Edge{
        int src; 
        int dest;
        int wt;

        public Edge(int s ,int d,int w){
            this.src = s; 
            this.dest=d;
            this.wt = w;
        }
    }
     public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
              graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1,10));
        graph[0].add(new Edge(0, 2,15));
        graph[0].add(new Edge(0, 3,30));
   
        graph[1].add(new Edge(1, 0,10));
        graph[1].add(new Edge(1, 3,40));
        
        graph[2].add(new Edge(2, 3,50));
        graph[2].add(new Edge(2, 0,15));

        graph[3].add(new Edge(3, 1,40));
        graph[3].add(new Edge(3, 2,50));


 
    }
    public static class pair implements Comparable<pair>{
        int v;
        int wt;

        public pair(int v,int wt){
            this.v=v;
            this.wt = wt;
        }
        @Override
        public int compareTo(pair p2){
            return this.wt - p2.wt;
        }
    }   

    public static void Primalgo(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<pair> pq=new PriorityQueue<>();

        pq.add(new pair(0,0));
        int cost=0 ;

        while (!pq.isEmpty()) {
            pair curr= pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;
                cost += curr.wt;

                for (int i = 0; i < graph[curr.v].size(); i++) {
                   Edge e = graph[curr.v].get(i);
                   if(!vis[e.dest]){
                    pq.add(new pair(e.dest, e.wt));
                   }  
                } 
            }
        }
        System.out.println(cost);
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph) ;
        Primalgo(graph);
    }
}
