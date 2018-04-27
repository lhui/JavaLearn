/**
* 
* @author LiHui
* @version Create Time:Apr 27, 2018 3:49:14 PM
* @version 0.01
* @Instruction  Instruction
*/
import java.awt.*;
public class login extends Frame {
	public login() {
		super("User Login");
		this.setSize(200, 130);
		this.setLocation(300, 240);
		this.setBackground(Color.lightGray);
		this.setLayout(new FlowLayout());
		//add some label and button and textField
		this.add(new Label("userid"));
		this.add(new TextField("user1",10));
		this.add(new Label("password"));
		this.add(new TextField(10));
		this.add(new Button("OK"));
		this.add(new  Button("Cancel"));
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new login();
	}

}
