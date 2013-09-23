package asciiPic;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello World");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(0, 200, 0));
		
		
		
		JLabel label = new JLabel("A Label!", JLabel.HORIZONTAL);
		label.setBackground(new Color(100, 0, 50));
		label.setOpaque(true);
		label.setBounds(30, 30, 200, 100);
		
		
		
		frame.getContentPane().add(label);
		//frame.setOpacity(1.0f);

		BufferedImage bi = null;

		try {
			bi = ImageIO
					.read(new File(
							"h:/Source Code/Eclipse Workspace/ASCIIPic/Minecraft-360.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ImageConverter ic = new ImageConverter(bi);
		ic.doConversion();		
	}

}
