package controllers;

import java.util.List;

import models.Player;
import play.mvc.Controller;

public class Players extends Controller
{      
  public static void index()
  {
    List<Player> players = Player.findAll();
    render (players);
  }
  
  public static void delete(Long id)
  {
    Player player = Player.findById(id);
    if (player != null)
    {
      if (player.club != null)
      {
        player.club.removePlayer(player);
        player.club.save();
      }
      player.delete();
    }
    index();
  }
}