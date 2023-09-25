package src.ppt6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerExam implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		System.out.println(actionCommand);
	};
}

