import java.util.ArrayList;

public class Notebook
{

  public ArrayList<Note> notes;

  public Notebook()
  {
    this.notes = new ArrayList<>(5);
  }

  public int getAmount()
  {
    return notes.size();
  }

  public Note getNote(int index)
  {
    return notes.get(index);
  }

  public String getMessage(int index)
  {
    return notes.get(index).getMessage();
  }

  public void addNote(Note note)
  {
    if (notes.size()!=5)
    {
      notes.add(note);
    }
  }

  public void addNote(String message)
  {

    if (notes.size()!=5)
    {
      notes.add(new Note(message));
    }
  }

  public void addHighNote(Note note)
  {
    if (notes.size()!=5)
    {
      notes.add(note);
      notes.get(notes.size() - 1).setToHighPriority();
    }
  }

  public void addHighNote(String message)
  {
    if (notes.size()!=5)
    {
      notes.add(new Note(message));
      notes.get(notes.size() - 1).setToHighPriority();
    }
  }

  public void removeNote(int index)
  {
    notes.set(index, null);
  }

  public ArrayList<Note> getAllNotes()
  {
    return notes;
  }

  public int getHightPriority()
  {
    int isHigh = 0;
    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i) == null)
      {
        continue;
      }
      if (notes.get(i).isHighPriority())
      {
        isHigh++;
      }
    }
    return isHigh;
  }

  public ArrayList<Note> getAllHighNote()
  {
    Notebook higher = new Notebook();
    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i) == null)
      {
        continue;
      }
      if (notes.get(i).isHighPriority())
      {
        higher.addNote(notes.get(i));
      }
    }
    return higher.notes;
  }

  public ArrayList<Note> getAllNote()
  {
    Notebook all = new Notebook();
    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i) == null)
      {
        continue;
      }
      all.addNote(notes.get(i));
    }
    return all.notes;
  }

  public String toString()
  {
    String str = "My notes :";
    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i) == null)
      {
        continue;
      }
      str = str + "\n" + " Note " + i + ": " + notes.get(i).toString() + ".";
    }
    return str;
  }

  public static void main(String[] args) throws IndexOutOfBoundsException
  {
    Notebook nb = new Notebook();

    Note n1 = new Note("ser");
    Note n2 = new Note("ser2");
    Note n3 = new Note("ser3");
    Note n4 = new Note("ser4");
    nb.addHighNote(n1);
    nb.addNote(n2);
    nb.addHighNote(n3);
    nb.addNote(n4);
    System.out.println(nb.getAmount());
    nb.notes.add(n1);
    System.out.println(nb.toString());
    System.out.println(nb.getNote(2));

    System.out.println(nb.getHightPriority());
    nb.removeNote(3);
    nb.addNote("mialko");
    System.out.println(nb.toString());
    System.out.println(nb.getNote(2));
    ArrayList<Note> temp = nb.getAllHighNote();
    ArrayList<Note> temp1 = nb.getAllNote();
    System.out.println("A");
    System.out.println(nb.getAllNotes());
    for (int i = 0; i < temp1.size(); i++)
    {
      if (!(temp1.get(i) == null))
      {
        System.out.println(temp1.get(i).toString());
      }
    }
   /* for (int i = 0; i < temp.length; i++)
    {
      System.out.println(temp[i].toString());
    }


    */
  }

}
