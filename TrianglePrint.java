import java.util.Scanner;

public class TrianglePrint {

	public static void main(String[] args) {
		String in = "";
		Scanner scanner = new Scanner(System.in);
		in = scanner.next();
		scanner.close();
		int len = in.length();
		String out = "";
		
		for (int i = (len/2); i < len; i++) {
			out = out + in.charAt(i);
			for (int j = (len - out.length()); j > 0 ; j--) {
				System.out.print(" ");
			}
			System.out.print(out + "\n");
		}
		
		for (int i = 0; i < len /2; i++) {
			out = out + in.charAt(i);
			for (int j = (len - out.length()); j > 0 ; j--) {
				System.out.print(" ");
			}
			System.out.print(out + "\n");
		}
	}
}

