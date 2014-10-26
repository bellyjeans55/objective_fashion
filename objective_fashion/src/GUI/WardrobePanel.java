package GUI;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class WardrobePanel extends JPanel{
	private JList wardrobeList;
	private JScrollPane wardrobeScrollPane;
	private JLabel wardrobeLabel;
	private GroupLayout layout;
	private GUIController controller;
	
	public WardrobePanel(GUIController controller) {
		initComponents();
		initLayout();
		this.controller = controller;
	}
	
	public JList getWardrobeList() {
		return wardrobeList;
	}
	
	public void initComponents() {
		wardrobeScrollPane = new JScrollPane();
		wardrobeList = new JList();
		wardrobeLabel = new JLabel();
		wardrobeLabel.setText("Wardrobe List");
		setBorder(javax.swing.BorderFactory.createEtchedBorder());
		
		wardrobeList.setModel(new DefaultListModel());
        wardrobeScrollPane.setViewportView(wardrobeList);
	}
	
	public void initLayout() {
		layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(wardrobeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(wardrobeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(wardrobeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(wardrobeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
	}
	
	public void setController(GUIController controller) {
		this.controller = controller;
	}

}
