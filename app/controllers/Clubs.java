package controllers;

import java.util.List;

import models.Club;
import play.mvc.Controller;

public class Clubs extends Controller
{      
  public static void index()
  {
    List<Club> clubs = Club.findAll();
    render (clubs);
  }
}