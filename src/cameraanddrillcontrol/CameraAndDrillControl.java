/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cameraanddrillcontrol;

/**
 *
 * @author Lenovo
 */
public class CameraAndDrillControl {

    /**
     * @param args the command line arguments
     */
    private enum State {
        IDLE,
        COLOR_CAMERA,
        MM16_CAMERA,
        DRILL,
        CAPTURE_COLOR_PHOTO,
        CAPTURE_MM16_PHOTO,
        TEMPORIZER
    }

    private State currentState;

    public CameraAndDrillControl() {
        currentState = State.IDLE;
        System.out.println("Entering Idle State");
    }

    public void pressButton1Short() {
        switch (currentState) {
            case IDLE:
                System.out.println("Capture a photo with the color camera.");
                break;
            case CAPTURE_COLOR_PHOTO:
                System.out.println("Capture a photo with the color camera.");
                break;
            case CAPTURE_MM16_PHOTO:
                System.out.println("Capture a photo with the 16-mm camera.");
                break;
            case TEMPORIZER:
                System.out.println("Capturing temporized photo...");
                break;
            default:
                System.out.println("Button 1 has no effect in this state.");
        }
    }

    public void pressButton1Long() {
        switch (currentState) {
            case IDLE:
                System.out.println("Switch to Capture Color Photo State");
                currentState = State.CAPTURE_COLOR_PHOTO;
                System.out.println("Entering Capture Color Photo State");
                break;
            case COLOR_CAMERA:
                System.out.println("Switch to Temporizer State");
                currentState = State.TEMPORIZER;
                System.out.println("Entering Temporizer State");
                // Start a timer for 5 seconds here
                break;
            case MM16_CAMERA:
                System.out.println("Switch to Temporizer State");
                currentState = State.TEMPORIZER;
                System.out.println("Entering Temporizer State");
                // Start a timer for 5 seconds here
                break;
            default:
                System.out.println("Button 1 has no effect in this state.");
        }
    }

    public void pressButton1Twice() {
        if (currentState == State.IDLE) {
            System.out.println("Switch to Drill State");
            currentState = State.DRILL;
            System.out.println("Entering Drill State");
        } else {
            System.out.println("Button 1 has no effect in this state.");
        }
    }

    public void pressButton2() {
        switch (currentState) {
            case COLOR_CAMERA:
                System.out.println("Switch to Idle State");
                currentState = State.IDLE;
                System.out.println("Leaving Color Camera State");
                break;
            case MM16_CAMERA:
                System.out.println("Switch to Idle State");
                currentState = State.IDLE;
                System.out.println("Leaving 16-mm Camera State");
                break;
            case DRILL:
                System.out.println("Switch to Idle State");
                currentState = State.IDLE;
                System.out.println("Leaving Drill State");
                break;
            case TEMPORIZER:
                System.out.println("Switch to Idle State");
                currentState = State.IDLE;
                System.out.println("Leaving Temporizer State");
                // Stop the timer for temporizer here
                break;
            default:
                System.out.println("Button 2 has no effect in this state.");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
//        CameraAndDrillControl control = new CameraAndDrillControl();
//
//        // Simulate button presses
//        control.pressButton1Short();
//        control.pressButton1Long();
//        control.pressButton1Twice();
//        control.pressButton2();
System.out.println("Initializing the Camera and Drill Control...");

    CameraAndDrillControl control = new CameraAndDrillControl();

    System.out.println("Simulating button presses:");
    
    // Simulate button presses
    System.out.println("Button press: Capture a photo with the color camera.");
    control.pressButton1Short(); // Capture a photo with the color camera.
    
    System.out.println("Button press: Switch to Temporizer State");
    control.pressButton1Long();  // Switch to Temporizer State
    
    System.out.println("Button press: Switch to Idle State");
    control.pressButton2();      // Switch to Idle State

    // ... Add more button presses here ...

    System.out.println("Button press: Capture a photo with the color camera.");
    control.pressButton1Short(); // Capture a photo with the color camera.

    System.out.println("Button press: Switch to Temporizer State");
    control.pressButton1Long();  // Switch to Temporizer State
    
    System.out.println("Button press: Switch to Idle State");
    control.pressButton2();      // Switch to Idle State
    
    System.out.println("Simulation complete.");
    }
    
}
