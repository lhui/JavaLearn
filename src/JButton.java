/**
* 
* @author LiHui
* @version Create Time:Apr 27, 2018 8:58:12 AM
* @version 0.01
* @Instruction  Instruction
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;;
class Btn extends Frame{
	 Button btn =new Button("I am a button");
	    Btn() {
		
		// TODO Auto-generated constructor stub
		setSize(300,200);
		setVisible(true);
	
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
