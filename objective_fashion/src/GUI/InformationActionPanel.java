package GUI;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import clothing.variables.Formality;

public class InformationActionPanel extends JPanel{
	GroupLayout layout;
	JComboBox typeBox;
	JComboBox itemBox;
	JComboBox colorBox;
	JLabel emailLabel;
	JLabel objectiveFashionLabel;
	JTextField emailTextField;
	JLabel preferencesLabel;
	JTextArea weatherTextArea;
	JButton createButton;
	JComboBox formalityBox;
	GUIController controller;

	public InformationActionPanel(GUIController controller) {
		initComponents();
		initLayout();
		this.controller = controller;
		setPreferredSize(new java.awt.Dimension(200, 300));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
	}
	
	public void initComponents() {
		typeBox = new JComboBox();
		itemBox = new JComboBox();
		colorBox = new JComboBox();
		formalityBox = new JComboBox();
		emailLabel = new JLabel();
		objectiveFashionLabel = new JLabel();
		emailTextField = new JTextField();
		preferencesLabel = new JLabel();
		weatherTextArea = new JTextArea();
		createButton = new JButton();

        emailLabel.setText("Email:");

        emailTextField.setText("Enter Email Here...");

        formalityBox.setModel(new javax.swing.DefaultComboBoxModel(new Formality[] { Formality.CASUAL, Formality.SMART_CASUAL, 
        		Formality.BUSINESS_CASUAL, Formality.FORMAL}));
        formalityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            
            }
        });

        createButton.setText("Create Outfit");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        weatherTextArea.setColumns(20);
        weatherTextArea.setRows(5);
        weatherTextArea.setText("Current Weather in Chapel Hill\nTemp (F): \nForecast:");
        weatherTextArea.setMaximumSize(new java.awt.Dimension(164, 94));
        weatherTextArea.setName(""); 
        weatherTextArea.setEditable(false);

        preferencesLabel.setText("Preferences:");

        objectiveFashionLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        objectiveFashionLabel.setText("Objective Fashion");
	}
	public void initLayout() {
    	layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(preferencesLabel)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(formalityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(emailLabel)
                                .addComponent(objectiveFashionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(18, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(weatherTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createButton)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(objectiveFashionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailLabel)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(formalityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(preferencesLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                            .addComponent(weatherTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
    }
	
	public String getEmail() {
		return emailTextField.getText();
	}
	
	public Formality getFormality() {
		return (Formality) formalityBox.getSelectedItem();
	}

	public void setController(GUIController controller) {
		this.controller = controller;
	}
}
