# Music Playlist Manager 🎵
The Music Playlist Manager is a Java-based application designed for music enthusiasts to create, organize, and play playlists effortlessly. This project was developed as part of a university assignment, showcasing concepts like multithreading, file I/O, and user interface design.
## Features 🚀
### Playlist Management:
Create playlists, add songs, and remove songs with ease.
Save and load playlists using file I/O.

### Smooth Music Playback:
Enjoy uninterrupted playback using multithreading.

### User-Friendly GUI:
Intuitive design powered by Java Swing.

## Technologies Used 🛠️
Java Swing: For the graphical user interface.

Java Audio Libraries:

JLayer

mp3agic

jaudiotagger

Used for audio playback and metadata extraction.

Multithreading: Ensures smooth playback alongside other tasks.

File I/O: Saves and loads playlists for future use.
## Project Structure 📂
### 1. Song Class
Represents individual songs.
Stores metadata like title, artist, duration, and file path.
Utilizes libraries like mp3agic and jaudiotagger for metadata extraction.
### 2. MusicPlayer Class
Handles music playback (play, pause, stop, next, previous).
Uses multithreading for smooth playback.
### 3. MusicPlayerGUI Class
Provides the main graphical interface for user interaction.
Features buttons (play, pause, next, previous), a song display, and a playback slider.
### 4. MusicPlaylistDialog Class
Allows users to manage playlists.
Includes add/remove functionality and save/load support via file I/O.
### 5. LaunchPage Class
Welcome screen with the application logo and a start button.
## Challenges Overcome 💡
Multithreading: Ensured smooth playback without freezing the GUI.
File I/O: Implemented robust handling of file paths and errors.
GUI Design: Created a responsive, easy-to-use interface.
## How to Run the Project 🖥️
### Prerequisites:
Java Development Kit (JDK) 8 or higher.
A Java IDE (e.g., NetBeans, IntelliJ IDEA, Eclipse).
Required libraries:
JLayer
mp3agic
jaudiotagger
### Steps:
Clone the repository:

```bash
   git clone https://github.com/yourusername/music-playlist-manager.git
   cd music-playlist-manager
```

Add the downloaded .jar files to the project's lib directory or classpath.

Compile and run the project using your IDE or command line.

## Future Enhancements ✨
Add support for more audio formats.
Enhance the GUI with modern design principles.
Implement a search bar for quick song retrieval.

## Screenshots 📸

![MusicPlaylistManager](https://github.com/user-attachments/assets/2a71aa92-5cad-4e31-a580-65d91f1c69cd)
![LoadSong1](https://github.com/user-attachments/assets/aeea2b9a-e96e-424f-874e-c3beaedb105f)
![LoadSong2](https://github.com/user-attachments/assets/69dc5891-cd21-49aa-9d42-7d18b08d7f23)
![LoadSong3](https://github.com/user-attachments/assets/56480fd3-ba34-4e25-a590-8c0dbef5a21b)
![CreatePlaylist1](https://github.com/user-attachments/assets/97a6400b-47ed-4950-92ba-d5f8144406e3)
![CreatePlaylist2](https://github.com/user-attachments/assets/d7e17a86-a104-4789-af43-67ccfc57d5d9)
![CreatePlaylist3](https://github.com/user-attachments/assets/64cea3c1-c9ee-4efa-8c76-143f1050291d)
![CreatePlaylist4](https://github.com/user-attachments/assets/081faf49-cf6b-4951-afe2-90d5dc8c5865)
![PlayPlaylist](https://github.com/user-attachments/assets/69e572ec-7ff7-4641-a15b-739bfac373b7)
![SongPause](https://github.com/user-attachments/assets/7aeaff80-ed7b-47cb-973b-3f168e715214)
![SongForward](https://github.com/user-attachments/assets/7d3bcc69-97a9-4fc3-ad0a-b0f10ec6b008)
![SongBackword](https://github.com/user-attachments/assets/b7f80489-196c-42c3-bb05-0350f872cf96)


## Disclaimer 📜
This repository was created as part of a university project. It is intended for academic purposes and is not actively maintained.




