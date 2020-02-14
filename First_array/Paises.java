package First_array;

public class Paises {
	 /**
	 * 
	 */
	public Paises() {
		super();
	}


	public String Paises;
	 public String Capitales;
	 
	 
	   public Paises(String Paises, String  Capitales) {
		  this.Paises=Paises;
		  this.Capitales=Capitales;
		   }


	public String getPaises() {
		return Paises;
	}


	public void setPaises(String paises) {
		Paises = paises;
	}


	public String getCapitales() {
		return Capitales;
	}


	public void setCapitales(String capitales) {
		Capitales = capitales;
	}


	@Override
	public String toString() {
		return " Pais = " + this.Paises + ", Capital = " + this.Capitales  ;
	}
	   
	 
	  
	  
	  
	  
	  
	  
	  
	}
