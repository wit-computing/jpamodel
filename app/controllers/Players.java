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
}