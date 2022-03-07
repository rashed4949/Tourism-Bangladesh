import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class A {   
    public void  A() {   
        JFrame frame = new JFrame("TOURISM BANGLADESH");   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
  
        JPanel panel = new JPanel();
        JButton jb=new JButton();
  
       // JLabel label = new JLabel();   
        jb.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\Tourism-spot-in-Bangladesh.jpg"));
        panel.add(jb);  
        frame.add(panel);
        frame.setSize(787,435);
        frame.setVisible(true);   
        
        
   
        
        
    	jb.addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			
    		
    			JFrame frame2 =new JFrame("TOURIST ZONE");
    			frame2.setSize(800,450);
    			JPanel panel3=new JPanel();	
    			
    			
     			
   			JLabel lblNewLabel = new JLabel("TOURIST ZONE>>>");
    			lblNewLabel.setBounds(300, 10, 170, 30);
    			frame2.getContentPane().add(lblNewLabel);
    			
    			JButton l = new JButton("DHAKA ZONE");
    			frame2.getContentPane().add(l); 
    			l.setBounds(300, 50, 170, 40);
    			panel3.setBackground(Color.red);
    			//panel3.add(l,BorderLayout.WEST);
    			
    			
    			
    			l.addActionListener(new ActionListener() {
    				
    				@Override
    				public void actionPerformed(ActionEvent e) {
    					// TODO Auto-generated method stub
    					
    				
    					JFrame frame2 =new JFrame("DHAKA ZONE");
    					frame2.setSize(800,450);
    					JPanel panel3=new JPanel();	
    					
    					panel3.setBackground(Color.LIGHT_GRAY);
    					JLabel lblNewLabel = new JLabel("DHAKA ZONE>>>");
    	    			lblNewLabel.setBounds(300, 10, 170, 30);
    	    			frame2.getContentPane().add(lblNewLabel);

    					JButton r = new JButton("LALBAG KELLA");
    	    			frame2.getContentPane().add(r); 
    	    			r.setBounds(300, 60, 170, 40);
    	    			
    	    			r.addActionListener(new ActionListener() {
    	    				
    	    				@Override
    	    				public void actionPerformed(ActionEvent e) {
    	    					// TODO Auto-generated method stub
    	    					
    	    				
    	    					JFrame frame2 =new JFrame("LALBAG KELLA ");
    	    					frame2.setSize(600,600);
    	    					//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    					//setBounds(100, 100, 500, 383);
    	    					JPanel contentPane = new JPanel();
    	    					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    	    					frame2.setContentPane(contentPane);
    	    					contentPane.setLayout(null);
    	    					
    	    					JPanel panel = new JPanel();
    	    					panel.setBounds(0, 0, 484, 344);
    	    					contentPane.add(panel);
    	    					panel.setLayout(null);
    	    					
    	    					
    	    					JTextPane textPane = new JTextPane();
    	    					textPane.setBounds(50, 48, 300, 500);
    	    					panel.add(textPane);
    	    					
    	    					JLabel lblLalbagKella = new JLabel("lalbag kella");
    	    					lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
    	    					lblLalbagKella.setBounds(206, 21, 120, 21);
    	    					panel.add(lblLalbagKella);
    	    					
    	    					JLabel label = new JLabel("");
    	    					label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Dhaka Zone\\Lalbag Kella\\big_25.jpg"));//eikane tor pic er path hobe
    	    					label.setBounds(350, 48, 183, 155);
    	    					panel.add(label);
    	    					//*******ata textpan a text set kore ***********
    	    					fileRead f=new fileRead();
    	    					textPane.setText(f.read());
    	    					//panel.setBackground(Color.BLUE);
    	    					//**********************************************
    	    					frame2.setVisible(true);
    	    					
    	    				}
    	    			});
    	    			JButton s = new JButton("AHSAN MANJIL");
    	    			frame2.getContentPane().add(s);
    	    			s.setBounds(300, 110, 170, 40);
    	    			
	s.addActionListener(new ActionListener() {
    	    				
    	    				@Override
    	    				public void actionPerformed(ActionEvent e) {
    	    					// TODO Auto-generated method stub
    	    					
    	    				
    	    					JFrame frame2 =new JFrame("AHSAN MANJIL");
    	    					frame2.setSize(600,650);
    	    					JPanel panel3=new JPanel();	
    	    					
    	    	
    	    	    			
    	    					JPanel contentPane = new JPanel();
    	    					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    	    					frame2.setContentPane(contentPane);
    	    					contentPane.setLayout(null);
    	    					
    	    					JPanel panel = new JPanel();
    	    					panel.setBounds(0, 0, 484, 344);
    	    					contentPane.add(panel);
    	    					panel.setLayout(null);
    	    					
    	    					
    	    					JTextPane textPane = new JTextPane();
    	    					textPane.setBounds(50, 48, 300, 500);
    	    					panel.add(textPane);
    	    					
    	    					JLabel lblLalbagKella = new JLabel("Ahsan manjil");
    	    					lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
    	    					lblLalbagKella.setBounds(206, 21, 120, 21);
    	    					panel.add(lblLalbagKella);
    	    					
    	    					JLabel label = new JLabel("");
    	    					label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Dhaka Zone\\Ahsan manjil\\big_24.jpg"));//eikane tor pic er path hobe
    	    					label.setBounds(350, 48, 183, 155);
    	    					panel.add(label);
    	    					//*******ata textpan a text set kore ***********
    	    					fileRead f=new fileRead();
    	    					textPane.setText(f.read1());
    	    					//**********************************************
    	    					frame2.add(panel3);
    	    					frame2.setVisible(true);
    	    				}
    	    			});
    					
    			
    					
    					frame2.add(panel3);
    					frame2.setVisible(true);
    				}
    			});
    			
    			  JButton button1 = new JButton("CHITTAGONG ZONE");
  	    		button1.setBounds(300, 100, 170, 40);
  	    		frame2.getContentPane().add(button1);

button1.addActionListener(new ActionListener() {
    				
    				@Override
    				public void actionPerformed(ActionEvent e) {
    					// TODO Auto-generated method stub
    					
    				
    					JFrame frame2 =new JFrame("CHITTAGONG ZONE");
    					frame2.setSize(800,450);
    					JPanel panel3=new JPanel();	
    					
    					
    					panel3.setBackground(Color.LIGHT_GRAY);


    	    		
    					JLabel lblNewLabel = new JLabel("CHITTAGONG ZONE>>>");
    	    			lblNewLabel.setBounds(300, 10, 170, 30);
    	    			frame2.getContentPane().add(lblNewLabel);

    					JButton t = new JButton("St. Martins Island");
    	    			frame2.getContentPane().add(t); 
    	    			t.setBounds(300, 60, 170, 40);
    	    			
    	    			
	t.addActionListener(new ActionListener() {
    	    				
    	    				@Override
    	    				public void actionPerformed(ActionEvent e) {
    	    					// TODO Auto-generated method stub
    	    					
    	    				
    	    					JFrame frame2 =new JFrame("St. Martins Island");
    	    					frame2.setSize(600,650);
    	    					//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    					//setBounds(100, 100, 500, 383);
    	    					JPanel contentPane = new JPanel();
    	    					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    	    					frame2.setContentPane(contentPane);
    	    					contentPane.setLayout(null);
    	    					
    	    					JPanel panel = new JPanel();
    	    					panel.setBounds(0, 0, 484, 344);
    	    					contentPane.add(panel);
    	    					panel.setLayout(null);
    	    					
    	    					
    	    					JTextPane textPane = new JTextPane();
    	    					textPane.setBounds(50, 48, 300, 500);
    	    					panel.add(textPane);
    	    					
    	    					JLabel lblLalbagKella = new JLabel("St. Martins Island");
    	    					lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
    	    					lblLalbagKella.setBounds(206, 11, 120, 21);
    	    					panel.add(lblLalbagKella);
    	    					
    	    					JLabel label = new JLabel("St. Martins Island");
    	    					label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Chittagong Zone\\St. Martins Island\\big_60.jpg"));//eikane tor pic er path hobe
    	    					label.setBounds(350, 48, 183, 155);
    	    					panel.add(label);
    	    					//*******ata textpan a text set kore ***********
    	    					fileRead f=new fileRead();
    	    					textPane.setText(f.read12());
    	    					//*******************************************
    	    					
    	    	
    	    	    			
    	    					
    	    				//	frame2.add(panel3);
    	    					frame2.setVisible(true);
    	    				}
    	    			});
    	    			
    	    			JButton u = new JButton("Bandarban");
    	    			frame2.getContentPane().add(u);
    	    			u.setBounds(300, 110, 170, 40);
    	    			
    	    			
	u.addActionListener(new ActionListener() {
    	    				
    	    				@Override
    	    				public void actionPerformed(ActionEvent e) {
    	    					// TODO Auto-generated method stub
    	    					
    	    				
    	    					JFrame frame2 =new JFrame("Bandarban");
    	    					frame2.setSize(600,650);
    	    					JPanel panel3=new JPanel();	
    	    					
    	    					JPanel contentPane = new JPanel();
    	    					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    	    					frame2.setContentPane(contentPane);
    	    					contentPane.setLayout(null);
    	    					
    	    					JPanel panel = new JPanel();
    	    					panel.setBounds(0, 0, 484, 344);
    	    					contentPane.add(panel);
    	    					panel.setLayout(null);
    	    					
    	    					
    	    					JTextPane textPane = new JTextPane();
    	    					textPane.setBounds(50, 48, 300, 500);
    	    					panel.add(textPane);
    	    					
    	    					JLabel lblLalbagKella = new JLabel("bandorban");
    	    					lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
    	    					lblLalbagKella.setBounds(206, 11, 120, 21);
    	    					panel.add(lblLalbagKella);
    	    					
    	    					JLabel label = new JLabel("");
    	    					label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Chittagong Zone\\Bandarban\\Bandarban-02_3.jpg"));//eikane tor pic er path hobe
    	    					label.setBounds(350, 48, 183, 155);
    	    					panel.add(label);
    	    					//*******ata textpan a text set kore ***********
    	    					fileRead f=new fileRead();
    	    					textPane.setText(f.read2());
    	    					//**********************************************
    	    	
    	    	    			
    	    					
    	    					frame2.add(panel3);
    	    					frame2.setVisible(true);
    	    				}
    	    			});
    					
    			
    					
    					frame2.add(panel3);
    					frame2.setVisible(true);
    				}
    			});
JButton button2 = new JButton("RAJSHAHI ZONE");
frame2.getContentPane().add(button2);
button2.setBounds(300, 150, 170, 40);
    			
button2.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		JFrame frame2 =new JFrame("RAJSHAHI ZONE");
		frame2.setSize(800,450);
		JPanel panel3=new JPanel();	
		
		
		panel3.setBackground(Color.LIGHT_GRAY);


	
		
		JLabel lblNewLabel = new JLabel("RAJSHAHI ZONE>>>");
		lblNewLabel.setBounds(300, 10, 170, 30);
		frame2.getContentPane().add(lblNewLabel);

		JButton v = new JButton("Paharpur Buddhist Monastery");
		frame2.getContentPane().add(v); 
		v.setBounds(300, 60, 170, 40);
		
		v.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			
				JFrame frame2 =new JFrame("Paharpur Buddhist Monastery");
				frame2.setSize(600,650);
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//setBounds(100, 100, 500, 383);
				JPanel contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				frame2.setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 484, 344);
				contentPane.add(panel);
				panel.setLayout(null);
				
				
				JTextPane textPane = new JTextPane();
				textPane.setBounds(50, 48, 300, 500);
				panel.add(textPane);
				
				JLabel lblLalbagKella = new JLabel("Paharpur Buddhist Monastery");
				lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
				lblLalbagKella.setBounds(206, 11, 120, 21);
				panel.add(lblLalbagKella);
				
				JLabel label = new JLabel("Paharpur Buddhist Monastery");
				label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Rajshahi Zone\\Paharpur Buddhist Monastery\\big_76.jpg"));//eikane tor pic er path hobe
				label.setBounds(350, 48, 183, 155);
				panel.add(label);
				//*******ata textpan a text set kore ***********
				fileRead f=new fileRead();
				textPane.setText(f.read11());
				//*******************************************
				

    			
				
				//frame2.add(panel3);
				frame2.setVisible(true);
			}
		});
		
		JButton w = new JButton("Choto Sona Mosque");
		frame2.getContentPane().add(w);
		w.setBounds(300, 110, 170, 40);
		
		
		
		w.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			
				JFrame frame2 =new JFrame("Choto Sona Mosque");
				frame2.setSize(600,650);
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//setBounds(100, 100, 500, 383);
				JPanel contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				frame2.setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 484, 344);
				contentPane.add(panel);
				panel.setLayout(null);
				
				
				JTextPane textPane = new JTextPane();
				textPane.setBounds(50, 48, 300, 500);
				panel.add(textPane);
				
				JLabel lblLalbagKella = new JLabel("Choto Sona Mosque");
				lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
				lblLalbagKella.setBounds(206, 11, 120, 21);
				panel.add(lblLalbagKella);
				
				JLabel label = new JLabel("Choto Sona Mosque");
				label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Rajshahi Zone\\Choto Sona Mosque\\wu.jpg"));//eikane tor pic er path hobe
				label.setBounds(350, 48, 183, 155);
				panel.add(label);
				//*******ata textpan a text set kore ***********
				fileRead f=new fileRead();
				textPane.setText(f.read10());
				//*******************************************
				

    			
				
			//	frame2.add(panel3);
				frame2.setVisible(true);
			}
		});
		

		
		frame2.add(panel3);
		frame2.setVisible(true);
	}
});
JButton button3 = new JButton("SYLHET ZONE");
frame2.getContentPane().add(button3);
button3.setBounds(300, 200, 170, 40);
    	            
