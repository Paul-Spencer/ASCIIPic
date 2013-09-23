package asciiPic;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.awt.image.PixelGrabber;

import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;

public class ImageConverter {
	private BufferedImage imageIn;
	
	public ImageConverter(BufferedImage bi) {
		this.imageIn = bi;
	}

	public void doConversion() {
		int imgWidth = imageIn.getWidth();
		int imgHeight = imageIn.getHeight();

		BufferedImage imageOut = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_ARGB);
		
		int rgbArray[] = imageIn.getRGB(0, 0, imgWidth, imgHeight, null, 0,
				imgWidth);

		for (int y = 0; y < imgHeight; y++) {
			for (int x = 0; x < imgWidth; x++) {
				int r = new Color(imageIn.getRGB(x, y)).getRed();
				int g = new Color(imageIn.getRGB(x, y)).getGreen();
				int b = new Color(imageIn.getRGB(x, y)).getBlue();
				int average = (int)((r + g + b) / 3);
				imageOut.setRGB(x, y, new Color(average, average, average).getRGB());								
			}
		}
		
		
		
		System.out.println("Finished converting");
	}
}
