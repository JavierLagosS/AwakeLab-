package IMC;

public class Persona {
	private String sName, sRut;
	private int iAge, iWeight, iHeight;
	private char cGenre;
	private int imc;
Persona(){
	System.out.println("Vacio");
}
Persona(String sName, int iAge, char cGenre){
	this.sName=sName;
	this.iAge=iAge;
	this.cGenre=cGenre; 
	
}
Persona(String sName,String sRut, int iAge, int iWeight, int iHeight, char cGenre){
	this.sName=sName;
	this.sRut=sRut;
	this.iAge=iAge;
	this.iWeight=iWeight;
	this.iHeight=iHeight;
	this.cGenre=cGenre; 
}

void calcularIMC(int IMC) {
	this.imc= (iHeight/(iWeight*iWeight));
    if (imc>20) {
		IMC=-1;
	}
    if (imc<=20 && IMC>=25) {
		IMC=0;
	}
    if (imc<25) {
		IMC=1;
	}
    
}
}
