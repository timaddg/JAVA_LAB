package practice_4;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;

public class cart  extends JFrame implements ActionListener{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JFrame cart;
Integer[] discount= {0,10,15,20};
JButton go,check,pay;
JTextArea name,ph,tot,iname;
JTextField id,quantity;
HashMap<Long,String> hm =new HashMap<Long,String>();
ArrayList<item> itemlist=new ArrayList<item>();
String user="abc";
String pass="xyz";
double price;
JTextField phno,itemid,quant;
public cart(){
	super("cart");
	cart=new JFrame("items");
	while(true){
		String u=JOptionPane.showInputDialog(this,"Enter username:","Log in",JOptionPane.INFORMATION_MESSAGE);
		if(u.equals(user)) {
			String p=JOptionPane.showInputDialog(this,"Enter Password:","Log in",JOptionPane.INFORMATION_MESSAGE);
			if(p.equals(pass))
				break;
			JOptionPane.showMessageDialog(this, "Invalid password"
					,"Error",JOptionPane.ERROR_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(this, "Invalid username",
					"Error",JOptionPane.ERROR_MESSAGE);
	}
	itemlist.add(new item("i01","Poster",299));
	itemlist.add(new item("i02","Wallclock",499));
	itemlist.add(new item("i03","Pop Figure",999));
	JLabel lphno=new JLabel("Enter customer phone number:");
	add(lphno);
	phno=new JTextField(10);
	add(phno);
	JLabel lname=new JLabel("Customer id:");
	JLabel lcphno=new JLabel("Ph. no.:");
	JLabel litemid=new JLabel("Enter Item id:");
	JLabel lquant=new JLabel("Enter quantity:");
	JLabel liname=new JLabel("Item name:");
	JLabel ltotprice=new JLabel("Total price:");
	name=new JTextArea(20, 5);
	ph=new JTextArea(20, 5);
	itemid=new JTextField(20);
	quant=new JTextField(20);
	iname=new JTextArea(20, 5);
	tot=new JTextArea(20, 5);
	go=new JButton("Go");
	go.addActionListener(this);
	add(go);
	check=new JButton("Check");
	pay=new JButton("Pay");
	check.addActionListener(this);
	pay.addActionListener(this);
	cart.add(lname);cart.add(name);
	cart.add(lcphno);cart.add(ph);
	cart.add(litemid);cart.add(itemid);
	cart.add(lquant);cart.add(quant);
	cart.add(liname);cart.add(iname);
	cart.add(ltotprice);cart.add(tot);
	cart.add(check);cart.add(pay);
	name.setEnabled(false);
	ph.setEnabled(false);
	iname.setEnabled(false);
	tot.setEnabled(false);
	pay.setEnabled(false);
	cart.setSize(1000,800);
	cart.setLayout(new GridLayout(4,2));
	
}
	public static void main(String[] args) {
		cart app=new cart();
		app.setVisible(true);
		app.setSize(600, 200);
		app.setLayout(new GridLayout(1,2));

	}
@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==go) {
			String cid;
			long num=Long.parseLong(phno.getText());
			if(!hm.containsKey(num)) {
				cid=JOptionPane.showInputDialog(this,"enter deatils :","i1",JOptionPane.INFORMATION_MESSAGE);
				hm.put(num,cid);
			}
			else
			{
				cid=hm.get(num);
				this.setVisible(false);
				name.setText(cid);
				ph.setText(num+" ");
				cart.setVisible(true);
			}
		}
		if(e.getSource()==check) {
			int q=Integer.parseInt(quant.getText());
			String iid=itemid.getText();
			boolean flag=false;
			item i=null;
			
			for(item x:itemlist) {
				if(x.id.equals(iid)) {
					i=x;
					flag=true;
					break;
				}
				
			}
			if(flag) {
				iname.setText(i.name);
				price=(q*i.cost);
				tot.setText(" price is \n "+price);
				pay.setEnabled(true);
			}
			else {
				iname.setText("wrong name :");
				tot.setText("invalid");
				pay.setEnabled(false);
			}
		}
		if(e.getSource()==pay) {
		int d1=	JOptionPane.showOptionDialog(cart,"enter discount","disc",0,JOptionPane.INFORMATION_MESSAGE,null,discount,discount[0]);
			JOptionPane.showMessageDialog(cart, "amount is :"+(price-(price*discount[d1])/100),"amt",JOptionPane.INFORMATION_MESSAGE);
			cart.setVisible(false);
			this.setVisible(true);
		}
		
		
	}


}













