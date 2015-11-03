package controllers;

import java.util.List;

import models.Division;
import play.mvc.Controller;

public class Divisions extends Controller
{      
  public static void index()
  {
    List<Division> divisions = Division.findAll();

    render (divisions);
  }
}