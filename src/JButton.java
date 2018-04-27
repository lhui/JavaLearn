/**
* 
* @author LiHui
* @version Create Time:Apr 27, 2018 8:58:12 AM
* @version 0.01
* @Instruction  Instruction
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;;
class Btn extends JFrame{
	 JButton btn =new JButton();
	 Btn() {
		
		// TODO Auto-generated constructor stub
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(btn);
		validate();//设置窗体组建可见
		
	}
}
public class JButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Btn btn =new Btn();
	}

}
