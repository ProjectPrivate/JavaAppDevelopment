package ProjectPrivate;

import javax.swing.*;
import java.awt.*;

public class ProjectPrivateDriver {

	public static void main(String[] args) {
		
		//Sets JFrame and components in it
		JFrame frame = new JFrame("Project Private");
		JLabel textLabel = new JLabel("System Temperatures",SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(300, 300));
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);
		// Adds Buttons to the JFrame
		JPanel iconPanel = new JPanel();
        JButton CPUTemp = new JButton("CPU Temperature");
        JButton GPUTemp = new JButton("GPU Temperature");
        JButton RAMTemp = new JButton("RAM Temperature");
        iconPanel.add(CPUTemp);
        iconPanel.add(GPUTemp);
        iconPanel.add(RAMTemp);
        frame.add(iconPanel);
        frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
