package controllers;

import java.util.List;

import models.Club;
import models.Division;
import play.Logger;
import play.mvc.Controller;

public class Clubs extends Controller
{      
  public static void index()
  {
    List<Club> clubs = Club.findAll();
    render (clubs);
  }
  
  public static void delete(Long id)
  {
    Club club = Club.findById(id);
    if (club != null)
    {
      Logger.info("Trying to delete " + club.name);
      List<Division> divisions = Division.findAll();
      for (Division division : divisions)
      {
        if (division.members.contains(club))
        {
          division.members.remove(club);
          division.save();
          Logger.info ("removing club from division");
        }
      }
      club.delete();
    }
    index();
  } 
}