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
	                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addComponent(informationActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(addItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addComponent(wardrobePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            );
	            layout.setVerticalGroup(
	                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addComponent(wardrobePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
	                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                    .addComponent(informationActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                    .addComponent(addItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
	            );
	            
	        pack();
	    }

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String args[]) {
	    	System.out.println("this works");
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
