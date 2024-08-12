import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task_codeAlpha {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Word Count Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 50, 300, 100);
        frame.add(textArea);

        JButton countButton = new JButton("Count Words");
        countButton.setBounds(150, 160, 120, 30);
        frame.add(countButton);

        JLabel resultLabel = new JLabel("Word Count: 0");
        resultLabel.setBounds(50, 200, 300, 30);
        frame.add(resultLabel);

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();

                int wordCount = countWords(text);

                resultLabel.setText("Word Count: " + wordCount);
            }
        });

        frame.setVisible(true);
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}
