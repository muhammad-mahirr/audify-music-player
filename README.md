# Audify - Player 🎵

A simple console-based music player built in Java.

The program lets you choose a track and control playback using your keyboard. It plays .wav files stored in the assets/ folder.

## ✨ Features

- 🎶 Play Up to 4 Tracks

  Choose from 4 preloaded songs or add your own .wav files by replacing the existing ones.

- 🔁 Playback Controls

  Use the keyboard to play, stop, reset, switch to next/previous track, or quit.

- 💻 No External Libraries

  Built using Java’s standard libraries only.

## 🚀 How to Run

1. **Download or Clone the Repository**
   ```
   git clone https://github.com/your-username/audify-player.git

   ```

2. **Add or Replace Music (Optional)**

   You can replace the existing songs inside the assets/ folder with your own .wav files.
   Just make sure to rename them exactly as:
   ```
   Track 1.wav
   Track 2.wav
   Track 3.wav
   Track 4.wav
   ```
   **Note:** Make sure to keep the file format as .wav and do not exceed 4 tracks.


3. **Open Command Prompt (Windows) or Terminal (Mac/Linux)**

   Navigate to the root directory of the project (any folder where you placed this project), which must contain both the `src/` and `assets/` folders as subfolders.

   Compile the Java files:
   ```
   javac src/*.java

   ```
   Run the program:
   ```
   java -cp src Main

   ```

## 🎮 How to Use

- The program will show a list of available tracks.

- Type 1, 2, 3, or 4 to pick a track.

- Use these keys to control playback:

  `P` = Play
  `S` = Stop
  `N` = Next
  `B` = Previous
  `R` = Reset
  `Q` = Quit
