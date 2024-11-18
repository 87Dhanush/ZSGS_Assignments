import java.util.ArrayList;
import java.util.List;

public class HasARelation {
    public static void main(String[] args) {
        Team team = new Team("Mumbai FC", "mumbai", "Western");
        Player player1 = new Player("Anirudh Tapa", "Point Guard", 30);
        Player player2 = new Player("Chethry", "Shooting Guard", 11);
        
        team.addPlayer(player1);
        team.addPlayer(player2);
        
        team.showTeamDetails();
        team.playGame();
        team.hireCoach("Steve");
        player1.train();
    }
}

class Team {
    private String name;
    private String city;
    private String division;
    private List<Player> players = new ArrayList<>(); // "has-a" relationship
    
    public Team(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
    }
    
    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player.getName() + " has joined the team " + name);
    }
    
    public void playGame() {
        System.out.println("Team " + name + " is playing a game!");
        for (Player player : players) {
            player.playGame();
        }
    }
    
    public void hireCoach(String coachName) {
        System.out.println("Coach " + coachName + " has been hired by " + name);
    }
    
    public void showTeamDetails() {
        System.out.println("Team Name: " + name + ", City: " + city + ", Division: " + division);
        System.out.println("Players:");
        for (Player player : players) {
            System.out.println("- " + player.getName() + " (" + player.getPosition() + ", #" + player.getJerseyNumber() + ")");
        }
    }
}

class Player {
    private String name;
    private String position;
    private int jerseyNumber;
    
    public Player(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }
    
    public void playGame() {
        System.out.println(name + " is playing the game as " + position);
    }
    
    public void train() {
        System.out.println(name + " is training hard!");
    }
    
    public String getName() {
        return name;
    }
    
    public String getPosition() {
        return position;
    }
    
    public int getJerseyNumber() {
        return jerseyNumber;
    }
}
