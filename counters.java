
/*<html>
<body>
  <applet code="counters.class" height="600" width="900"></applet>
  </body></html>
  */
import java.awt.*;
import java.util.*;
import java.applet.*;
import java.awt.event.*;

public class counters extends Applet implements ActionListener {
  Button btn2, btn;
  int cnt;

  public void init() {
    btn = new Button("plus");
    btn2 = new Button("minus");
    this.add(btn2);
    this.add(btn);
    cnt = 0;
    btn.addActionListener(this);
    btn2.addActionListener(this);
  }

  public void actionPerformed(ActionEvent a) {
    if (a.getActionCommand().equals("plus")) {
      showStatus("Counter updated to :" + (++cnt));
    } else {
      showStatus("Counter updated to : " + (--cnt));
    }
  }
}