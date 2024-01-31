package curs4.Teme.Radio;

import java.util.ArrayList;

public class Radio {
    private boolean on;
    private int volume;
    private int currentPostIndex;
    private ArrayList<String> posts;

    public Radio(ArrayList<String> posts) {
        this.posts = posts;
//        this.posts.add(post1);
//        this.posts.add(post2);
//        this.posts.add(post3);
//        this.posts.add(post4);
//        this.posts.add(post5);
        this.on = false;
        this.volume = 0;
        this.currentPostIndex = 0;
    }

    public void turnOn() {
        if (on) {
            System.out.println("The radio is already on!");
        } else {
            on = true;
        }
    }

    public void turnOff() {
        if (!on) {
            System.out.println("The radio is already off");
        }
        on = false;
    }

    public void turnVolumeUp() {
        if (on) {
            volume++;
            if (volume > 10) {
                volume = 10;
                System.out.println("Volume is at max!");
            }
        } else {
            System.out.println("You can't do that, the radio is off!");
        }
    }

    public void turnVolumeDown() {
        if (on) {
            volume--;
            if (volume < 0) {
                volume = 0;
                System.out.println("Volume is at min!");
            }
        } else {
            System.out.println("You can't do that, the radio is off!");
        }
    }

    public void changePostForward() {
        if (on) {
            if (currentPostIndex >= 0 || currentPostIndex < (posts.size() - 1)) {
                currentPostIndex++;
            }
            if (currentPostIndex > posts.size() - 1) {
                currentPostIndex = posts.size() - 1;
                System.out.println("This is the last post! It can only be changed in the previous posts!");
            }
        } else {
            System.out.println("You can't do that, the radio is off!");
        }
    }

    public void changePostBackwards() {
        if (on) {
            if (currentPostIndex > 0 || currentPostIndex < (posts.size() - 1)) {
                currentPostIndex--;
            }
            if (currentPostIndex < 0) {
                System.out.println("This is the first post! It can only be changed in the next posts!");
                currentPostIndex = 0;
            }
        } else {
            System.out.println("You can't do that, the radio is off!");
        }
    }

    public void displayRadioStatus() {
        if (!on) {
            System.out.println("The radio is off.");
        } else {
            System.out.println("The radio is on, on the " + posts.get(currentPostIndex)
                    + " post, at volume " + volume + ".");
        }
    }
}
