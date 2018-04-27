/**
* 
* @author LiHui
* @version Create Time:Apr 27, 2018 4:09:23 PM
* @version 0.01
* @Instruction  Instruction
*/
import java.awt.*;
import java.awt.event.*;

import javax.management.Query;
public class Unicode extends Frame implements ActionListener{
	 private TextField text_char,text_uni;
	 private  Button button_char,button_uni;
	 public Unicode(){
		 super("Unicode字符查询器");
		 this.setBounds(300, 240, 280, 90);
		 this.setBackground(Color.lightGray);
		 this.setLayout(new GridLayout(2, 3,2,2));//set GridLayout  2	3 2	 
		 this.add(new Label("字符",Label.RIGHT));
		 text_char=new TextField("汉字",10);
		 this.add(text_char);
		 button_char=new Button("查询Unicode码");
		 this.add(button_char);
		 button_char.addActionListener(this);//委托当前事件
		 this.add(new Label("Unicode编码"),Label.RIGHT);
		 text_uni= new TextField(10);
		 this.add(text_uni);
		 button_uni=new Button("查询字符");
		 this.add(button_uni);
		 button_uni.addActionListener(this);
		 this.addWindowListener(new WinClose());
		 this.setVisible(true);
	 }

	

	@Override
	public void actionPerformed(ActionEvent ev) {
		// TODO Auto-generated method stub
		if(ev.getSource()==button_char)
		{
			String str =text_char.getText();
			if(str.equals(""))
				return;
			char ch=str.charAt(0);
			text_char.setText(""+ch);
			text_uni.setText(""+(int)ch);
		}
		else if(ev.getSource()==button_uni)
		{
			String str=text_uni.getText();
			if(str.equals(""))
				return;
			int uni=Integer.parseInt(str);
			text_char.setText(""+(char)uni);	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Unicode();
	}
	class WinClose implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
