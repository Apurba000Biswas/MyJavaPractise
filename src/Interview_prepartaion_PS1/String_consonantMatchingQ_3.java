package Interview_prepartaion_PS1;

public class String_consonantMatchingQ_3 {
	
	public static void main(String[] args) {
		String_consonantMatchingQ_3 ob = new String_consonantMatchingQ_3();
		ob.operation();
	}
	
	private String getString() {
		String str = "Hello, This is Apurba Biswas. He is Solving the problem of finding more than two consonant pattern matching";
		str = "aaabbbeeeebbbbbbberty";
		return str;
	}
	private void operation() {
		String str = getString();
		matchConsonant(str);
	}
	
	private void matchConsonant(String str) {
		int count = 0;
		int result = 0;
		for(int i=0; i<str.length(); i++) {
			if(isVowel(str.charAt(i))) {
				count = 0;
				continue;
			}else if (Character.isLetter(str.charAt(i))) {
				if(count>2) {
					continue;
				}
				count ++;
			}
			if(count > 2) {
				result ++;
			}
		}
		
		System.out.println("Result " + result);
	}
	
	private boolean isVowel(char c) {
		if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}

}
