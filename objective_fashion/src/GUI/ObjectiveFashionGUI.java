package GUI;

import javax.swing.GroupLayout;

	public class ObjectiveFashionGUI extends javax.swing.JFrame {

		private InformationActionPanel informationActionPanel;
	    private WardrobePanel wardrobePanel;
	    private AddItemPanel addItemPanel;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JList jList2;
	    private javax.swing.JScrollPane jScrollPane2;
	    
	    /**
	     * Creates new form objectiveGUI
	     */
	    public ObjectiveFashionGUI() {
	        initComponents();
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     */
	    @SuppressWarnings("unchecked")
	    private void initComponents() {

	        addItemPanel = new AddItemPanel();
	        informationActionPanel = new InformationActionPanel();
	        wardrobePanel = new WardrobePanel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	                    .addComponent(informationActionPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(addItemPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(wardrobePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addGap(0, 0, Short.MAX_VALUE)
	                .addComponent(informationActionPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(addItemPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	            .addComponent(wardrobePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	    }

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String args[]) {
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (Exception ex) {
	        	System.out.println(ex.getStackTrace());
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new ObjectiveFashionGUI().setVisible(true);
	            }
	        });
	    }
}
