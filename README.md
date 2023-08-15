# Projeto de Análise Laboratorial

<h3>Esse projeto tem intuito de analisar amostras e classificá-las conforme um laboratório fictício.</h3><br>
<p>Projeto desenvolvido para aprendizado, onde coloquei em prática os conhecimentos adquiridos de POO em Java. Atividade desenvolvida do curso de Análise e Desenvolvimento de Sistemas Unicesumar.  </p>

<p>Todos os exames devem armazenar algumas características em comum como por exemplo, nome do paciente, tipo sanguíneo e ano de nascimento.</p> 
  Já para cada tipo de exame é necessário características específicas como:<br>
    <b>- Glicemia:</b> Armazenar além dos dados do exame a quantidade de glicose por mg/l.<br>
    <b>- Colesterol:</b> Armazenar além dos dados do exame a quantidade de LDL e HDL por mg/l e o risco do paciente (B - baixo, M - medio e A - alto).<br>
    <b>- Triglicerídeos:</b> Armazenar além dos dados do exame a quantidade de triglicerídeo por mg/l.<br><br>
    
<h4>Todos esses exames devem possuir três métodos, são eles:<br></h4>
    <b>- Classificar Resultado:</b> Responsável por aplicar a conclusão a partir da quantidade obtida, deve olhar a quantidade e classificar como:<br><br>
        <p><b>- Glicemia:</b></p> Normoglicemia: Inferior a 100 mg/dL<br>
                         Pré-diabetes: Superior ou igual a 100 mg/dL eles Inferior a 126 mg/dL<br>
                         Diabetes estabelecido: Superior ou igual a 126 mg/dL<br><br>
        <p><b>- Colesterol HDL:</b></p>Até 19 anos..: superior a 45 mg/dL (Bom)<br>
                               Acima de 20 anos: superior a 40 mg/dL (Bom)<br><br>
        <p><b>- Colesterol LDL:</b></p> Se o paciente for risco baixo, deve estar abaixo de 100 mg/dL<br>
                               Se o paciente for risco médio, deve estar abaixo de 70 mg/dL<br>    
                               Se o paciente for risco alto, deve estar abaixo de 50 mg/dL<br><br>
        <p><b>- Triglicerídeos:</b></p> Até 9 anos: Inferior a 75 mg/dL<br>
                               De 10 a 19 anos: Inferior a 90 mg/dL<br>
                               Acima de 20 anos: Inferior a 150 mg/dL<br><br>
    <b>- Mostrar resultado:</b> Imprimir na tela o valor do exame e a classificação obtida.<br><br>
    <b>- Cadastrar Exame:</b> No cadastro de exame deve ser lido os dados do exame, bem como a quantidade em mg/L.

