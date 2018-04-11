import javax.swing.*;
import java.io.*;
public class SampleCreateResidentFile {
	public static void main(String[] args)throws IOException{
		Resident res;
		Dorm manager = new Drom();
		res = new Resident("john","1-101","3457");
		manager.add(res);
		
		res = new Resident("java","1-102","4588");
		manager.add(res);
		
		res = new Resident("jill","3-232","8898");
		manager.add(res);
		
		res = new Resident("jack","3-232","8008");
		manager.add(res);
		String filaname = JOptionPane.showInputDialog(null, "Save to which file:");
		manager.saveFile(filename);
		System.exit(0);
	}
}
