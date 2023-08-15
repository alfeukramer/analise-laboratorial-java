import javax.swing.JOptionPane;

public class ExameTriglicerideos extends DadosPessoais {
	public int triglicerideo;
	
	public void Triglicerideo() {
		String mensagem;
		this.triglicerideo = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de triglicerídeo por mg/l"));
		int birthResult = 2023 - birthYear;
		
		if(birthResult <= 9 && triglicerideo <= 75) {
			mensagem = "Normal";
		} else if(birthResult >= 10 && birthResult <= 19 && triglicerideo <= 90) {
			mensagem = "Normal";
		} else if(birthResult > 20 && triglicerideo < 150) {
			mensagem = "Normal";
		} else {
			mensagem = "Acima do Ideal";
		}
		String message = ("Nome do paciente: " + name + "\n" +
				"Resultado amostra: " + triglicerideo + "\n" +
				"Classificação: " + mensagem);
				
		JOptionPane.showMessageDialog(null, message);
		
	}
}
