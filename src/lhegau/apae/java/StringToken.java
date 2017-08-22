package lhegau.apae.java;

public class StringToken {

	public static void main(String[] args) {
		
		String s = "XHTML; CSS; JAVASCRIPT; JQUERY; JAVA";
		s = "Peru APAE GOEC Menu";
		String[] tokens = s.split(" ");
		System.out.println(tokens.length + " tokens");
		for(String token : tokens){
			System.out.println(token);
		}
		
	}

}
