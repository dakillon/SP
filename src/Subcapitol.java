import java.util.ArrayList;

public class Subcapitol {
	String titlu;
	ArrayList<Element>continut=new ArrayList<Element>();
	
	public Subcapitol(String titlu){
		this.titlu=titlu;
	}
	public void addElement(Element e){
		this.continut.add(e);
	}
	public void print(){
		System.out.println("Subcapitolul "+titlu);
		for(Element e:continut){
			
		}
		
	}
}
