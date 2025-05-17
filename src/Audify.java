import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Audify {
    private int currentIndex;
    private String[] filePath = {
            "assets/Track 1.wav",
            "assets/Track 2.wav",
            "assets/Track 3.wav",
            "assets/Track 4.wav"
    };
    private File file;
    private Scanner scanner;
    private Clip clip;

    Audify(int choice){
        this.currentIndex = choice;
        this.file = new File(filePath[currentIndex]);
        this.scanner = new Scanner(System.in);
        loadClip();
    }

    public void loadClip(){
        try{
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
        }catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }catch(IOException e ){
            System.out.println("Something went wrong");
        }catch(LineUnavailableException e ){
            System.out.println("Unable to access");
        }
    }

    public void play(){
        clip.start();
    }
    public void stop(){
        clip.stop();
    }
    public void next(){
        if(currentIndex < filePath.length - 1){
            stop();
            currentIndex++;
            file = new File(filePath[currentIndex]);
            loadClip();
            play();
        }
        else{
            System.out.println("\nNo next song available\n");
            stop();
        }
    }
    public void previous(){
        if(currentIndex > 0){
            stop();
            currentIndex--;
            file = new File(filePath[currentIndex]);
            loadClip();
            play();
        }
        else{
            System.out.println("\nNo previous song available\n");
            stop();
        }
    }
    public void reset(){
        clip.setMicrosecondPosition(0);
    }
    public void quit(){
        clip.close();
    }
    public void run() {
        play();
        String response = "";

        while(!response.equals("Q")){
            System.out.println("P = Play");
            System.out.println("S = Stop");
            System.out.println("N = Next");
            System.out.println("B = Previous");
            System.out.println("R = Reset");
            System.out.println("Q = Quit");
            System.out.print("Press a button: ");
            response = scanner.nextLine().toUpperCase();

            switch(response){
                case "P" -> play();
                case "S" -> stop();
                case "N" -> next();
                case "B" -> previous();
                case "R" -> reset();
                case "Q" -> quit();
                default -> {
                    System.out.println("Invalid button!!");
                }
        }
        }

    }
}
