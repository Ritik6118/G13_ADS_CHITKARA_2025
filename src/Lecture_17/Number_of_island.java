package Lecture_17;
import java.util.*;
class Number_of_island {
    public int numIslands(char[][] arr) {
		boolean [][] vis=new boolean [arr.length][arr[0].length];
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				
				if(arr[i][j]=='1' && vis[i][j]==false) {
					c++;
                    for(boolean [] ar: vis){
                        // System.out.println(Arrays.toString(ar));
                    }
					bfs(i,j,vis,arr);
				}
			}
		}
		return c;
	}
	
	int[] r= {0,1,0,-1};
	int[] c= {-1,0,1,0};
	
	private void bfs(int cr, int cc, boolean[][] vis, char[][] arr) {
		// TODO Auto-generated method stub
		Queue<pair> q=new LinkedList<>();
        q.add(new pair(cr,cc));
		while(!q.isEmpty()) {
			pair p=q.poll();
			vis[p.r][p.c]=true;
			for(int i=0;i<4;i++) {
				int nr = p.r+r[i];
				int nc = p.c+c[i];	
                    // System.out.println(nr+" "+nc+"aaa");
				if(nr<arr.length && nc<arr[0].length && nr>=0 && nc >=0 && arr[nr][nc]=='1' && vis[nr][nc]==false) {
                    
                    vis[nr][nc]=true;
					q.add(new pair(nr,nc));
				}
			}
		}
	}
}
class pair{
	int r;
	int c;
	pair(int row,int col){
		r=row;
		c=col;
	}
}