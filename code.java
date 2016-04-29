import java.util.*;
public class Boardcutting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int y=0;y<t;y++)
		{
			int m=sc.nextInt();
			int n=sc.nextInt();
			int [] Y=new int[m];
			int [] X=new int[n];
			
			for(int i=0;i<m-1;i++)
				Y[i]=sc.nextInt();
			
			for(int i=0;i<n-1;i++)
				X[i]=sc.nextInt();
			
			int countHorizontalSegment=0;
			int countVerticalSegment=0;
			
			int cost =0;
			
			int j=1;
			int k=1;
			
			Arrays.sort(Y);
			Arrays.sort(X);
			
			for(int i=0;i<m+n-2;i++)
			{
				
				if(Y[m-j]>=X[n-k] && (m-j)!=0 && (n-k)!=0)
				{
					//System.out.println("***"+(m-j));
					cost+=Y[m-j]*(countHorizontalSegment+1);
					countVerticalSegment++;
					j++;
				}
				else if(Y[m-j]<X[n-k] &&(m-j)!=0 && (n-k)!=0){
					cost+=X[n-k]*(countVerticalSegment+1);
					countHorizontalSegment++;
					k++;
				}
			}
			System.out.println(cost);
		}

	}

}
