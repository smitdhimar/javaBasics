
/*<html>
<body>
  <applet code="buttons.class" height="600" width="900"></applet>
  </body></html>
  */
import java.awt.*;
import java.util.*;
import java.applet.*;
import java.awt.event.*;

public class buttons extends Applet implements ActionListener {
  Button btn1,btn2,btn3;
  int cnt,f1=0,f2=0,f3=0;

  public void init() {
    // setLayout(new GridLayout(3,1));
    btn1= new Button("rect");
    btn2 = new Button("circle");
    btn3 = new Button("clear");
    this.add(btn2);
    this.add(btn1);
    this.add(btn3);
    cnt = 0;
    btn1.addActionListener(this);
    btn3.addActionListener(this);
    btn2.addActionListener(this);
  }
  public void paint(Graphics g){
    if(f1==1){
      // g.setColor(Color.Red);
       g.setColor(Color.yellow);
      g.drawRect(100,100,40,20);
    }
    else if(f2==1){
      // g.setColor(Color.Blue);
       g.setColor(Color.yellow);
      g.drawOval(100,100,50,50);
    }
    else{}
  }
  public void actionPerformed(ActionEvent a) {
    String str=a.getActionCommand();
    showStatus("counter :"+(++cnt));
    if(str.equals("rect")){
      f1=1;
      f2=0;
      f3=0;
      repaint();
    }
    else if(str.equals("circle")){
      f1=0;
      f2=2;
      f3=0;
      repaint();
    }
    else if(str.equals("clear")){
      f1=0;
      f2=0;
      f3=3;
      repaint();
    }
  }
}