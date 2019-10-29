import java.util.*;
public class exerDois {
	public static void main(String[] args) {
		int m, n, i=0, j=0;
		Scanner in=new Scanner (System.in);
		Random rand = new Random();
		System.out.println("Digite o comprimento do eixo X");
		m=in.nextInt();
		System.out.println("Digite o comprimento do eixo Y");
		n=in.nextInt();
		int [][] grade= new int [m][n];
		for (i=0;i<m;i++) {
			for (j=0;j<n;j++) {
				grade[i][j]=rand.nextInt(64)+1;
			}
		}
		mostrarVetorBidimensionalInt(grade);
	}
	public static void mostrarVetorBidimensionalInt(int n[][]) {
		String espaco= "	";
		char pipe='|', hifen='-', aspas='"', underline='_';
		int i=0, j=0;
		System.out.println(espaco+"y");
		System.out.println(espaco+"^");
		System.out.println(espaco+pipe);
		for (i=(n[0].length-1);i>=0;i--) {
			System.out.print("      "+i+" "+hifen);
			for(j=0;j<(n.length);j++) {
				System.out.print(n[j][i]+espaco);
			}
			System.out.println("");
			if (i!=0) System.out.println(espaco+pipe);
		}
		System.out.print(espaco+pipe);
		for (j=0;j<(n.length-1);j++) {
			for (i=0;i<7;i++) {
				System.out.print(underline);
			}
			System.out.print("|");
		}
		System.out.print("_______");System.out.println("> X");
		System.out.print(espaco);
		for (i=0;i<(n.length);i++) {
			System.out.print(i+espaco);
		}
	}

}
