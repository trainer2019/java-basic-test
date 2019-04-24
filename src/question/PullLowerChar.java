package question;

public class PullLowerChar {
	public static void main(String[] args) {

		String target = args[0];

		String result = "";
		for (int i = 0; i < target.length(); i++) {
			if (!Character.isUpperCase(target.charAt(i))) {
				result = result + target.charAt(i);
			}
		}

		System.out.println(result);
	}

	// ・文字列.charAt(n)
	//    -> n番目の文字を取得する

	// ・Character.isUpperCase(c)
	//    -> 文字cが大文字ならtrueを、小文字ならfalseになる
}
