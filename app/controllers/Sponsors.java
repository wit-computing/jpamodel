package controllers;

import java.util.List;

import models.Sponsor;
import play.mvc.Controller;

public class Sponsors extends Controller
{      
  public static void index()
  {
    List<Sponsor> sponsors = Sponsor.findAll();
    render (sponsors);
  }
}