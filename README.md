# 🐍 Java Snake Game

A simple Snake game built in **Java** using **JavaFX**.
This project demonstrates basic game development concepts such as rendering, input handling, and game loop logic.

---

## 🚀 Features

* Classic Snake gameplay
* Real-time movement and keyboard input
* Dynamic food spawning
* Game over detection
* Modular and object-oriented Java code
* Cross-platform support (runs on any OS with JavaFX)

---

## 🧩 Requirements

* **Java Development Kit**
* **Apache Maven**
* **JavaFX** SDK (if not bundled with your JDK)

---

## ⚙️ How to Run

### 🪟 On Windows

1. **Install JDK 17+**

   * Download from [Adoptium](https://adoptium.net) or [Oracle JDK](https://www.oracle.com/java/technologies/downloads/).
   * After installation, open **Command Prompt** and verify:

     ```bash
     java -version
     ```
2. **Install Maven**

   * Download from https://maven.apache.org/download.cgi.
   * Extract and add `bin` folder to your **PATH** environment variable.
   * Verify:

     ```bash
     mvn -v
     ```
3. **Clone and Run**

   ```bash
   git clone https://github.com/mzmahid/Java_snake.git
   cd Java_snake
   mvn clean compile exec:java
   ```

   Or, if that fails:

   ```bash
   mvn clean package
   java -jar target/Java_snake-1.0.jar
   ```

> 💡 Tip: You can also double-click the generated `.jar` file from the `target` folder to run the game (if file associations are set correctly).

---

### 🖥️ Using Maven (any OS)

```bash
# Clone the repository
git clone https://github.com/mzmahid/Java_snake.git
cd Java_snake

# Compile and run
mvn clean compile exec:java
```

If that doesn’t work:

```bash
mvn clean package
java -jar target/Java_snake-1.0.jar
```

---

### 💻 Running in IDE

1. Open the folder in **IntelliJ IDEA**, **VS Code**, or **Eclipse**.
2. Import Maven dependencies automatically.
3. Run the class containing `public static void main`.

---

## 📦 Project Structure

```
Java_snake/
├── pom.xml                # Maven build file
├── src/
│   ├── main/java/         # Source code
│   └── main/resources/    # Assets (if any)
└── target/                # Compiled output (auto-generated)
```

---

## 🕹️ Controls

| Key    | Action     |
| ------ | ---------- |
| ⬆️ / W | Move Up    |
| ⬇️ / S | Move Down  |
| ⬅️ / A | Move Left  |
| ➡️ / D | Move Right |

---

## 📖 License

This project is open source and available under the [MIT License](LICENSE).

---

## ✨ Author

**Mahid Zaman**
🎮 Passionate about computer graphics, game development, and programming.
📂 GitHub: [mzmahid](https://github.com/mzmahid)
