import java.io.*;
import java.util.Stack;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class stackGUI extends JFrame implements ActionListener {
  JTextField f1, f2;
  JLabel j1, j2;
  JPanel p1, p2, p3;
  JButton b1, b2, b3;
  Stack<pair> st;
  String s1 = "", s2 = "";

  public void actionPerformed(ActionEvent e) {
    String str = e.getActionCommand();
    if (str == "push") {
      s1 = f1.getText();
      s2 = f2.getText();
      st.push(new pair(Integer.parseInt(s1), Integer.parseInt(s2)));
      repaint();
    } else if (str == "pop") {
      pair temp = st.peek();
      s1 = String.valueOf(temp.geta());
      s2 = String.valueOf(temp.getb());
      repaint();
      st.pop();
    } else if (str == "peek") {
      pair temp = st.peek();
      s1 = String.valueOf(temp.geta());
      s2 = String.valueOf(temp.getb());
      repaint();
    }
  }

  public void paint(Graphics g) {
    String temp = s1 + " " + s2;
    g.drawString(temp, 100, 50);
  }

  public stackGUI() {
    p1 = new JPanel();
    p2 = new JPanel();
    p3 = new JPanel();

    j1 = new JLabel("id");
    j2 = new JLabel("cpi");
    b1 = new JButton("push");
    b2 = new JButton("pop");
    b3 = new JButton("peek");
    f1 = new JTextField();
    f1 = new JTextField();

    // adding panels
    this.add(p1);
    this.add(p2);
    this.add(p3);

    // adding to panels
    p2.add(f1);
    p2.add(j1);
    p2.add(f2);
    p2.add(j2);
    p3.add(b1);
    p3.add(b2);
    p3.add(b3);

    // registratoin
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }

  public static void main(String args[]) {
    stackGUI ob = new stackGUI();
    ob.setSize(400, 350);
    ob.setVisible(true);
    ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class pair {
  public int id;
  public int cpi;

  public pair(int a, int b) {
    id = a;
    cpi = b;
  }

  public int geta() {
    return id;
  }

  public int getb(){
    return cpi;
  }
}