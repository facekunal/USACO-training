/*
ID: heytell1
LANG: JAVA
TASK: castle
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

class Block{
	int wall;
	boolean flag;
	int rooms;
	Block(){
		
	}
	Block(int a,boolean b, int c){
		wall=a; flag=b; rooms=c;
	}
}

class castle {
	static int r,c;
	static int Room[]=new int[2500];
	static Block block[][]=null;
	static final int west=1;
	static final int north=2;
	static final int east=4;
	static final int south=8;
	public static void main(String ... lovatics) throws IOException{
		
		
		BufferedReader f=new BufferedReader(new FileReader("castle.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("castle.out")));
		
		StringTokenizer t=new StringTokenizer(f.readLine());
		c=Integer.parseInt(t.nextToken());
		r=Integer.parseInt(t.nextToken());
		
		
		block=new Block[c][r];
		
		for(int j=0;j<r;j++){
			 StringTokenizer st=new StringTokenizer(f.readLine());
			for(int i=0;i<c;i++){
				
				block[i][j]=new Block(Integer.parseInt(st.nextToken()),false,0);
				
				
				
			}
			
		}
		
		
		//room no
		int rn=0;
		for(int j=0;j<r;j++){
			
			for(int i=0;i<c;i++){
				
					if(block[i][j].flag==false){
						fun(rn++,i,j);
					}
			}
		}
		out.println(rn);
		
		
		//biggest room
		
		int max=0;
		for(int i=0;i<2500;i++){
			if(Room[i]>max)max=Room[i];
		}
		
		out.println(max);
		
		
		//remove 1 wall
		int x=0,y=0,s=0; char d='k';
		for(int i=0;i<c;i++){
			for(int j=r-1;j>=0;j--){
				if(j>0 && block[i][j].rooms!=block[i][j-1].rooms){
					int temp=Room[block[i][j].rooms] + Room[block[i][j-1].rooms];
					if(s < temp )
						{s=temp;x=i;y=j;d='N';}
				}
				if(i+1<c && block[i][j].rooms!=block[i+1][j].rooms){
					int temp=Room[block[i][j].rooms] + Room[block[i+1][j].rooms];
					if(s < temp )
						{s=temp;x=i;y=j;d='E';}
				}
			}
		}
		out.println(s);
		out.println((y+1)+" "+(x+1)+" "+d);
		f.close();
		out.close();
		
	}
	
	//cc
	static void fun(int roomno,int i, int j){
		
		if(block[i][j].flag){
			return;
		}
		
		block[i][j].flag=true;
		block[i][j].rooms=roomno;
		Room[roomno]++;
		
		int w=block[i][j].wall;
		
		if(i>0 && (w & west)==0){
			//out.println("west");
			fun(roomno, i-1,j);
		}
		if(i+1<c && (w & east)==0){
			//out.println("east");
			fun(roomno, i+1,j);
		}
		if(j>0 && (w & north)==0){
			//out.println("north");
			fun(roomno, i,j-1);
		}
		if(j+1<r && (w & south)==0){
			//out.println("south");
			fun(roomno, i,j+1);
		}
		
	}
}
