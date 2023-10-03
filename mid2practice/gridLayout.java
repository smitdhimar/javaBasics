
/*<applet code="gridLayout.java" width="600" height="400"></applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class gridLayout extends Applet {
  Button btn1, btn2, btn3;

  public void init() {
    setBackground(Color.BLUE);
    setLayout(new GridLayout(3, 1));
    btn1 = new Button("IN line 1");
    btn2 = new Button("In line 2");
    btn3 = new Button("In line 3");
    this.add(btn1);
    this.add(btn2);
    this.add(btn3);
    showStatus("all buttons are added successfully: : : : :)");
  }

}