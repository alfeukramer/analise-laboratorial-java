
public class Principal {
	public static void main(String[] args) {
		ExameGlicemia p1 = new ExameGlicemia();
		p1.cadastrarExame();
		p1.Glicose();
	
		ExameTriglicerideos p2 = new ExameTriglicerideos();
		p2.cadastrarExame();
		p2.Triglicerideo();
		
		ExameColesterol p3 = new ExameColesterol();
		p3.cadastrarExame();
		p3.Colesterol();
	}
}
