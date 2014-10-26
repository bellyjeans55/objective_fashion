package GUI;

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
	
	public WardrobePanel() {
		wardrobeScrollPane = new JScrollPane();
		wardrobeList = new JList();
		wardrobeLabel = new JLabel();
		wardrobeLabel.setText("Wardrobe List");
		
		wardrobeList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        wardrobeScrollPane.setViewportView(wardrobeList);
		
        layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wardrobeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
            .addComponent(wardrobeScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(wardrobeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent((wardrobeScrollPane)))
        );
	}

}
