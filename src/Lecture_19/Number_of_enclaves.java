package Lecture_19;

import java.util.LinkedList;
import java.util.Queue;



public class Number_of_enclaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int numEnclaves(int[][] arr) {
		boolean [][] vis=new boolean [arr.length][arr[0].length];
		for(int r=0;r<arr.length;r++) {
			if(arr[r][0]==1) {
				bfs(arr,vis,r,0);
			}
			if(arr[r][arr[0].length-1]==1) {
				bfs(arr,vis,r,arr[0].length-1);
			}
		}
		for(int c=0;c<arr[0].length;c++) {
			if(arr[0][c]==1) {
				bfs(arr,vis,0,c);
			}
			if(arr[arr.length-1][c]==1) {
				bfs(arr,vis,arr.length-1,c);
			}
		}
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==1 && vis [i][j]==false) {
					c++;
				}
			}
		}
		return c;
	}
	int[] r= {0,1,0,-1};
	int[] c= {-1,0,1,0};
	
	private void bfs(int[][] arr, boolean[][] vis, int cr, int cc ) {
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
				if(nr<arr.length && nc<arr[0].length && nr>=0 && nc >=0 && arr[nr][nc]==1 && vis[nr][nc]==false) {
                    
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
