
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    public Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image); 
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new GuiEx4();     
        new Login().setVisible(true);;
    }
}

class GuiEx4 extends JFrame{
	
	GuiEx4() {
		// TODO Auto-generated constructor stub
		ImageIcon ic=new ImageIcon("../../icons/login.jpeg");
		JPanel jp=new JPanel();
		jp.setLayout(new BorderLayout());
		JLabel lb=new JLabel(ic);
//		lb.setIcon(ic);
		jp.add(lb, BorderLayout.CENTER);
		
		JProgressBar pb=new JProgressBar();
		pb.setStringPainted(true);
		pb.setMaximum(0);
		pb.setMaximum(100);
		jp.add(pb, BorderLayout.SOUTH);
		
		add(jp);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setContentPane(jp);
	    setLocation(200,300);
	    setVisible(true);
	    
		setSize(400,300);
		
		for(int i=0; i<=1000; i++){
			pb.setValue(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == 100) {
				setVisible(false);
                                this.dispose();
                                new Login();
                                
				//call the class here which you want to show
			}
		}
		
	}
	
//	public static void main(String args[]) {
//		new GuiEx4();
//	}
}

