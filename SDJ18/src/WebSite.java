public class WebSite
{
  public String url;
  public boolean needUpdate;

  public WebSite(String url)
  {
    this.url = url;
    this.needUpdate = false;
  }

  public boolean NeedsUpdate()
  {
    return needUpdate = true;
  }

  public void markUpdated()
  {
    needUpdate = true;
  }
}
