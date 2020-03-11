package practice_3;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class student extends JFrame implements ActionListener{

	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JFrame jf,jt;
JTextField n;
JTextField a;
JTextField ad;
JTextField u;
JTextField s1,s2,s3,s4,s5,s6,s7,s8;
JLabel n1,a1,ad1,u1,sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
JButton comp,done,disp;
JTextArea print;
static ArrayList<marks> ar=new ArrayList<marks>();
float cgpa;
static marks ob=null;
public student() {
	jf=new JFrame("student");
	jt=new JFrame("student2");
	n=new JTextField(20);
	a=new JTextField(20);
	ad=new JTextField(20);
	u=new JTextField(20);
	s1=new JTextField(20);
	s2=new JTextField(20);
	s3=new JTextField(20);
	s4=new JTextField(20);
	s5=new JTextField(20);
	s6=new JTextField(20);
	s7=new JTextField(20);
	s8=new JTextField(20);
	n1=new JLabel(" enter name ");
	a1=new JLabel(" enter age ");
	u1=new JLabel(" enter usn ");
	ad1=new JLabel(" enter address ");
	sem1=new JLabel(" enter sem1 marks ");
	sem2=new JLabel(" enter sem2 marks ");
	sem3=new JLabel(" enter sem3 marks ");
	sem4=new JLabel(" enter sem4 marks ");
	sem5=new JLabel(" enter sem5 marks ");
	sem6=new JLabel(" enter sem6 marks ");
	sem7=new JLabel(" enter sem7 marks ");
	sem8=new JLabel(" enter sem8 marks ");
	comp=new JButton("compute");
	done=new JButton("done");
	disp=new JButton("display");
	print=new JTextArea();
	
	jf.add(n1);
	jf.add(n);
	
	jf.add(a1);
	jf.add(a);
	
	jf.add(ad1);
	jf.add(ad);
	
	jf.add(u1);
	jf.add(u);
	
	jf.add(sem1);
	jf.add(s1);
	
	jf.add(sem2);
	jf.add(s2);
	
	jf.add(sem3);
	jf.add(s3);
	
	
	jf.add(sem4);
	jf.add(s4);
	
	jf.add(sem5);
	jf.add(s5);
	
	
	jf.add(sem6);
	jf.add(s6);
	
	jf.add(sem7);
	jf.add(s7);
	
	jf.add(sem8);
	jf.add(s8);
	
	jf.add(comp);
	jf.add(disp);
	jf.add(done);
	jf.add(print);
	comp.addActionListener(this);
	disp.addActionListener(this);
	done.addActionListener(this);
}

public static void main(String[] args) {
	student s=new student();
	s.jf.setVisible(true);
	s.jf.setLayout(new GridLayout(18,2));
	//s.jt.setVisible(true);
	s.setSize(700, 900);
	//s.jt.setSize(400, 600);
}
@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==comp) {	
	try {
			String nam=n.getText();
			int age=Integer.parseInt(a.getText());
			String usn=u.getText();
			String add=ad.getText();
			float m1=Float.parseFloat(s1.getText());
			float m2=Float.parseFloat(s2.getText());
			float m3=Float.parseFloat(s3.getText());
			float m4=Float.parseFloat(s4.getText());
			float m5=Float.parseFloat(s5.getText());
			float m6=Float.parseFloat(s6.getText());
			float m7=Float.parseFloat(s7.getText());
			float m8=Float.parseFloat(s8.getText());
			cgpa=(m1+m2+m3+m4+m5+m6+m7+m8)/8;
			print.setText(null);
			ob=new marks(nam,usn,add,age);
			
			print.insert(ob.toString()+" \n "+cgpa+"\n",0);
			done.setEnabled(true);
			
	}
		catch(NumberFormatException e1) {
			JOptionPane.showMessageDialog(jf,"invalid sgpa","error",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	else if(e.getSource()==done) {
		ar.add(ob);
		done.setEnabled(true);
	}
	else if(e.getSource()==disp) {
		if(ar.isEmpty()) {
			print.insert("list is empty \n ", 0);
		}
		else {
			print.insert("details are \n", 0);
			for(marks m:ar) {
				print.append(m+"\n");
			}
		}
	}
}

}
