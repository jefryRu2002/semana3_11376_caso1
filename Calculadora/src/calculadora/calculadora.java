package calculadora;

public class calculadora {
	private int n1,n2,n3;
	private  double num1,num2;
	public calculadora(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public calculadora(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	public calculadora(double num1, double num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}
//sobrecarga de metodos	
	public int Sumar(int n1, int n2)
	{
		return n1+n2;
	}
	public int Sumar(int n1,int n2, int n3)
	{
		return n1+n2+n3;
	}
	public double Sumar(double num1,double num2)
	{
		return num1+num2;
	}
	//Comentario los get and set se utilizan cuando se va a modificar los datos
	

	
}
