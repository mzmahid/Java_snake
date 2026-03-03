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
* **Apache Maven** (for building and running)
* **JavaFX** SDK (if not bundled with your JDK)

---

## ⚙️ How to Run

### 🖥️ Using Maven (recommended)

```bash
# Clone the repository
git clone https://github.com/mzmahid/Java_snake.git
cd Java_snake

# Compile and run the project
mvn clean compile exec:java
```

If that doesn’t work, build and run the JAR manually:

```bash
mvn clean package
java -jar target/Java_snake-1.0.jar
```

### 🧠 Manually (without Maven)

```bash
javac -d out src/main/java/**/*.java
java -cp out your.main.ClassName
```

Replace `your.main.ClassName` with the actual entry class (for example, `snake.GameApp`).

---

## 💻 Running in IDE

1. Open the project folder in **IntelliJ IDEA**, **VS Code**, or **Eclipse**.
2. Let it import the Maven dependencies automatically.
3. Run the main class (`SnakeGame`, `Main`, or equivalent) directly.

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
