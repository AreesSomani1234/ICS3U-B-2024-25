package day1;

public class GameCube {
    //non-static instance variables
    //also called attributes
    //they belong to the instance
    private int numSides;
    private int topSide;

    public GameCube(){
        numSides = 6;
        // topSide = (int)(Math.random()*numSides)+1;
        roll();
    }
    // this refers to the instance variables because
    //this refers to this object or this instance
    // in numSides is just the argument/parameter
    //this.numSides referrs to the attribute numSides
    public GameCube(int numSides){
        this.numSides = numSides;
        // topSide = (int)(Math.random()*numSides)+1;
        roll();
    }

    public void roll(){
        topSide = (int)(Math.random()*numSides)+1;
    }

    public int getTopSide(){
        return this.topSide; // or topSide
    }
}
