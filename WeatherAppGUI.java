
import javax.swing.*;
public class WeatherAppGUI extends JFrame {

	public WeatherAppGUI() {
		//setup our gui and add a title
		super("Weather App");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//set the size of our GUI
		setSize(450,650);
		// load our gui at the center of the screen
		setLocationRelativeTo(null);
		// make our layout manager null to manually position our components within our gui
		setLayout(null);
		//prevent any resize of our gui
		setResizable(false);
	}
	

}
