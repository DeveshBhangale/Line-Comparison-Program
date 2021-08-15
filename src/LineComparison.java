import java.util.*;
public class LineComparison {
	public static boolean equals(int lengthl1, int lengthl2) {
		return Integer.toString(lengthl1).equals(Integer.toString(lengthl2));
	}
	public static int compareTo(int lengthl1, int lengthl2) {
		int a = Integer.toString(lengthl1).compareTo(Integer.toString(lengthl2));
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in one line \nInput format: x1 y1 x2 y2 x3 y3 x4 y4");
		String[] s = sc.nextLine().split(" ");
		int a[] = new int[s.length];
		for (int i = 0; i< s.length; i++) {
			a[i] = Integer.parseInt(s[i]);
			// System.out.println(a[i]);
		}		
		// Use Case - 1
		int lengthl1 = (int) Math.sqrt(Math.pow((a[2]-a[0]),2) + Math.pow((a[3]-a[1]),2));
		int lengthl2 = (int) Math.sqrt(Math.pow((a[6]-a[4]),2) + Math.pow((a[7]-a[5]),2));
		
		// Use Case - 2
		System.out.println(Integer.toString(lengthl1).equals(Integer.toString(lengthl2)));
		
		//Use Case - 3
		System.out.println(Integer.toString(lengthl1).compareTo(Integer.toString(lengthl2)));
	}

}
