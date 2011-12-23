package domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

public class Coordinates  implements java.io.Serializable {
     
     @NotNull
     @Digits(integer = 5, fraction = 2)
     private Integer id;
     
     @NotNull
     @Digits(integer = 5, fraction = 2)
     private double x1;
          
     @NotNull
     @Digits(integer = 5, fraction = 2)
     private double y1;
     
     @NotNull
     @Digits(integer = 5, fraction = 2)
     private double x2;
     
     @NotNull
     @Digits(integer = 5, fraction = 2)
     private double y2;
     
     @NotNull
     @Digits(integer = 5, fraction = 2)
     private double x3;
     
     @NotNull
     @Digits(integer = 5, fraction = 2)
     private double y3;
     
     @NotNull
     @Digits(integer = 5, fraction = 2)
     private double x4;
     
     @NotNull
     @Digits(integer = 5, fraction = 2)
     private double y4;

    public Coordinates() {
    }

    public Coordinates(double x1, double y1, double x2, double y2,
                      double x3, double y3, double x4, double y4) {
       this.x1 = x1;
       this.y1 = y1;
       this.x2 = x2;
       this.y2 = y2;
       this.x3 = x3;
       this.y3 = y3;
       this.x4 = x4;
       this.y4 = y4;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public double getX1() {
        return this.x1;
    }
    
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public double getY1() {
        return this.y1;
    }
    
    public void setY1(double y1) {
        this.y1 = y1;
    }
    public double getX2() {
        return this.x2;
    }
    
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getY2() {
        return this.y2;
    }
    
    public void setY2(double y2) {
        this.y2 = y2;
    }
    public double getX3() {
        return this.x3;
    }
    
    public void setX3(double x3) {
        this.x3 = x3;
    }
    public double getY3() {
        return this.y3;
    }
    
    public void setY3(double y3) {
        this.y3 = y3;
    }
    public double getX4() {
        return this.x4;
    }
    
    public void setX4(double x4) {
        this.x4 = x4;
    }
    public double getY4() {
        return this.y4;
    }
    
    public void setY4(double y4) {
        this.y4 = y4;
    }




}


