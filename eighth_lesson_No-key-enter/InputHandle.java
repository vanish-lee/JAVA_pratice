import javax.swing.*;
public class InputHandle {
	private static final String BLANK="";
	private String name;
	private String room;
	private String pwd;
	
	public InputHandle() {
		name = BLANK;
		room = BLANK;
		pwd = BLANK;
	}
	public void getInput() {
		name = JOptionPane.showInputDialog(null, "Enter Name:");
		room = JOptionPane.showInputDialog(null, "Enter Name No.:");
		pwd = JOptionPane.showInputDialog(null, "Enter Password:");
	}
	public String getName() {
		return name;
	}
	public String getRoom() {
		return room;
	}
	public String getPassWord() {
		return pwd;
	}
}
