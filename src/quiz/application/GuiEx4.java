import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class GuiEx4 extends JFrame{
	
	public GuiEx4() {
		// TODO Auto-generated constructor stub
		ImageIcon ic=new ImageIcon("D:\\SW Lecturer\\1st Subject Summer Semester OOP\\Eclipse Data\\E Workspace\\MyProj\\src\\4.jpg");
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
                                new Login().setVisible(true);
                                this.dispose();
                                
				//call the class here which you want to show
			}
		}
		
	}
	
//	public static void main(String args[]) {
//		new GuiEx4();
//	}
}
