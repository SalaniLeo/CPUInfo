package main.window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import main.values;

public class settings extends JPanel implements ActionListener{

	public JButton sButton;
	boolean isMain=true;                
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;             

	settings(){
		
		initComponents();
		
		sButton = new JButton();
		
		sButton.setPreferredSize(new Dimension(40,40));
		sButton.setVisible(true);
		sButton.setBounds(10,0,50,50);
		sButton.setFocusable(false);
		sButton.setBackground(values.thirdColor);
		sButton.addActionListener(this);
		  try {
			    Image img = ImageIO.read(getClass().getResource("/images/settings.png"));
			    sButton.setIcon(new ImageIcon(img));
			  } catch (Exception ex) {
			    System.out.println(ex);
			
			  }
		  
		  jLabel1.setForeground(Color.white);
		  jTextField1.setBackground(values.thirdColor);
		  jTextField1.setBorder(null);
		  jTextField1.setForeground(Color.white);
		  jTextField1.setPreferredSize(new Dimension(60,20));
		  jComboBox1.setBackground(values.thirdColor);
		  jComboBox1.setFocusable(false);
		  jComboBox1.setBorder(null);
		  jComboBox1.setForeground(Color.white);
		  
		  add(jComboBox1);
		  add(jLabel1);
		  add(jTextField1);
		  setBackground(values.mainColor);
		  
	}
                                                           

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sButton) {

			changeState();
			
		}
		
	}

	private void changeState() {
		if(isMain==false) {
			
			window.f.remove(this);
			window.f.add(window.p);
			window.p.updateUI();
			isMain = true;
		} else {
        if(isMain==true) {
			window.f.remove(window.p);
			window.f.add(this);
			this.updateUI();
			isMain = false;
        }
        }
		
	}
	
	
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jTextField1.setText(values.refreshRate);

        jLabel1.setText("Refresh rate:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {values.timeUnit.toString()}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(265, Short.MAX_VALUE))
        );
    }                   

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    }  
	
	
	
	
	
	
	
	
	
	
}
