package kode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class KodeMain extends JFrame{
	JButton btn, btn1, btn2, btn3;
	ImageIcon img, img1, img2, img3, img4, img5, img6;
	String txtPATH;
	File res;
public static void main(String[] args) {
	KodeMain main1 = new KodeMain();
}
public KodeMain() {
	//Load Resource
	java.net.URL url = this.getClass().getClassLoader().getResource("res/welcome.png".toString());
	java.net.URL url1 = this.getClass().getClassLoader().getResource("res/Kode.png".toString());
	java.net.URL url2 = this.getClass().getClassLoader().getResource("res/picture.png".toString());
	java.net.URL url3 = this.getClass().getClassLoader().getResource("res/wiki.png".toString());
	java.net.URL url4 = this.getClass().getClassLoader().getResource("res/cmd.png".toString());
	java.net.URL url5 = this.getClass().getClassLoader().getResource("res/home.png".toString());
	java.net.URL url6 = this.getClass().getClassLoader().getResource("res/logo.png".toString());
		if(url !=null) {
		img = new ImageIcon(url);
		img1 = new ImageIcon(url1);
		img2 = new ImageIcon(url2);
		img3 = new ImageIcon(url3);
		img4 = new ImageIcon(url4);
		img5 = new ImageIcon(url5);
		img6 = new ImageIcon(url6);
	}
	//Panel 
	//Main Panel
	JPanel panel = new JPanel(new BorderLayout());
	panel.setBackground(Color.white);
	//Panel for Buttons + Title
	JPanel panel0 = new JPanel();
	BoxLayout boxPanel0 = new BoxLayout(panel0, BoxLayout.PAGE_AXIS);
	panel0.setLayout(boxPanel0);
	panel0.setBackground(Color.black);
	JLabel lLogo = new JLabel(img6);
	panel0.add(lLogo);
	JPanel panel1 = new JPanel(new GridLayout(1,4, 20, 20));
	panel1.setBackground(Color.black);
	panel1.setBorder(BorderFactory.createLineBorder(Color.black));
	panel0.add(panel1);
	panel.add(panel0, BorderLayout.NORTH);
	//Panel 2 - Center Panel
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.white);
		BoxLayout layout = new BoxLayout(panel2, BoxLayout.Y_AXIS);
		panel2.setLayout(layout);
		//Welcome Scene
		JLabel label = new JLabel(img);
		panel2.add(label);
		JLabel label1 = new JLabel("<html>Yoo yoo, welcome to KodePas GUI Manager - KodeMan" + "<br>" + "A graphical controller for your KodePas" + "<br>" + "Let's find somethings you need ");
		label1.setFont(new Font("Open Sans", Font.ITALIC, 14));
		label1.setHorizontalAlignment(SwingConstants.LEFT);
		panel2.add(label1);
		// Type Path
		JLabel lb =new JLabel("<html>Please type the path to KodeMan resource folder (kodeman-res) for this session."+"<br>"+"You won't be able to use KodeMan if you leave this step, but you can set it later in Settings</html>");
		lb.setFont(new Font("Open Sans", Font.BOLD,14));
		panel2.add(lb);
		JTextField txt = new JTextField();
		txt.setMaximumSize(new Dimension(400,30));
		panel2.add(txt);
		JLabel labelPATH = new JLabel("Status: Path isn't set");
		labelPATH.setFont(new Font("Open Sans", Font.ITALIC, 14));
		panel2.add(labelPATH);
		Action act = new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtPATH = txt.getText();
				labelPATH.setText("Status: Path is set to " + txtPATH);
			}
		};
		txt.addActionListener(act);
	//Buttons
		//Buttons
	btn = new JButton("Kode Home");
	btn.setFont(new Font("Open Sans", Font.BOLD, 14));
	btn.setForeground(Color.white);
	btn.setFocusable(false);
	btn.setBackground(Color.black);
	btn.setBorder(null);
