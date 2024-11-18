public class MovieHierarchy {
    public static void main(String[] args) {
        MovieOne romCom = new RomComMovie("Ka Ka Ga Po", "A charming love story with humor.");
        MovieOne thriller = new ThrillerMovie("Inception", "A mind-bending thriller with layers of mystery.");
        MovieOne action = new ActionMovie("Mad Max: Fury Road", "High-octane action set in a dystopian world.");

        romCom.displayDetails();
        romCom.play();
        romCom.specialFeature();

        thriller.displayDetails();
        thriller.play();
        thriller.specialFeature();

        action.displayDetails();
        action.play();
        action.specialFeature();
    }
}

abstract class MovieOne {
    private String title;
    private String description;

    public MovieOne(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
    }

    public abstract void play();
    public abstract void specialFeature();
}

class RomComMovie extends MovieOne {
    public RomComMovie(String title, String description) {
        super(title, description);
    }

    public void play() {
        System.out.println("Playing a romantic comedy with feel-good vibes!");
    }

    public void specialFeature() {
        System.out.println("Special Feature: Behind-the-scenes bloopers!");
    }
}

class ThrillerMovie extends MovieOne {
    public ThrillerMovie(String title, String description) {
        super(title, description);
    }

    public void play() {
        System.out.println("Playing a suspenseful thriller full of twists!");
    }

    public void specialFeature() {
        System.out.println("Special Feature: Director's commentary explaining plot twists!");
    }
}

class ActionMovie extends MovieOne {
    public ActionMovie(String title, String description) {
        super(title, description);
    }

    public void play() {
        System.out.println("Playing an action-packed movie with thrilling sequences!");
    }

    public void specialFeature() {
        System.out.println("Special Feature: Stunt choreography breakdown!");
    }
}
