import javax.swing.JOptionPane;

public class ExameColesterol extends DadosPessoais {
	public int hdl, ldl;
	public char risco;
	
	public void Colesterol() {
		String mensagemHdl, mensagemLdl;
		int birthResult = 2023 - birthYear;
		this.hdl = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Colesterol HDL por mg/l"));
		this.ldl = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Colesterol LDL por mg/l"));
		this.risco = JOptionPane.showInputDialog("Digite o risco do paciente \n A, M, B (alto, médio, baixo)").charAt(0);
	
		if(birthResult <= 19 && hdl > 45) {
			mensagemHdl = "Bom";
		} else if (birthResult >= 20 && hdl > 40) {
			mensagemHdl = "Bom";
		} else {
			mensagemHdl = "Abaixo do ideal";
		}
		
		if(risco == 'B' && ldl < 100) {
			mensagemLdl = "Bom";
		} else if (risco == 'M' && ldl < 70) {
			mensagemLdl = "Bom";
		} else if (risco == 'A' && ldl < 50){
			mensagemLdl = "Bom";
		} else {
			mensagemLdl = "Acima do ideal";
		}
		
		String message = ("Nome do paciente: " + name + "\n" +
				"Resultado amostra HDL: " + hdl + "\n" +
				"Resultado amostra LDL: " + ldl + "\n" +
				"Risco: " + risco + "\n" +
				"Classificação HDL: " + mensagemHdl + "\n" +
				"Classificação LDL: " + mensagemLdl + "\n");
		
		JOptionPane.showMessageDialog(null, message);
	}
	
}




//- Para Colesterol HDL: De 0 a 19 anos..: superior a 45 mg/dL (HDL - BOM)
//Acima de 20 anos: superior a 40 mg/dL (HDL - BOM)
//Se o paciente for risco baixo, o colesterol LDL deve estar abaixo de 100 mg/dL
//Se o paciente for risco médio, o colesterol LDL deve estar abaixo de 70 mg/dL    
//Se o paciente for risco alto, o colesterol LDL deve estar abaixo de 50 mg/dL



