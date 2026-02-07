import java.util.HashMap;

public class Dplicate {
	public static void main(String[] args) {
		String str = "Automation";
		String[] spl = str.split("");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < spl.length; i++) {
			if (map.containsKey(spl[i])) {
				int count = map.get(spl[i]);
				map.put(spl[i], count + 1);
			} else {
				map.put(spl[i], 1);
			}
		}
		System.out.println(map);

	}

}

