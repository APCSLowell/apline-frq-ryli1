public class APLine
{
  private int a, b, c;
  public APLine {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public double getSlope() {
    return (-a/b);
  }
  public boolean isOnLine(int x, int y) {
    if(((a*x) + (b*y) + c) == 0) {
      return true;
    }
    return false;
  }
}
