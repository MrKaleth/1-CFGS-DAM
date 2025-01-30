package boletin2;

public class Gatos {
	String raza;
	String color;
	String sexo;
	int edad;
	float peso;
	
	
	
	public Gatos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gatos(String color, String sexo, int edad, float peso) {
		super();
		this.color = color;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
	}

	public Gatos(String r, String c, String s, int e, float p) {
		raza = r;
		color = c;
		sexo = s;
		edad = e;
		peso = p;
	}

	public void maullar() {
		System.out.println("Miauuuuu");
	}

	public void ronronear() {
		System.out.println("Rrrrr");
	}

	public void comer(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Yummy Yummy");
		} else {
			System.out.println("Buahhh, mejor no");
		}
	}

	public void pelear(Gatos otroGato) {
		if (sexo.equals(otroGato.sexo)) {
			System.out.println("Ven aquí que te vas a enterar");
		} else {
			System.out.println("La violencia nunca es la solución");
		}
	}

	@Override
	public String toString() {
		return "Gatos. Raza:" + raza + ", color:" + color + ", sexo:" + sexo + ", edad:" + edad + ", peso:" + peso;
	}
	
}
