import javax.swing.*;


public class JOptionTest {
    public static void main(String[] args) {
  String dato = JOptionPane.showInputDialog(null, "Ingresa un numero", "introduccion", JOptionPane.QUESTION_MESSAGE);
  int numero = Integer.parseInt(dato);

  JOptionPane.showMessageDialog(null, "El numero que ingresaste es " + dato);
        }
}


