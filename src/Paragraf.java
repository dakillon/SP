
public class Paragraf implements Element {
	String text;
	Paragraf(String t){
		this.text=t;
		
	}
	public void print(){
		System.out.println(text);
	}
}