button3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		JFrame frame2 =new JFrame("SYLHET ZONE");
		frame2.setSize(800,450);
		JPanel panel3=new JPanel();	
		
		
		panel3.setBackground(Color.LIGHT_GRAY);


	
		JLabel lblNewLabel = new JLabel("SYLHET ZONE>>>");
		lblNewLabel.setBounds(300, 10, 170, 30);
		frame2.getContentPane().add(lblNewLabel);

		JButton x = new JButton("Srimongol");
		frame2.getContentPane().add(x); 
		x.setBounds(300, 60, 170, 40);
		
		
		
		x.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			
				JFrame frame2 =new JFrame("Srimongol");
				frame2.setSize(600,650);
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//setBounds(100, 100, 500, 383);
				JPanel contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				frame2.setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 484, 344);
				contentPane.add(panel);
				panel.setLayout(null);
				
				
				JTextPane textPane = new JTextPane();
				textPane.setBounds(50, 48, 300, 500);
				panel.add(textPane);
				
				JLabel lblLalbagKella = new JLabel("Srimongol");
				lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
				lblLalbagKella.setBounds(206, 11, 120, 21);
				panel.add(lblLalbagKella);
				
				JLabel label = new JLabel("Srimongol");
				label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Sylhet Zone\\Srimongol\\big_87.jpg"));//eikane tor pic er path hobe
				label.setBounds(350, 48, 183, 155);
				panel.add(label);
				//*******ata textpan a text set kore ***********
				fileRead f=new fileRead();
				textPane.setText(f.read9());
				//*******************************************
				

    			
				
			//	frame2.add(panel3);
				frame2.setVisible(true);
			}
		});
		JButton y = new JButton("Jaflong");
		frame2.getContentPane().add(y);
		y.setBounds(300, 110, 170, 40);
		

		y.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			
				JFrame frame2 =new JFrame("Jaflong");
				frame2.setSize(600,650);
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//setBounds(100, 100, 500, 383);
				JPanel contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				frame2.setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 484, 344);
				contentPane.add(panel);
				panel.setLayout(null);
				
				
				JTextPane textPane = new JTextPane();
				textPane.setBounds(50, 48, 300, 500);
				panel.add(textPane);
				
				JLabel lblLalbagKella = new JLabel("Jaflong");
				lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
				lblLalbagKella.setBounds(206, 11, 120, 21);
				panel.add(lblLalbagKella);
				
				JLabel label = new JLabel("Jaflong");
				label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Sylhet Zone\\Jaflong\\Sylhet-Stone-collection-Jaflong.jpg"));//eikane tor pic er path hobe
				label.setBounds(350, 48, 183, 155);
				panel.add(label);
				//*******ata textpan a text set kore ***********
				fileRead f=new fileRead();
				textPane.setText(f.read8());
				//*******************************************

    			
				
				//frame2.add(panel3);
				frame2.setVisible(true);
			}
		});
		
		
		frame2.add(panel3);
		frame2.setVisible(true);
	}
});
    	          

    	    		JButton button5 = new JButton("KHULNA ZONE");
    	    		frame2.getContentPane().add(button5);
    	    		button5.setBounds(300, 250, 170, 40);
    	    		button5.addActionListener(new ActionListener() {
    	    			
    	    			@Override
    	    			public void actionPerformed(ActionEvent e) {
    	    				// TODO Auto-generated method stub
    	    				
    	    			
    	    				JFrame frame2 =new JFrame("KHULNA ZONE");
    	    				frame2.setSize(800,450);
    	    				JPanel panel3=new JPanel();	
    	    				
    	    				
    	    				panel3.setBackground(Color.LIGHT_GRAY);


    	    			
    	    				JLabel lblNewLabel = new JLabel("KHULNA ZONE >>>");
        	    			lblNewLabel.setBounds(300, 10, 170, 30);
        	    			frame2.getContentPane().add(lblNewLabel);
        	    			
        	    			
        	    		

        					JButton b = new JButton("Shilaidaha Kuthibari");
        	    			frame2.getContentPane().add(b); 
        	    			b.setBounds(300, 60, 170, 40);
        	    			
        	    			
        	    			b.addActionListener(new ActionListener() {
        	    				
        	    				@Override
        	    				public void actionPerformed(ActionEvent e) {
        	    					// TODO Auto-generated method stub
        	    					
        	    				
        	    					JFrame frame2 =new JFrame("Shilaidaha Kuthibari");
        	    					frame2.setSize(600,650);
        	    					//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	    					//setBounds(100, 100, 500, 383);
        	    					JPanel contentPane = new JPanel();
        	    					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        	    					frame2.setContentPane(contentPane);
        	    					contentPane.setLayout(null);
        	    					
        	    					JPanel panel = new JPanel();
        	    					panel.setBounds(0, 0, 484, 344);
        	    					contentPane.add(panel);
        	    					panel.setLayout(null);
        	    					
        	    					
        	    					JTextPane textPane = new JTextPane();
        	    					textPane.setBounds(50, 48, 300, 500);
        	    					panel.add(textPane);
        	    					
        	    					JLabel lblLalbagKella = new JLabel("Shilaidaha Kuthibari");
        	    					lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
        	    					lblLalbagKella.setBounds(206, 11, 120, 21);
        	    					panel.add(lblLalbagKella);
        	    					
        	    					JLabel label = new JLabel("");
        	    					label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Khulna Zone\\Shilaidaha Kuthibari\\shilaidaha-kuthibari.jpg"));//eikane tor pic er path hobe
        	    					label.setBounds(350, 48, 183, 155);
        	    					panel.add(label);
        	    					//*******ata textpan a text set kore ***********
        	    					fileRead f=new fileRead();
        	    					textPane.setText(f.read7());
        	    					//*******************************************
        	    					
        	    	
        	    	    			
        	    					
        	    				//	frame2.add(panel3);
        	    					frame2.setVisible(true);
        	    				}
        	    			});
        	    			JButton c = new JButton("Shat Gambuj Mosque");
        	    			frame2.getContentPane().add(c);
        	    			c.setBounds(300, 110, 170, 40);
    	    				
        	    			c.addActionListener(new ActionListener() {
        	    				
        	    				@Override
        	    				public void actionPerformed(ActionEvent e) {
        	    					// TODO Auto-generated method stub
        	    					
        	    				
        	    					JFrame frame2 =new JFrame("Shat Gambuj Mosque");
        	    					frame2.setSize(600,650);
        	    					//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	    					//setBounds(100, 100, 500, 383);
        	    					JPanel contentPane = new JPanel();
        	    					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        	    					frame2.setContentPane(contentPane);
        	    					contentPane.setLayout(null);
        	    					
        	    					JPanel panel = new JPanel();
        	    					panel.setBounds(0, 0, 484, 344);
        	    					contentPane.add(panel);
        	    					panel.setLayout(null);
        	    					
        	    					
        	    					JTextPane textPane = new JTextPane();
        	    					textPane.setBounds(50, 48, 300, 500);
        	    					panel.add(textPane);
        	    					
        	    					JLabel lblLalbagKella = new JLabel("Shat Gambuj Mosque");
        	    					lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
        	    					lblLalbagKella.setBounds(206, 11, 120, 21);
        	    					panel.add(lblLalbagKella);
        	    					
        	    					JLabel label = new JLabel("");
        	    					label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Khulna Zone\\Shat Gambuj Mosque\\big_67.jpg"));//eikane tor pic er path hobe
        	    					label.setBounds(350, 48, 183, 155);
        	    					panel.add(label);
        	    					//*******ata textpan a text set kore ***********
        	    					fileRead f=new fileRead();
        	    					textPane.setText(f.read6());
        	    					//*******************************************
        	    					
        	    					
        	    	
        	    	    			
        	    					
        	    					//frame2.add(panel3);
        	    					frame2.setVisible(true);
        	    				}
        	    			});

    	    				
    	    				frame2.add(panel3);
    	    				frame2.setVisible(true);
    	    			}
    	    		});
