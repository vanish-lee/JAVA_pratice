# -*- coding: utf-8 -*-
""
Spyder Editor 
@author vanish
This is a temporary script file.
""
import javax.swing.*;
import java.io.*;

public class Ch8EntranceMonitor {
	private Dorm manager;
	private InputHandle input;
	private Door door;
	public Ch8EntranceMonitor() {
		manager = new Dorm();
		input = new InputHandle();
		door = new Door();
	}
	public static void main(String[] args) {
		Ch8EntranceMonitor sentry = new Ch8EntranceMonitor();
		sentry.start();
	}
	public void start() {
		manager.openfile();
		String roster = manager.getResidentList();
		System.out.println(roster);
		processInputData();
	}
	public void openFile() {
		String filename;
		while(true) {
			filename=JOptionPane.showInputDialog(null,"File to open:");
			if(filename == null) {
				System.exit(0);
			}
			try {
				manager.openFile(filename);
				return;
			}catch(FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "No such file");
			}catch(IOException e) {
				JOptionPane.showMessageDialog(null,"Error in reading file");
			}
		}
	}
	private void processInputData() {
		String name,room,pwd;
		while(true) {
		name = input.getName();
		room = input.getRoom();
		pwd = input.getPassWord();
		
		validate(name,room,pwd);
	}
	}
	private void validate(String name,String room,String password) {
		Resident res = manager.getResident(name);
		if(res==null) {
			JOptionPane.showMessageDialog(null, "Invalid Entry:");
		}else if(res.getName().equals(name)&&res.getRoom().equals(room)&&res.getPassword().equals(password)) {
			door.open();
		}else {
			JOptionPane.showMessageDialog(null, "Invalid Entry");
		}
	}
}
