import java.util.Scanner;

interface Playable {
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable {
    private boolean isPlaying = false;

    @Override
    public void play() {
        if (!isPlaying) {
            System.out.println("MP3Player is now playing.");
            isPlaying = true;
        } else {
            System.out.println("MP3Player is already playing.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("MP3Player is paused.");
            isPlaying = false;
        } else {
            System.out.println("MP3Player is already paused.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("MP3Player is stopped.");
            isPlaying = false;
        } else {
            System.out.println("MP3Player is not playing.");
        }
    }
}

class CDPlayer implements Playable {
    private boolean isPlaying = false;

    @Override
    public void play() {
        if (!isPlaying) {
            System.out.println("CDPlayer is now playing.");
            isPlaying = true;
        } else {
            System.out.println("CDPlayer is already playing.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("CDPlayer is paused.");
            isPlaying = false;
        } else {
            System.out.println("CDPlayer is already paused.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("CDPlayer is stopped.");
            isPlaying = false;
        } else {
            System.out.println("CDPlayer is not playing.");
        }
    }
}

class StreamingPlayer implements Playable {
    private boolean isPlaying = false;

    @Override
    public void play() {
        if (!isPlaying) {
            System.out.println("StreamingPlayer is now playing.");
            isPlaying = true;
        } else {
            System.out.println("StreamingPlayer is already playing.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("StreamingPlayer is paused.");
            isPlaying = false;
        } else {
            System.out.println("StreamingPlayer is already paused.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("StreamingPlayer is stopped.");
            isPlaying = false;
        } else {
            System.out.println("StreamingPlayer is not playing.");
        }
    }
}

public class PlayableDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a player: 1. MP3Player 2. CDPlayer 3. StreamingPlayer");
        int choice = scanner.nextInt();

        Playable player = null;
        switch (choice) {
            case 1:
                player = new MP3Player();
                break;
            case 2:
                player = new CDPlayer();
                break;
            case 3:
                player = new StreamingPlayer();
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        while (true) {
            System.out.println("Control the player: 1. Play 2. Pause 3. Stop 4. Exit");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.stop();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid action!");
            }
        }
    }
}