//    	    		    
    	    		JButton button6 = new JButton("BARISHAL ZONE");
    	    		frame2.getContentPane().add(button6);
    	    		button6.setBounds(300, 300, 170, 40);
    	    		
    	    		button6.addActionListener(new ActionListener() {
    	    			
    	    			@Override
    	    			public void actionPerformed(ActionEvent e) {
    	    				// TODO Auto-generated method stub
    	    				
    	    			
    	    				JFrame frame2 =new JFrame("BARISHAL ZONE");
    	    				frame2.setSize(800,450);
    	    				JPanel panel3=new JPanel();	
    	    				
    	    				panel3.setBackground(Color.LIGHT_GRAY);

    	    				

    	    				JLabel lblNewLabel = new JLabel("BARISHAL ZONE>>>");
        	    			lblNewLabel.setBounds(300, 10, 170, 30);
        	    			frame2.getContentPane().add(lblNewLabel);

        					JButton d = new JButton("Kuakata");
        	    			frame2.getContentPane().add(d); 
        	    			d.setBounds(300, 60, 170, 40);
        	    			
        	    			d.addActionListener(new ActionListener() {
        	    				
        	    				@Override
        	    				public void actionPerformed(ActionEvent e) {
        	    					// TODO Auto-generated method stub
        	    					
        	    				
        	    					JFrame frame2 =new JFrame("Kuakata");
        	    					frame2.setSize(600,650);
        	    					//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	    					//setBounds(100, 100, 500, 383);
        	    					JPanel contentPane = new JPanel();
        	    					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        	    					frame2.setContentPane(contentPane);
        	    					contentPane.setLayout(null);
        	    					
        	    					JPanel panel = new JPanel();
        	    					panel.setBounds(0, 0, 484, 344);
        	    					contentPane.add(panel);
        	    					panel.setLayout(null);
        	    					
        	    					
        	    					JTextPane textPane = new JTextPane();
        	    					textPane.setBounds(50, 48, 300, 500);
        	    					panel.add(textPane);
        	    					
        	    					JLabel lblLalbagKella = new JLabel("Kuakata");
        	    					lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
        	    					lblLalbagKella.setBounds(206, 11, 120, 21);
        	    					panel.add(lblLalbagKella);
        	    					
        	    					JLabel label = new JLabel("");
        	    					label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Barisal Zone\\Kuakata\\big_36.jpg"));//eikane tor pic er path hobe
        	    					label.setBounds(350, 48, 183, 155);
        	    					panel.add(label);
        	    					//*******ata textpan a text set kore ***********
        	    					fileRead f=new fileRead();
        	    					textPane.setText(f.read5());
        	    					//*******************************************
        	    					
        	    	
        	    	    			
        	    					
        	    					//frame2.add(panel3);
        	    					frame2.setVisible(true);
        	    				}
        	    			});
        	    			JButton e1 = new JButton("Bishkhali River");
        	    			frame2.getContentPane().add(e1);
        	    			e1.setBounds(300, 110, 170, 40);
    	    				
    	    				
        	    			e1.addActionListener(new ActionListener() {
        	    				
        	    				@Override
        	    				public void actionPerformed(ActionEvent e) {
        	    					// TODO Auto-generated method stub
        	    					
        	    				
        	    					JFrame frame2 =new JFrame("Bishkhali River");
        	    					frame2.setSize(600,650);
        	    					//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	    					//setBounds(100, 100, 500, 383);
        	    					JPanel contentPane = new JPanel();
        	    					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        	    					frame2.setContentPane(contentPane);
        	    					contentPane.setLayout(null);
        	    					
        	    					JPanel panel = new JPanel();
        	    					panel.setBounds(0, 0, 484, 344);
        	    					contentPane.add(panel);
        	    					panel.setLayout(null);
        	    					
        	    					
        	    					JTextPane textPane = new JTextPane();
        	    					textPane.setBounds(50, 48, 300, 500);
        	    					panel.add(textPane);
        	    					
        	    					JLabel lblLalbagKella = new JLabel("Bishkhali River");
        	    					lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
        	    					lblLalbagKella.setBounds(206, 11, 120, 21);
        	    					panel.add(lblLalbagKella);
        	    					
        	    					JLabel label = new JLabel("");
        	    					label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Barisal Zone\\Bishkhali River\\bish.jpg"));//eikane tor pic er path hobe
        	    					label.setBounds(350, 48, 183, 155);
        	    					panel.add(label);
        	    					//*******ata textpan a text set kore ***********
        	    					fileRead f=new fileRead();
        	    					textPane.setText(f.read13());
        	    					//*******************************************
        	    					
        	    	
        	    	    			
        	    					
        	    					//frame2.add(panel3);
        	    					
        	    	
        	    	    			
        	    					
        	    				//	frame2.add(panel3);
        	    					frame2.setVisible(true);
        	    				}
        	    			});

    	    				
    	    				frame2.add(panel3);
    	    				frame2.setVisible(true);
    	    			}
    	    		});
    	    		    
    	    		JButton button7 = new JButton("RANGPUR ZONE");
    	    		frame2.getContentPane().add(button7);
    	    		button7.setBounds(300, 350, 170, 40);
    	    		button7.addActionListener(new ActionListener() {
    	    			
    	    			@Override
    	    			public void actionPerformed(ActionEvent e) {
    	    				// TODO Auto-generated method stub
    	    				
    	    			
    	    				JFrame frame2 =new JFrame("RANGPUR ZONE");
    	    				frame2.setSize(800,450);
    	    				JPanel panel3=new JPanel();	
    	    				
    	    				
    	    				panel3.setBackground(Color.LIGHT_GRAY);


    	    				JLabel lblNewLabel = new JLabel("RANGPUR ZONE>>>");
        	    			lblNewLabel.setBounds(300, 10, 170, 30);
        	    			frame2.getContentPane().add(lblNewLabel);

        					JButton f = new JButton("Dinajpur Rajbari");
        	    			frame2.getContentPane().add(f); 
        	    			f.setBounds(300, 60, 170, 40);
        	    			
        	    			f.addActionListener(new ActionListener() {
        	    				
        	    				@Override
        	    				public void actionPerformed(ActionEvent e) {
        	    					// TODO Auto-generated method stub
        	    					
        	    				
        	    					JFrame frame2 =new JFrame("Dinajpur Rajbari");
        	    					frame2.setSize(600,650);
        	    					//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	    					//setBounds(100, 100, 500, 383);
        	    					JPanel contentPane = new JPanel();
        	    					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        	    					frame2.setContentPane(contentPane);
        	    					contentPane.setLayout(null);
        	    					
        	    					JPanel panel = new JPanel();
        	    					panel.setBounds(0, 0, 484, 344);
        	    					contentPane.add(panel);
        	    					panel.setLayout(null);
        	    					
        	    					
        	    					JTextPane textPane = new JTextPane();
        	    					textPane.setBounds(50, 48, 300, 500);
        	    					panel.add(textPane);
        	    					
        	    					JLabel lblLalbagKella = new JLabel("Dinajpur Rajbari");
        	    					lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
        	    					lblLalbagKella.setBounds(206, 11, 120, 21);
        	    					panel.add(lblLalbagKella);
        	    					
        	    					JLabel label = new JLabel("");
        	    					label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Rangpur Zone\\Dinajpur Rajbari\\s.JPG"));//eikane tor pic er path hobe
        	    					label.setBounds(350, 48, 183, 155);
        	    					panel.add(label);
        	    					//*******ata textpan a text set kore ***********
        	    					fileRead f=new fileRead();
        	    					textPane.setText(f.read3());
        	    					//*******************************************
        	    					
        	    	
        	    	    			
        	    					
        	    					//frame2.add(panel3);
        	    					frame2.setVisible(true);
        	    				}
        	    			});
        	    			JButton g = new JButton("Shopnopuri");
        	    			frame2.getContentPane().add(g);
        	    			g.setBounds(300, 110, 170, 40);
        	    			g.addActionListener(new ActionListener() {
        	    				
        	    				@Override
        	    				public void actionPerformed(ActionEvent e) {
        	    					// TODO Auto-generated method stub
        	    					
        	    				
        	    					JFrame frame2 =new JFrame("Shopnopuri");
        	    					frame2.setSize(600,650);
        	    					//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	    					//setBounds(100, 100, 500, 383);
        	    					JPanel contentPane = new JPanel();
        	    					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        	    					frame2.setContentPane(contentPane);
        	    					contentPane.setLayout(null);
        	    					
        	    					JPanel panel = new JPanel();
        	    					panel.setBounds(0, 0, 484, 344);
        	    					contentPane.add(panel);
        	    					panel.setLayout(null);
        	    					
        	    					
        	    					JTextPane textPane = new JTextPane();
        	    					textPane.setBounds(50, 48, 300, 500);
        	    					panel.add(textPane);
        	    					
        	    					JLabel lblLalbagKella = new JLabel("Shopnopuri");
        	    					lblLalbagKella.setFont(new Font("Tahoma", Font.PLAIN, 17));
        	    					lblLalbagKella.setBounds(206, 11, 120, 21);
        	    					panel.add(lblLalbagKella);
        	    					
        	    					JLabel label = new JLabel("");
        	    					label.setIcon(new ImageIcon("D:\\workshop\\Bangladesh Tourism#\\New folder\\Rangpur Zone\\Shopnopuri\\E.JPG"));//eikane tor pic er path hobe
        	    					label.setBounds(350, 48, 183, 155);
        	    					panel.add(label);
        	    					//*******ata textpan a text set kore ***********
        	    					fileRead f=new fileRead();
        	    					textPane.setText(f.read4());
        	    					//*******************************************
        	    	
        	    	    			
        	    					
        	    				//	frame2.add(panel3);
        	    					frame2.setVisible(true);
        	    				}
        	    			});
    	    				
    	    				

    	    				
    	    				frame2.add(panel3);
    	    				frame2.setVisible(true);
    	    			}
    	    		});
    	    		    
		
    			
    		
    			
    			frame2.add(panel3);
    			frame2.setVisible(true);
    		}
    	});
    	
    } 
}