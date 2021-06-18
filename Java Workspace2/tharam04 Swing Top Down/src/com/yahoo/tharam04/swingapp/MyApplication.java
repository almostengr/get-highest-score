package com.yahoo.tharam04.swingapp;

import javax.swing.SwingUtilities;

public class MyApplication {
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MyGui();
			}
		});
	}
}
