import java.util.*;
public class exerUm {
	public static void main(String[] args) {
		int tam, i=0, j=0;
		int [] [] grade;
		Scanner in=new Scanner(System.in);
		Random rand= new Random ();
		tam=rand.nextInt(8)+1;
		grade= new int [tam][tam];
		for (i=0;i<tam;i++) {
			for (j=0;j<tam;j++) {
				grade[i][j]= rand.nextInt(32);
			}
		}
		for (i=0;i<tam;i++) {
			if (i!=tam-1) System.out.print(grade[i][i]+", ");
			else System.out.print(grade[i][i]);
		}
	}
}
