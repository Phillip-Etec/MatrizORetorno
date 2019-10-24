import java.util.*;
public class exerDois {
	public static void main(String[] args) {
		int m, n, mn, nm, i=0, j=0;
		Scanner in=new Scanner (System.in);
		Random rand = new Random();
		m=in.nextInt();
		n=in.nextInt();
		int [][] grade= new int [m][n];
		mn=m-1;
		nm=n-1;
		for (i=0;i<m;i++) {
			for (j=0;j<n;j++) {
				grade[i][j]=rand.nextInt(64)+1;
			}
		}
		for (i=0;i<m;i++) {
			for (j=0;j<n;j++) {
				System.out.print(grade[i][j]+"	");
			}
			System.out.println("");
		}
	}

}
