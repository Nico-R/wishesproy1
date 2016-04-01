package whises;
import java.util.Date;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import whises.Vence;

public class NewObjetive {
	private String objetive;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date actual;
	Vence ven = new Vence();
	
	public NewObjetive(){System.out.println(actual);}
	public String getObjetive() {
		
		if ( ven.getFecha().after(actual)) {
			return objetive; }
		else{
			System.out.println("No ah cumplido con la fecha aún.");
		}
		
	}

	public void setObjetive(String objetive) {
		this.objetive = objetive;
	};
	
	

}
