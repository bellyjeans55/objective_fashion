package GUI;

import java.awt.event.ActionEvent;

import clothing.outerwear.*;
import clothing.shoes.*;
import clothing.singletons.*;
import clothing.tops.*;
import clothing.variables.Color;
import clothing.variables.Material;
import clothing.bottoms.*;

import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clothing.accessories.Ring;
import clothing.generics.Clothing;
import clothing.generics.Socks;

public class AddItemPanel extends JPanel {
	GroupLayout layout;
	JLabel addItemLabel;
	JComboBox typeBox;
	JComboBox itemBox;
	JComboBox colorBox;
	JComboBox materialBox;
	JButton addButton;
	GUIController controller;
	
	public AddItemPanel(GUIController controller) {
		this.controller = controller;
        initComponents();
		initLayout();
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(228, 217));
	}
	
	public void addToWardrobe(Clothing article) {
		controller.addToWardrobe(article);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void initItemBoxes() {
		typeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item Type", "Accessories", 
				"Bottoms", "Outerwear", "Shoes", "One Piece", "Socks", "Tops" }));
        typeBox.addActionListener(new java.awt.event.ActionListener() {
            @SuppressWarnings({ "unchecked", "rawtypes" })
			public void actionPerformed(java.awt.event.ActionEvent evt) {
            	updateItemBox();
            }
            });
        itemBox.setModel(new DefaultComboBoxModel(new String[] {"Clothing Items"}));
//        itemBox.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//            	updateItemBox();
//            }
//        });
	}
    
    public void initColorBox() {
    	colorBox.setModel(new javax.swing.DefaultComboBoxModel(new Color[] {Color.BLUE, Color.BLACK, Color.BROWN, Color.BURGUNDY, Color.DARK_BLUE, Color.DARK_GREEN, Color.GREEN, 
				Color.GREY, Color.LIGHT_BLUE, Color.LIGHT_GREEN, Color.ORANGE, Color.PINK, Color.PURPLE, Color.RED,
				Color.TAN, Color.YELLOW, Color.WHITE }));
        colorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	updateItemBox();
            }
        });
    }
    
    public void initMaterialBox() {
        materialBox.setModel(new javax.swing.DefaultComboBoxModel(new Material[] 
        		{ Material.BROADCLOTH, Material.CANVAS, Material.CHINO, 
        		Material.COTTON, Material.DENIM, Material.FLANNEL, Material.LEATHER, Material.OXFORD, 
        		Material.SUEDE, Material.WOOL }));
        materialBox.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		updateItemBox();
        	}
        });
    }
    
    public void initAddButton() {
    	addButton.setText("Add to Wardrobe");
        addButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	Clothing article = getCurrentClothing();
            	if (article != null)
            		controller.addToWardrobe(article);
        	}
        });
    }
	
	public void initComponents() {
		colorBox = new JComboBox();
		materialBox = new JComboBox();
		itemBox = new JComboBox();
		typeBox = new JComboBox();
		addButton = new JButton();
		addItemLabel = new JLabel("Add Item");
		initItemBoxes();
		initAddButton();
		initColorBox();
		initMaterialBox();
	}
	
	public Clothing getCurrentClothing() {
		Object article = itemBox.getSelectedItem();
		if (article instanceof Clothing) {
			return (Clothing) article;
		}
		else return null;
		
	}
	
    public void updateItemBox() {
    	Object[] items;
    	Color color = (Color) colorBox.getSelectedItem();
    	Material material = (Material) materialBox.getSelectedItem();
    	switch ((String) typeBox.getSelectedItem()) {
    	case "Accessories": items = new Clothing[] {new Ring(color)};
    	break;
    	case "Bottoms": items = new Clothing[] {new Pants(color, material), 
    			new Shorts(color, material), new Skirt(color, material)};
    	break;
    	case "Outerwear": items = new Clothing[] {new Bomber(color, material), new Parka(color, material), 
    			new Topcoat(color, material), new Trucker(color, material)};
    	break;
    	case "Shoes":items = new Clothing[] {new BasketballShoes(color, material), new Bluchers(color, material), 
    			new Boots(color, material), new Oxfords(color, material), new SkateShoes(color, material)};
    	break;
    	case "One Piece": items = new Clothing[] {new Romper(color, material)};
    	break;
    	case "Socks": items = new Clothing[] {new Socks(color, material)};
    	break;
    	case "Tops": items = new Clothing[] {new ButtonUp(color, material), new Hoodie(color, material), 
    			new Polo(color, material), new Sweater(color, material), new Sweatshirt(color, material), 
    			new Tee(color, material)};
    	break;
    	default: items = new String[] {"Clothing Items"};
    	}
    	itemBox.setModel(new DefaultComboBoxModel(items));
    }
	
	public void initLayout() {
		layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(itemBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(addItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(materialBox, 0, 141, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(colorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(addItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(itemBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addComponent(colorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(materialBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(52, Short.MAX_VALUE))
            );
	}
	
	public void setController(GUIController controller) {
		this.controller = controller;
	}

}
