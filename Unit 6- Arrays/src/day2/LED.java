package day2;

public class LED {
    // Constant array representing available colours
    public static final String[] AVAILABLE_COLOURS = { "RED", "GREEN", "BLUE", "YELLOW" };

    // Attributes of the LED class
    private boolean isOn;
    private String colour;

    // Constructor to set the colour and set isOn to false
    public LED(String colour) {
        // Check if the colour is valid
        if (isValidColour(colour)) {
            this.colour = colour;
            this.isOn = false;
        } else {
            throw new IllegalArgumentException("Invalid colour");
        }
    }

    // Getter for isOn
    public boolean isOn() {
        return isOn;
    }

    // Setter for isOn
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    // Getter for colour
    public String getColour() {
        return colour;
    }

    // Setter for colour
    public void setColour(String colour) {
        // Check if the colour is valid
        if (isValidColour(colour)) {
            this.colour = colour;
        } else {
            throw new IllegalArgumentException("Invalid colour");
        }
    }

    // Method to display the colour if the light is on
    public void displayColour() {
        if (isOn) {
            if (colour.equalsIgnoreCase("RED")) {
                System.out.println("R");
            } else if (colour.equalsIgnoreCase("GREEN")) {
                System.out.println("G");
            } else if (colour.equalsIgnoreCase("BLUE")) {
                System.out.println("B");
            } else if (colour.equalsIgnoreCase("YELLOW")) {
                System.out.println("Y");
            }
        } else {
            System.out.println(" "); // Blank (space) if the light is off
        }
    }

    // Helper method to validate the colour
    private boolean isValidColour(String colour) {
        for (String availableColour : AVAILABLE_COLOURS) {
            if (availableColour.equalsIgnoreCase(colour)) {
                return true;
            }
        }
        return false;
    }
}
