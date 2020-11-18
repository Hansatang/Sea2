public class Point
{
  private float x, y;

  public Point(float x, float y)
  {
    this.x = x;
    this.y = y;
  }

  public float getX()
  {
    return x;
  }

  public float getY()
  {
    return y;
  }

  public void setX(float x)
  {
    this.x = x;
  }

  public void setY(float y)
  {
    this.y = y;
  }

  public void setTo(float xd, float yd)
  {
    this.x = x + xd;
    this.y = y + yd;
  }

  public void teleportTo(float x, float y)
  {
    this.x = x;
    this.y = y;
  }

  public String toString()
  {
    return "(" + getX() + "," + getY() + ")";
  }
}
