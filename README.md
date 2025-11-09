# Chess Game in Java

A simple two-player chess game implemented in Java. This project demonstrates core object-oriented programming concepts while simulating a classic game of chess in the console or basic UI.

## Features
- Standard 8x8 chessboard with all classic pieces
- Turn-based gameplay between two human players
- Basic move validation for each piece type
- Console-based interface (or GUI if added)

## Getting Started

### Prerequisites
- Java JDK 8 or above
- Any Java IDE (IntelliJ, Eclipse, VS Code) or terminal with `javac`

### Installation and Run
```bash
git clone https://github.com/n1h4r1k4/Chess_Game_Java.git
cd Chess_Game_Java
# Compile and run using your IDE or:
javac -d out src/**/*.java
java -cp out Main
```

### Project Structure

Board – Manages the chessboard and pieces

Piece – Abstract class for chess pieces

Subclasses for each piece: King, Queen, Rook, Bishop, Knight, Pawn

Game – Controls game flow and player turns

### Future Improvements

Add GUI using Java Swing or JavaFX

Implement special rules (castling, en passant, promotion)

Add AI for single-player mode

Save and load game functionality

### Contributing

Feel free to fork the project, create a branch, and submit a pull request. All contributions are welcome!

### License

This project is licensed under the GPL-3.0 License.
