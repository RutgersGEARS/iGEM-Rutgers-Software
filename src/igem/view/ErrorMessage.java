package igem.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class ErrorMessage extends JLabel{

		/**
		 * User to show an error
		 */
		private JButton showLabelButton;
		
		/**
		 * Will display the error to the user
		 * 
		 * @param e a string of the error of what happened
		 */
		public ErrorMessage(String e)
		{
			super("Error Message");
			
			JLabel label = new JLabel(e);
			JOptionPane.showMessageDialog(showLabelButton, label, "Label", 
												JOptionPane.WARNING_MESSAGE);
		}
		
		public static void giveErrorMessage(String message){
			ErrorMessage newMessage = new ErrorMessage(message);
		}
	}

