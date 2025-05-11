package Lecture_21;

public class BellmanFord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int [] dist=new int [V];
        for(int i=0;i<dist.length;i++) {
        	if(i!=src) {
        		dist[i]=(int)(1e9);
        	}
        }
        
        for(int i=1;i<V;i++) {
        	for(int [] arr:edges) {
        		int v1=arr[0];
        		int v2=arr[1];
        		int w=arr[2];
        		if(arr[v1]!=(int)(1e9) && arr[v1]+w<arr[v2]) {
        			arr[v2]=arr[v1]+w;
        		}
        	}
        }
        for(int [] arr:edges) {
    		int v1=arr[0];
    		int v2=arr[1];
    		int w=arr[2];
    		if(arr[v1]!=(int)(1e9) && arr[v1]+w<arr[v2]) {
    			int [] ar= {-1};
    			return ar;
    		}
    	}
        return dist;
    }

}
