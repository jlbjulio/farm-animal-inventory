# Farm Animal Inventory

This Java project implements a basic inventory system for managing different types of farm animals, such as chickens and cows. It is designed using object-oriented programming principles and provides a simple command-line interface to interact with the data.

## Features

- **Object-oriented structure** using abstract classes and inheritance.
- **Animal types implemented**:
  - `Gallina` (Chicken): Includes weight and egg-laying status.
  - `Vaca` (Cow): Includes weight and milk production status.
- **Inventory management classes**:
  - `InventarioG`: Manages chicken entries.
  - `InventarioV`: Manages general animal entries (chickens, cows, etc.).
- Console interface to add and view animals dynamically.

## Technologies Used

- Java 17 or compatible version
- Object-Oriented Programming (OOP)
- CLI interaction via `Scanner` and `System.out`

## How to Compile and Run

1. **Clone this repository:**
   ```bash
   git clone https://github.com/your-username/farm-animal-inventory.git
   cd farm-animal-inventory
   ```

2. **Compile the project:**
   ```bash
   javac *.java
   ```

3. **Run the application:**
   ```bash
   java Main
   ```

## File Structure

- `Main.java`: Entry point with CLI menu for managing animals.
- `Animal.java`: Abstract base class for all animals.
- `Gallina.java`: Subclass representing chickens.
- `Vaca.java`: Subclass representing cows.
- `InventarioG.java`: Chicken-specific inventory handler.
- `InventarioV.java`: General inventory for all animals.

## Example CLI Output

```
--- Farm Animal Inventory ---
1. Add new chicken
2. Add new cow
3. Show all animals
4. Exit
Choose an option:
```

## Author

This repository was developed as part of the course **Aprendizaje Automático** by **Julio Lara**, from the **Licenciatura en Ingeniería de Sistemas y Computación** career at the **Universidad Tecnológica de Panamá (UTP)**.

---

> **Note**: This project was originally developed in Spanish. The README is written in English for documentation and sharing purposes.
