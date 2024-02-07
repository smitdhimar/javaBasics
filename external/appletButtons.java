
/*<applet width="400" height="300" code="appletButtons.java"></applet>*/
import java.awt.event.*;

import java.applet.*;
import java.awt.*;

public class appletButtons extends Applet implements ActionListener {
  Button b1, b2, b3;
  int cnt = 0;
  int flag = 0;

  public void paint(Graphics g) {
    if (flag == 1) {
      g.clearRect(0, 0, getWidth(), getHeight());
    } else {

      g.drawString(String.valueOf(cnt), 100, 100);

    }
  }

  public void init() {
    setLayout(new GridLayout(3,1));
    b1 = new Button("plus");
    b2 = new Button("minus");
    b3 = new Button("clear");
    this.add(b3);
    this.add(b1);
    this.add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    String s = e.getActionCommand();
    if(flag==1){
      cnt=0;
    }
    if (s.equals("plus")) {
      flag=0;
      ++cnt;
      
    } else if(s.equals("minus")){
      flag=0;
      --cnt;
    }
    else{
      flag=1;
      
    }
    repaint();
  }
}