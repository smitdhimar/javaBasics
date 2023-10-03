
/*<html>
<body>
  <applet code="my_applet.class" height="600" width="900"></applet>
  </body></html>
  */
import java.applet.*;
import java.awt.*;

public class my_applet extends Applet {
  public void init() {
    Button btn = new Button("hello");
    this.add(btn);
    showStatus("sdkfjs;d");
    // Graphics g=new Graphics();
    // paint(g,"hejsldfk");
  }

  public void paint(Graphics g) {
    showStatus("shit line");
    g.drawString("hello smit", 100, 100);
  }

  public void start() {

  }
}
