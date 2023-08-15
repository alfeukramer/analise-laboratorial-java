import javax.swing.JOptionPane;

public class DadosPessoais {
	public String name;
	public String bloodType;
	public int birthYear;
	
	public void cadastrarExame() {
		this.name = JOptionPane.showInputDialog("Digite o nome do paciente: ");
		this.bloodType = JOptionPane.showInputDialog("Digite o tipo sanguíneo do paciente: ");
		this.birthYear = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente: "));;
		
	}
	
}