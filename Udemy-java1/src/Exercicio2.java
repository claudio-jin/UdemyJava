
public class Exercicio2 {

	public static void main(String[] args) {
		int x, y;
		
		x = 5;
		y = 2 + x;
		
		System.out.println(x);
		System.out.println(y);
		
		//ex2
		
		int w;
		double z;
		
		w = 5;
		z = 2 * w;
		
		System.out.println(w);
		System.out.println(z);
		
		
		//ex3
		
		double b, B, h, area;
		b=6f;
		B=8f;
		h=5f;
		//o f, indica que é do tipo float
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		
		//ex4
		int c, d;
		double resultado;
		
		c = 5;
		d = 2;
		
		resultado = (double) c/d;	//Colocar o tipo entre parenteses se chama casting
		//transforma o valor no tipo que vc quer
		System.out.println(resultado);
		
		//ex5
		
		double g;
		int i;
		g = 5.0;
		i = (int) g;	//avisa que vc quer do tipo 5, porem corre o risco de perder dados
		System.out.println(i);
		
	}
}
