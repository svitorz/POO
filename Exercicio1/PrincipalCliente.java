package Exercicio1;

import javax.swing.JOptionPane;

public class PrincipalCliente {
  
  public static void main(String[] args) {
    Cliente cliente = new Cliente(); 

    JOptionPane.showMessageDialog(null, cliente.Mostrar(    
        JOptionPane.showInputDialog("Informe o nome:"),     
        JOptionPane.showInputDialog("Informe o RG:")  
    ));

    System.out.println("Fim da classe main.");
  }
}
