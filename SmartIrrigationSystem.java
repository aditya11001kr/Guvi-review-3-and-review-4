import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SmartIrrigationSystem {
    private JFrame frame;
    private JTextArea logArea;
    private JTextField moistureThresholdField;
    private JLabel statusLabel;
    private int moistureThreshold = 30; // Default threshold
    
    public SmartIrrigationSystem() {
        setupGUI();
    }
    
    private void setupGUI() {
        frame = new JFrame("Smart Irrigation System");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 2));
        
        topPanel.add(new JLabel("Moisture Threshold (%):"));
        moistureThresholdField = new JTextField(String.valueOf(moistureThreshold));
        topPanel.add(moistureThresholdField);
        
        JButton setThresholdButton = new JButton("Set Threshold");
        setThresholdButton.addActionListener(this::setThreshold);
        topPanel.add(setThresholdButton);
        
        statusLabel = new JLabel("System Status: Idle");
        topPanel.add(statusLabel);
        
        frame.add(topPanel, BorderLayout.NORTH);
        
        logArea = new JTextArea();
        logArea.setEditable(false);
        frame.add(new JScrollPane(logArea), BorderLayout.CENTER);
        
        JButton simulateButton = new JButton("Simulate Reading");
        simulateButton.addActionListener(this::simulateSensorReading);
        frame.add(simulateButton, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
    
    private void setThreshold(ActionEvent e) {
        try {
            moistureThreshold = Integer.parseInt(moistureThresholdField.getText());
            log("Threshold updated to: " + moistureThreshold + "%");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid threshold value.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void simulateSensorReading(ActionEvent e) {
        int moisture = new Random().nextInt(100); // Mocking sensor data
        log("Sensor Reading: " + moisture + "%");
        
        if (moisture < moistureThreshold) {
            statusLabel.setText("System Status: Irrigating...");
            log("Irrigation started.");
        } else {
            statusLabel.setText("System Status: Idle");
            log("No irrigation needed.");
        }
    }
    
    private void log(String message) {
        logArea.append(message + "\n");
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SmartIrrigationSystem::new);
    }
}
