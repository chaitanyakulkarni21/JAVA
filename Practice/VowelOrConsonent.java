import java.util.Scanner;

class VowlCheck{
	private String x;
	void getString(String st){
		this.x = st;
	}
	void check(){
		if ((this.x=="a"&& this.x=="A") | (this.x=="e"&& this.x=="E") | (this.x=="i"&& this.x=="I") | (this.x=="o"&& this.x=="O") | (this.x=="u"&& this.x=="U")){
			System.out.println("The entered alpabet is a Vowel");
		} else{
			System.out.println("The entered alphabet is a Consonent");
		}
	}
}

class VowelOrConsonent{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		VowelOrConsonent v = new VowelOrConsonent();
		System.out.println("Enter any Alphabet: ");
		v.x = sc.nextLine();
		v.getString(v.x);
		v.check();
	}
}