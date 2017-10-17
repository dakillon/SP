import java.util.ArrayList;

public class Capitol {
	public String titlu;
	ArrayList<Subcapitol>subcapitol=new ArrayList<Subcapitol>();
	Capitol(String t){
		titlu=t;
		Subcapitol s1= new Subcapitol("Subcap1");
		s1.addElement(Imagine i);
		s1.addElement(Paragraf p);
		subcapitol.add(s1);
		
	}
}
