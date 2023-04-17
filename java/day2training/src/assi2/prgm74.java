package assi2;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

public class prgm74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        String inputFile = "image.bin";
		        
		        try {
		            // Read in the binary data from the input file
		            FileInputStream fileInputStream = new FileInputStream(inputFile);
		            byte[] bytes = fileInputStream.readAllBytes();
		            
		            // Convert the binary data to a BufferedImage
		            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
		            BufferedImage image = ImageIO.read(byteArrayInputStream);
		            
		            // Display the image in a JFrame
		            JFrame frame = new JFrame();
		            JLabel label = new JLabel(new ImageIcon(image));
		            frame.getContentPane().add(label, BorderLayout.CENTER);
		            frame.pack();
		            frame.setVisible(true);
		            
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }

		


	}


