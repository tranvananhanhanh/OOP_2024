import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        // Display a confirmation dialog
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?");

        // Display the result in a message dialog
        JOptionPane.showMessageDialog(null, "You've chosen: "
                + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));

        // Exit the program
        System.exit(0);
    }
}
