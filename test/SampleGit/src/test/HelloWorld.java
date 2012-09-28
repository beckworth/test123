package test;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class HelloWorld extends JFrame {

	public HelloWorld() throws HeadlessException {
		super();
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new HelloWorld();

	}

	/**
	 * @param args
	 */
	public static void maintest(String[] args) {
		// TODO Auto-generated method stub

		HelloWorld h1 = new HelloWorld();
		HelloWorld h2 = new HelloWorld();

		// don in local master
		HelloWorld h3 = new HelloWorld();

	}

}
