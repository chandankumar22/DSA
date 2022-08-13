package com.dev.ck.graph.clonegraph;

import com.dev.ck.utils.GraphNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class CloneTheGraph {
        //DFS APPROACH
        public GraphNode cloneGraph(GraphNode node) {
            if(node==null) return null;
            GraphNode []cloneGraph = new GraphNode[101];
            boolean []visited = new boolean[101];
            Queue<GraphNode> queue = new ArrayDeque<>();
            queue.add(node);
            while(!queue.isEmpty()){
                GraphNode n = queue.poll();
                if(!visited[n.val-1]){
                    visited[n.val-1]=true;
                    GraphNode prev = cloneGraph[n.val-1];
                    if(prev==null){
                        prev = new GraphNode(n.val);
                        cloneGraph[n.val-1]=prev;
                    }
                    for(int i=0;i<n.neighbors.size();i++){
                        GraphNode neighbor = n.neighbors.get(i);
                        GraphNode curr = cloneGraph[neighbor.val-1];
                        if(!visited[neighbor.val-1]){
                            queue.add(neighbor);
                            if(curr==null){
                                curr = new GraphNode(neighbor.val);
                                cloneGraph[neighbor.val-1] = curr;
                            }
                        }
                        prev.neighbors.add(curr);
                    }
                }
            }
            return cloneGraph[0];
    }
}