ActionListener listen = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// Reset UI
			panel2.removeAll();
			panel2.updateUI();
			panel2.setLayout(layout);
			// Set buttons
			btn3.setEnabled(true);
			btn2.setEnabled(true);
			btn1.setEnabled(true);
			btn.setEnabled(false);
			btn.setBorder(BorderFactory.createLineBorder(Color.black));
			btn1.setBorder(null);
			btn2.setBorder(null);
			btn3.setBorder(null);
			//Content
			panel2.add(new JLabel(img5));
			JLabel lbHOME = new JLabel("Find more about Kode Organization");
			lbHOME.setFont(new Font("Open Sans", Font.BOLD, 16));
			panel2.add(lbHOME);
			//Link to Kode
			JTextArea text = new JTextArea("- KodePas\nHomepage\nkodelang.dev/cli\nHomepage on GitHub\ngithub.com/kodestudio/kodepas\nBugs report\ngithub.com/kodestudio/kodepas/issues\n- KodeMan\nkodeman.cf");
			text.setMaximumSize(new Dimension(600,500));
			text.setFont(new Font("Open Sans", Font.TRUETYPE_FONT, 14));
			text.setEditable(false);
			panel2.add(text);
			// Visibility
			setVisible(true);
		}
	};
	btn.addActionListener(listen);
	panel1.add(btn);
	// Kode Command Button
	btn1= new JButton("KodePas command");
	btn1.setFont(new Font("Open Sans", Font.BOLD, 14));
	btn1.setForeground(Color.white);
	btn1.setFocusable(false);
	btn1.setBackground(Color.black);
	btn1.setBorder(null);
	ActionListener listen1 = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// Reset UI
			panel2.removeAll();
			panel2.updateUI();
			panel2.setLayout(layout);
			// Set Buttons
			btn3.setEnabled(true);
			btn2.setEnabled(true);
			btn1.setEnabled(false);
			btn.setEnabled(true);
			btn.setBorder(null);
			btn1.setBorder(BorderFactory.createLineBorder(Color.black));
			btn2.setBorder(null);
			btn3.setBorder(null);
			//Content
			panel2.add(new JLabel(img4));
			// Tools
			panel2.add(new JLabel("Dependencies require: ZIP tools (unzip, zip), Free Pascal (FPC), WGet (wget), Node JavaScript (nodejs), CURL (curl)." +"<br>"+"Windows version has some pre-installed apps"));
			// Execute Status
			JLabel lbSTATUS = new JLabel("KodePas command status");
			lbSTATUS.setFont(new Font("Open Sans", Font.BOLD, 14));
			JLabel lbSTATUS1 = new JLabel("");
			lbSTATUS1.setFont(new Font("Open Sans", Font.TRUETYPE_FONT, 14));
			//Setup
			JButton btna = new JButton("Setup");
			btna.setBackground(Color.white);
			btna.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//Setup Action
					res = new File(txtPATH + "/setup.bat".toString().trim());
					if(res.exists() && res.isFile()) {
					ProcessBuilder pb= new ProcessBuilder();
					java.util.List<String> cmd= new ArrayList<String>();
					cmd.add("cmd");
					cmd.add("/c");
					cmd.add("start");
					cmd.add("setup.bat");
					pb.directory(new File(txtPATH));
					pb.command(cmd);
					try {
						Process p =pb.start();
						//Finish Action
						StringBuilder sb = new StringBuilder();
						BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String line;
						while((line = br.readLine())!= null) {
							sb.append(line + "\n");
						}
						int exitVal = p.waitFor();
						if(exitVal == 0) {
							lbSTATUS1.setText("Process excuted");
							System.out.println(sb);
						}
						else {
							lbSTATUS1.setText("Process failed to excute");
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}
					else {
						lbSTATUS1.setText("File is missing");
					}
				}
			});
			//Build
			JButton btnc = new JButton("Build Project");
			btnc.setBackground(Color.white);
			btnc.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//Build Action
					res = new File(txtPATH + "/build.bat".toString().trim());
					if(res.exists() && res.isFile()) {
					ProcessBuilder pb =new ProcessBuilder();
					java.util.List<String> cmd = new ArrayList<String>();
					cmd.add("cmd.exe");
					cmd.add("/c");
					cmd.add("start");
					cmd.add("build.bat");
					pb.directory(new File(txtPATH));
					pb.command(cmd);
					try {
						Process p=pb.start();
						//Finish Action 
						StringBuilder sb = new StringBuilder();
						BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String line;
						while((line= br.readLine())!= null) {
							sb.append(line + "\n");
						}
						int exitVal = p.waitFor();
						if(exitVal == 0) {
							lbSTATUS1.setText("Process excuted ");
							System.out.println(sb);
				
						}else {
							lbSTATUS1.setText("Process failed to excute");
						}
						
					
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
					else{
						lbSTATUS1.setText("File is missing");
					}
				}
			});
			//Import
			JButton btnd = new JButton("Import files");
			btnd.setBackground(Color.white);
			btnd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// Button Action
					res = new File(txtPATH + "/import.bat".toString().trim());
					if (res.exists() && res.isFile()) {
					ProcessBuilder pb = new ProcessBuilder();
					List<String> cmd = new ArrayList<String>();
					cmd.add("cmd.exe");
					cmd.add("/c");
					cmd.add("start");
					cmd.add("import.bat");
					pb.directory(new File(txtPATH));
					pb.command(cmd);
					try {
						Process p = pb.start();
					// Finish Action 
						StringBuilder sb = new StringBuilder();
						BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String line;
						while((line = br.readLine())!= null) {
							sb.append(line + "\n");
						}
						int exitVal = p.waitFor();
						if(exitVal == 0) {
							lbSTATUS1.setText("Process excuted");
							System.out.println(sb);
				
						}
						else {
							lbSTATUS1.setText("Process failed to excute");
						}
						} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				}
					else {
						lbSTATUS1.setText("File is missing");
					}
				}
				
			});
			//Run 
			JButton btne = new JButton ("Run Project");
			btne.setBackground(Color.white);
			btne.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// Button Actions
					res = new File(txtPATH + "/run.bat".trim().toString());
					if(res.exists() && res.isFile()) {
					ProcessBuilder pb = new ProcessBuilder();
					List<String> cmd = new ArrayList<String>();
					cmd.add("cmd.exe");
					cmd.add("/c");
					cmd.add("start");
					cmd.add("run.bat");
					pb.directory(new File(txtPATH));
					pb.command(cmd);
					try {
						Process p = pb.start();
						//Finish Action
						StringBuilder sb = new StringBuilder();
						BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String line;
						while((line = br.readLine())!= null) {
							sb.append(line + "\n");
						}
						int exitVal = p.waitFor();
						if(exitVal == 0) {
							lbSTATUS1.setText("Process excuted");
							System.out.println(sb);
				
						}
						else {
							lbSTATUS1.setText("Process failed to excute");
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
					else {
						lbSTATUS1.setText("File is missing");
					}
				}
			});
			//KGet
			JButton btng = new JButton("Package Retriever");
			btng.setBackground(Color.white);
			btng.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// Button Action
					res = new File(txtPATH + "/get.bat".toString().trim());
					if(res.exists() && res.isFile()) {
					ProcessBuilder pb = new ProcessBuilder();
					List<String> cmd = new ArrayList<String>();
					cmd.add("cmd.exe");
					cmd.add("/c");
					cmd.add("start");
					cmd.add("get.bat");
					pb.directory(new File(txtPATH));
					pb.command(cmd);
					try {
						Process p = pb.start();
						//Finish Action
						StringBuilder sb = new  StringBuilder();
						BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String line;
						while((line = br.readLine())!= null) {
							sb.append(line + "\n");
						}
						int exitVal = p.waitFor();
						if(exitVal ==0) {
							lbSTATUS1.setText("Process excuted");
							System.out.println(sb);
					
						}
						else {
							lbSTATUS1.setText("Process failed to excute");
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					lbSTATUS1.setText("File is missing");
				}
				}
			});
			//Packer
			JButton btnh = new JButton("KodeApp Packer");
			btnh.setBackground(Color.white);
			btnh.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//Button Action
					res = new File(txtPATH + "/pack.bat".trim().toString());
					if(res.exists() && res.isFile()) {
					ProcessBuilder pb = new ProcessBuilder();
					List<String> cmd = new ArrayList<String>();
					cmd.add("cmd.exe");
					cmd.add("/c");
					cmd.add("start");
					cmd.add("pack.bat");
					pb.directory(new File(txtPATH));
					pb.command(cmd);
					try {
						Process p = pb.start();
						//Finish Action
						StringBuilder sb = new StringBuilder();
						BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String line;
						while((line = br.readLine())!= null) {
							sb.append(line + "\n");
						}
						int exitVal = p.waitFor();
						if(exitVal == 0) {
							lbSTATUS1.setText("Process excuted");
							System.out.println(sb);
					
						}
						else {
							lbSTATUS1.setText("Process failed to excute");
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
							}else {
								lbSTATUS1.setText("File is missing");
							}
				}
			});
			//Init
			JButton btni = new JButton("Init Default");
			btni.setBackground(Color.white);
			btni.setEnabled(false);
			//Create 
			JButton btnk = new JButton("Create Project");
			btnk.setBackground(Color.white);
			btnk.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//Button Action
					res = new File(txtPATH + "/create.bat".toString().trim());
					if (res.exists() && res.isFile()){
						
					
					ProcessBuilder pb = new ProcessBuilder();
					List<String> cmd = new ArrayList<String>();
					cmd.add("cmd.exe");
					cmd.add("/c");
					cmd.add("start");
					cmd.add("create.bat");
					pb.directory(new File(txtPATH));
					pb.command(cmd);
					try {
						Process p = pb.start();
						//Finish Action 
						StringBuilder sb =new StringBuilder();
						BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String line;
						while((line = br.readLine())!= null) {
							sb.append(line + "\n");
						}
						int exitVal = p.waitFor();
						if(exitVal == 0) {
							lbSTATUS1.setText("Process excuted");
							System.out.println(sb);
						
						}
						else {
							lbSTATUS1.setText("Process failed to excute");
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					lbSTATUS1.setText("File is missing");
				}
				}
			});
			// Checker 
			JButton btnm = new JButton("Kode Checker");
			btnm.setBackground(Color.white);
			btnm.setEnabled(false);
			// Render
			JButton btnq = new JButton("File Rendering");
			btnq.setBackground(Color.white);
			btnq.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//Button Action 
					res = new File(txtPATH+"/render.bat".toString().trim());
					if(res.exists()&&res.isFile()){
						
					
					ProcessBuilder pb =new ProcessBuilder();
					List<String> cmd = new ArrayList<String>();
					cmd.add("cmd.exe");
					cmd.add("/c");
					cmd.add("start");
					cmd.add("render.bat");
					pb.directory(new File(txtPATH));
					pb.command(cmd);
					try {
						Process p = pb.start();
						//Finish Action
						StringBuilder sb = new StringBuilder();
						BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String line;
						while ((line= br.readLine())!=null) {
							sb.append(line + "\n");
						}
						int exitVal = p.waitFor();
						if(exitVal == 0) {
							lbSTATUS1.setText("Process excuted");
							System.out.println(sb);
						
						}
						else {
							lbSTATUS1.setText("Process failed to excute");
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}else {
						lbSTATUS1.setText("File is missing");
					}
				}
			});
			//Live
			JButton btns = new JButton("Kode Live");
			btns.setBackground(Color.white);
			btns.setEnabled(false);
			//Add components to Panel
			panel2.add(btna);
			panel2.add(btnc);
			panel2.add(btnd);
			panel2.add(btne);
			panel2.add(btng);
			panel2.add(btnh);
			panel2.add(btni);
			panel2.add(btnk);
			panel2.add(btnm);
			panel2.add(btnq);
			panel2.add(btns);
			panel2.add(lbSTATUS);
			panel2.add(lbSTATUS1);
			//Visibility
			setVisible(true);
		}
	};
	btn1.addActionListener(listen1);
	panel1.add(btn1);
	// Kode Wiki 
	btn2 = new JButton("Kode Wiki");
	btn2.setFont(new Font("Open Sans", Font.BOLD, 14));
	btn2.setForeground(Color.white);
	btn2.setBackground(Color.black);
	btn2.setFocusable(false);
	btn2.setBorder(null);
	ActionListener listen2 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Set buttons
			btn3.setEnabled(true);
			btn2.setEnabled(false);
			btn1.setEnabled(true);
			btn.setEnabled(true);
			btn.setBorder(null);
			btn1.setBorder(null);
			btn2.setBorder(BorderFactory.createLineBorder(Color.black));
			btn3.setBorder(null);
			// Reset UI
			panel2.removeAll();
			panel2.updateUI();
			panel2.setLayout(layout);
			// Content
			panel2.add(new JLabel(img3));
			// Wiki Describe
			JLabel label = new JLabel("<html>Wiki pages are great , especially for new KodePas users " + "<br>" + "Let's find somethings you need for more information" + "<br>" + "Here are our Wiki sites");
			label.setFont(new Font("Open Sans", Font.ITALIC, 14));
			panel2.add(label);
			//Wiki Link
			JLabel label1 = new JLabel("- KodePas GitHub Wiki Online");
			label1.setFont(new Font("Open Sans", Font.BOLD, 14));
			panel2.add(label1);
			JTextField text = new JTextField("github.com/kodestudio/kodepas/wiki");
			text.setBorder(null);
			text.setMaximumSize(new Dimension(600, 15));
			text.setEditable(false);
			text.setBackground(Color.white);
			panel2.add(text);
			JLabel label2 = new JLabel("- KodeMan Wiki Online");
			label2.setFont(new Font("Open Sans", Font.BOLD, 14));
			panel2.add(label2);
			JTextField text2 = new JTextField("https://github.com/minhquan-onG1team/kodeman");
			text2.setBorder(null);
			text2.setEditable(false);
			text2.setMaximumSize(new Dimension(800, 15));
			text2.setBackground(Color.white);
			panel2.add(text2);
			//Wiki improve
			JLabel label3 = new JLabel("<html>Wanna help us to improve the Wiki? - You are welcome" + "<br>" + "Kode is open-source, that everyone can make a product from itself" + "<br>" + "So, improve the Wiki or add your product to the list of Kode-based ");
			label3.setFont(new Font("Open Sans", Font.TRUETYPE_FONT, 14));
			panel2.add(label3);
			//Visibility
			setVisible(true);
		}
	};
	btn2.addActionListener(listen2);
	panel1.add(btn2);
	//Settings
	btn3 = new JButton("Kode Settings");
	btn3.setFont(new Font("Open Sans", Font.BOLD, 14));
	btn3.setForeground(Color.white);
	btn3.setBackground(Color.black);
	btn3.setFocusable(false);
	btn3.setBorder(null);
	ActionListener listen3 = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Button 
			btn.setBorder(null);
			btn1.setBorder(null);
			btn2.setBorder(null);
			btn3.setBorder(BorderFactory.createLineBorder(Color.black));
			btn3.setEnabled(false);
			btn2.setEnabled(true);
			btn1.setEnabled(true);
			btn.setEnabled(true);
			//Reset UI
			panel2.removeAll();
			panel2.updateUI();
			panel2.setLayout(layout);
			// Content
				//Configuration
			JLabel lbPATH1 = new JLabel("Settings");
			lbPATH1.setFont(new Font("Serif", Font.BOLD, 16));
			panel2.add(lbPATH1);
			panel2.add(new JLabel("KodeMan resource folder path"));
			panel2.add(txt);
			panel2.add(labelPATH);
				//About
			JLabel lbAbout = new JLabel("About");
			lbAbout.setFont(new Font("Serif", Font.BOLD, 16));
			panel2.add(lbAbout);
			panel2.add(new JLabel(img1));
				//KodePas information
			JLabel label = new JLabel("- KodePas information");
			label.setFont(new Font("Open Sans", Font.BOLD, 16));
			panel2.add(label);
				//Version Checker
			JButton btnr = new JButton("Check Version");
			btnr.setBackground(Color.yellow);
			panel2.add(btnr);
			btnr.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JLabel msg = new JLabel("<html>To check KodePas version, you can type this:" + "<br>" + "kodepas version");
					msg.setFont(new Font("Open Sans", Font.BOLD, 14));
					JOptionPane.showMessageDialog(null, msg);
				}
			});
				//CLI
			JButton btnb = new JButton("CLI Help");
			btnb.setBackground(Color.green);
			btnb.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//Button Action
					res = new File(txtPATH+"/cli.bat".toString().trim());
					if(res.exists()&& res.isFile()){
					ProcessBuilder pb = new ProcessBuilder();
					List<String> cmd = new ArrayList<String>();
					cmd.add("cmd.exe");
					cmd.add("/c");
					cmd.add("start");
					cmd.add("cli.bat");
					pb.directory(new File(txtPATH));
					pb.command(cmd);
					try {
						Process p = pb.start();
						//Finish Action
						StringBuilder sb = new StringBuilder();
						BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String line;
						while((line=br.readLine())!=null) {
							sb.append(line + "\n");
						}
						int exitVal = p.waitFor();
						if(exitVal == 0) {
							System.out.println("Process excuted");
							System.out.println(sb);
						
						}
						else {
							JLabel msg = new JLabel("Process failed to excute");
							msg.setFont(new Font("Open Sans", Font.TRUETYPE_FONT, 14));
							JOptionPane.showMessageDialog(null,msg);
						}
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JLabel msg = new JLabel("<html>Sorry, an exception is happened" + "<br>" + "We cannot find your file" + "<br>" + "Please try again or contact us");
					msg.setFont(new Font("Open Sans", Font.TRUETYPE_FONT, 14));
					JOptionPane.showMessageDialog(null, msg);
				}
				}
			});
			panel2.add(btnb);
			//Products
			JButton btnl = new JButton("Kode Products");
			btnl.setBackground(Color.pink);
			panel2.add(btnl);
			btnl.setEnabled(false);
			//License
			JButton btnp = new JButton("License");
			btnp.setBackground(Color.orange);
			btnp.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JLabel lb = new JLabel("<html>KodePas - The Software Development Kit with CLI" + "<br>" + "License: GNU General Public License" + "<br>" +"KodePas is free and open source. It is provided by the Kode Organization" + "<br>" + "We hope you will pay attention to the KodePas License" + "<br>" + "Copyright (c) 2020 Kode Organization");
					lb.setFont(new Font("Open Sans", Font.BOLD, 14));
					JOptionPane.showMessageDialog(null, lb);
					}
			});
			panel2.add(btnp);
			// KodeMan
			JLabel label1 = new JLabel("- KodeMan information");
			label1.setFont(new Font("Open Sans", Font.BOLD, 16));
			panel2.add(label1);
			JLabel label2 = new JLabel("<html>Product name: KodeMan - KodePas GUI Manager" + "<br>" + "Version: 1.1" + "<br>" + "License: GNU General Public License version 3.0");
			label2.setFont(new Font("Open Sans", Font.TRUETYPE_FONT, 14));
			panel2.add(label2);
			JLabel label4 = new JLabel("- KodePas Update Manager");
			label4.setFont(new Font("Open Sans", Font.BOLD, 16));
			panel2.add(label4);
			JButton btnn = new JButton("Upgrade");
			btnn.setBackground(Color.white);
			btnn.setEnabled(false);
			JButton btno = new JButton("Update");
			btno.setBackground(Color.white);
			btno.setEnabled(false);
			panel2.add(btnn);
			panel2.add(btno);
			//Author
			JLabel label5= new JLabel("- KodeMan Author");
			label5.setFont(new Font("Open Sans", Font.BOLD, 16));
			panel2.add(label5);
			panel2.add(new JTextField("https://github.com/minhquan-onG1team"));
			//Picture
			JLabel label6 = new JLabel("- KodeMan Picture (by Doan Ngoc Khanh photographer)");
			label6.setFont(new Font("Open Sans", Font.BOLD, 16));
			panel2.add(label6);
			panel2.add(new JLabel(img2));
			//Visibility
			setVisible(true);
		}
	};
	btn3.addActionListener(listen3);
	panel1.add(btn3);
	//Panel2 -> Panel
	panel.add(panel2);
	//Component setup
	JScrollPane pane = new JScrollPane(panel2);
	pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	pane.getVerticalScrollBar().setUnitIncrement(16);
	panel.add(pane);
	this.setTitle("KodePas GUI Manager");
	this.setResizable(true);
	this.setContentPane(panel);
	this.setSize(800,600);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	this.setIconImage(img1.getImage());
	}
}
