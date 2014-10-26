package GUI;

import javax.swing.GroupLayout;
import javax.swing.JPanel;

public class AddItemPanel extends JPanel {
	GroupLayout layout;
	
	public AddItemPanel() {
		layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
	}

}
