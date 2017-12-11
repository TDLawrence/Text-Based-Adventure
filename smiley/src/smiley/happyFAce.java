package smiley;

public class happyFAce {


		public static void main(String[] args)
		{int[][]smileArray=new int[5][5];
		smileArray[1][1]=9;
		smileArray[1][3]=9;
		smileArray[2][2]=4;
		smileArray[3][0]=1;
		smileArray[3][4]=1;
		smileArray[4][1]=1;
		smileArray[4][2]=1;
		smileArray[4][3]=1;
		print2d(smileArray);
			
		}
		public static void print2d(int[][]arr)
		{for(int[]i:arr)
		 {for (int j:i)
		   {if (j!=0)
		      {System.out.print(j);}
		    if (j==0)
		      {System.out.print(" ");} 
		   }
		    System.out.println();
		 }
			
		}
	}


