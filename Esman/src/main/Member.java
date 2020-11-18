package main;

import java.io.Serializable;

public class Member implements Serializable
{

  private String name;
  private Role role;

  public Member(String name, Role role){
    this.name = name;
    this.role = role;
  }

  public String getName()
  {
    return name;
  }

  public Role getRole()
  {
    return role;
  }
}
