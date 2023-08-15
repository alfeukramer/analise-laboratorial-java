import javax.swing.JOptionPane;

public class ExameGlicemia extends DadosPessoais{
	public double glicose;
		
	public void Glicose() {
		this.glicose = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de glicose por mg/l"));
		String mensagem;

		if (glicose < 100) {
			mensagem = "Classificação: Normoglicemia";
		} else if (glicose <= 100 || glicose < 126) {
			mensagem = "Classificação: Pré-diabetes";
		} else {
			mensagem = "Classificação: Diabetes estabelecido";
		}
		String message = ("Nome do paciente: " + name + "\n" +
		"Resultado amostra: " + glicose + "\n" +
		mensagem);
		
		JOptionPane.showMessageDialog(null, message);
		
	}
}
