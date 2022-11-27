package io.github.explodingbottle.dummyprog;

import javax.swing.JOptionPane;

public class DummyMain {

	public static void main(String[] args) {
		int response = JOptionPane.showConfirmDialog(null, "Are you dumb ?", "Serious question",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == 0) {
			JOptionPane.showMessageDialog(null, "That's false, you are not dumb.", "Serious answer",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "That's right, you are not dumb.", "Serious answer",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
