/* <applet code="myapplet.class" height="400" width="500"></applet>*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class myapplet extends Applet implements ActionListener {
  Button b1, b2;
  int cnt;
  String str="";
  public void paint(Graphics g){
    if(str.equals("plus")){
      showStatus
    }
  }
  public void init() {
    b1 = new Button("plus");
    b2 = new Button("minus");
    this.add(b1);
    this.add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    //String str = e.getActionCommand();
    str=e.getActionCommand();
    repaint();
  }

}