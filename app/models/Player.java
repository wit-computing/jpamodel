package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Player extends Model
{
  public String name;

  public Player(String name)
  {
    this.name = name;
  }
  
  public static Player findByName(String name)
  {
    return find("name", name).first();
  }
}