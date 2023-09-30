interface resize {
  void resizeWidth(int width);
  void resizeHeight(int height);
}
class rectangle implements resize{
  int width,height;
  rectangle(int a, int b){
    width=a;
    height=b;
  }
 public void resizeWidth(int a){
    this.width=a;
  }
  public void resizeHeight(int a){
    this.height=a;
  }
  void display(){
    System.out.println("height is : "+this.height+"\nwidth is : "+this.width);
  }
  public static void main(String args[]){
    rectangle r=new rectangle(34,45);
    r.resizeWidth(35);
    r.resizeHeight(50);
    r.display();
  }
}