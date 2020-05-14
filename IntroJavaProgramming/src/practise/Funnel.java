//Challenge
//Given two strings of letters, determine whether the second can be made from the first by removing one letter.
//The remaining letters must stay in the same order.
//
//Examples
//funnel("leave", "eave") => true
//funnel("reset", "rest") => true
//funnel("dragoon", "dragon") => true
//funnel("eave", "leave") => false
//funnel("sleet", "lets") => false
//funnel("skiff", "ski") => false

package practise;

public class Funnel {
	public static void main(String[] args) {

		System.out.println(funnel("leave", "eave"));
		System.out.println(funnel("reset", "rest"));
		System.out.println(funnel("eave", "leave"));
		System.out.println(funnel("sleet", "lets"));
		System.out.println(funnel("skiff", "ski"));
	}

	public static boolean funnel(String s1, String s2) {

		int count = 0;
		int i = 0;
		int j = 0;
		if (s1.length() - s2.length() > 1)
			return false;
		else {

			while (j < s2.length() && count <= 1) {
				if (s1.charAt(i) == s2.charAt(j)) {
					i++;
					j++;
				} else if (s1.charAt(i) != s2.charAt(j)) {
					i++;
					count++;
				}

			}
		}

		if (j == s2.length())
			return true;
		else
			return false;
	}

}