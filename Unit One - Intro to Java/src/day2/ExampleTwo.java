package day2;

public class ExampleTwo {
    int x = 7, y = 8;
    double a = 2.6, b = 0.5;
    
    x=x+7;  // adds 7 to x, then assings 14 to x
            // assignment is last and has the least precedence
    y += 3;  // shortcut

    b -= 6;  // same shortcut

    a*= 3; // same shortcut

    x /= 4; // same shortcut

    x = x + 1;
    x++;      // adds 1 to x (uses x then adds 1)
    ++x; // same thing (add 1 to x then use x)
    y = y + 1
    y--;      // subtracts 1 to y
    --y; // same thing


    y = x++; // y is assigned x then x is incremented
    y = ++x; // x is incremented the assigned y
    
    
}
