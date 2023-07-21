import javax.swing.*;
import java.awt.*;

public class SimpleSearchEngine extends JFrame {

    private final JTextField searchField;
    public JButton clearButton;

    public SimpleSearchEngine() {
        setTitle("My Search Engine");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        searchField = new JTextField();
        searchField.setPreferredSize(new Dimension(50, 30));
        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(e -> {
            String query = searchField.getText();

            JOptionPane.showMessageDialog(SimpleSearchEngine.this, "Search for \"" + query + "\"");
        });

        clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> searchField.setText(""));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(searchButton);
        buttonPanel.add(clearButton);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(searchField, BorderLayout.NORTH);
        contentPane.add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SimpleSearchEngine searchEngine = new SimpleSearchEngine();
        searchEngine.setVisible(true);
    }
}

























