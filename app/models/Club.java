package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Club extends Model
{
  public String name;

  public Club(String name)
  {
    this.name = name;
  }
  
  public static Club findByName(String name)
  {
    return find("name", name).first();
  } 
}