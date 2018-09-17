package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double coordx, double coordy){
    this.x = coordx;
    this.y = coordy;
  }

  public double distance(Point p){
    return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
  }
}
