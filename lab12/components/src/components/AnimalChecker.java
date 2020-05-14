package components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AnimalChecker extends JPanel implements ActionListener {

	JLabel picture;
	
	public AnimalChecker() {
		super(new BorderLayout());
		
		String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
		
		JComboBox petList = new JComboBox(petStrings);
        petList.setSelectedIndex(4);
        petList.addActionListener(this);
        
        //Set up the picture.
        picture = new JLabel();
        picture.setFont(picture.getFont().deriveFont(Font.ITALIC));
        picture.setHorizontalAlignment(JLabel.CENTER);
        updateLabel(petStrings[petList.getSelectedIndex()]);
        picture.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
        

        picture.setPreferredSize(new Dimension(177, 132));
        
        //Lay out the demo.
        add(petList, BorderLayout.PAGE_START);
        add(picture, BorderLayout.PAGE_END);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
	}
	
	//listen to the combo box
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("COMBOBOX");
		JComboBox cb = (JComboBox)e.getSource();
		String petName = (String)cb.getSelectedItem();
		updateLabel(petName);
	}
	
	//
	protected void updateLabel(String name) {
		ImageIcon icon = createImageIcon("images/" + name + ".gif");
		picture.setIcon(icon);
		picture.setToolTipText("A drawing of a " + name.toLowerCase());
        
		//check the image
		if (icon != null) {
            picture.setText(null);
        } else {
            picture.setText("Image not found");
        }
		
	}
	
	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = ComboBoxDemo.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		}
		else{
			System.err.println("Couldn't find file: " + path);
            return null;
		}
	}
	
	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("ComboBoxDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new ComboBoxDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}
	
	public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}

}
