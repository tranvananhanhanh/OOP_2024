
import javax.swing.JOptionPane;

public class ChoosingOption {

    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?","Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "chosen: Yes");
            }
        else if (option == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "chosen: No");
            }


    System.exit(0);

    }

}