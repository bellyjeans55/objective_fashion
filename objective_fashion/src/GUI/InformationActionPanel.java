package GUI;

import javax.swing.GroupLayout;
import javax.swing.JPanel;

public class InformationActionPanel extends JPanel{
	GroupLayout layout;

	public InformationActionPanel() {
		layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

	}
}
