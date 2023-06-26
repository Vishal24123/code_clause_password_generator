package generator;

/* The code below is used to randomly generate the passwords of required length and required number by the user*/
public class GeneratePassword {
	public void create(int n,int l,String[] str) {
		for(int i = 0; i < n; i++) {
			String randomPassword = "";
			for(int j = 0; j < l; j++) {
				randomPassword += randomCharacter();
			}
			str[i] = randomPassword;
		}
	}
	public static char randomCharacter() {
		int rand = (int)(Math.random()*62);
		if(rand <= 9) {
			int number = rand + 48;
			return (char)(number);
		} else if(rand <= 35) {
			int uppercase = rand + 55;
			return (char)(uppercase);
		} else {
			int lowercase = rand + 61;
			return (char)(lowercase);
		}
	}
}