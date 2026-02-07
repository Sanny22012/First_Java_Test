import java.util.HashMap;

public class Dub {

	public static void main(String[] args) {
		String str = "SannyAnand";
		char[] cha = str.toCharArray();
		Integer count = 1;
		for (int i = 0; i < cha.length; i++) {
			for (int j = i + 1; j < cha.length; j++) {
				if (cha[i] == cha[j]) {
					count++;
				}
			}
			System.out.print(cha[i] + " " + count + "     ");
		}
	}

}
