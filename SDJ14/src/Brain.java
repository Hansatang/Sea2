public class Brain
{
  public String[] MemoryItem;

  public Brain(int size)
  {
    this.MemoryItem = new String[size];

  }

  public int getIQ()
  {
    int above20 = 0;
    int above10 = 0;
    for (int i = 1; i < MemoryItem.length; i++)
    {
      if (MemoryItem[i].length()>20)
      {
        above20++;
      }
      else if (MemoryItem[i].length()>10)
      {
        above10++;
      }
    }

    if (above10>1 && above20>0)
    {
      return 130;
    }
    else if (above10+above20>2)
    {
      return 100;
    }
    else
    {
      return 70;
    }
  }


  //
  public boolean isBrainDamaged()
  {

    for (int i = 1; i < MemoryItem.length; i++)
    {
      if (MemoryItem[i] == null)
        return true;
    }
    return MemoryItem[0] == null;
  }

  //
  public void remember(String info)
  {
    for (int i = MemoryItem.length - 1; i > 0; )
    {
      MemoryItem[i] = MemoryItem[i - 1];
      i--;
    }
    MemoryItem[0] = info;

  }

  public void refresh(String info)
  {
    for (int i = MemoryItem.length - 1; i > 0; i--)
    {
      if (MemoryItem[i].equals(info))
      {
        remember(info);
      }
    }
  }

  public boolean recall(String info)
  {
    for (int i = MemoryItem.length - 1; i > 0; i--)
    {
      if (MemoryItem[i].equals(info))
      {
        return true;
      }
    }
    return false;
  }

  public String recall()
  {
    return MemoryItem[0];
  }

  public String toString()
  {
    String str = "I remember "+MemoryItem[0]+", but also ";
    for (int i=1; i<MemoryItem.length ; i++)
    {
      str=str+MemoryItem[i]+", ";
    }
    return str+".";
  }

  public boolean equal(Object obj)
  {
    if (!(obj instanceof Brain))
    {
      return false;
    }
    Brain other = (Brain) obj;
    if (MemoryItem.length!=other.MemoryItem.length)
    {
      return false;
    }
    else
    {
      for( int i =0;i<MemoryItem.length;i++)
      {
        if (MemoryItem[i]==null && other.MemoryItem[i]!=null)
        {
          return false;
        }
        else if (MemoryItem[i]!=null)
        {
          if (!(MemoryItem[i].equals(other.MemoryItem[i])))
          {
            return false;
          }
        }
      }
    }
    return true;
  }

}
