import javax.swing.*;

public class Formulario1 extends JFrame{

  public Formulario1(){
    setLayout(null);
  }
  public static void main(String args[]){
    Formulario1 newFormulario = new Formulario1();
    newFormulario.setBounds(350,100,400,400);
    newFormulario.setVisible(true);
    newFormulario.setLocationRelativeTo(null);
    newFormulario.setResizable(false);
  }
}