01.01-Herencia y Polimorfismo Nivel 2

# Java Exercise - Smartphone Features

## 📄 Descripció

Aquest exercici té com a objectiu demostrar l’ús de **classes, herència i interfícies en Java**. 
Es crearà una jerarquia de classes i interfícies per representar un **Smartphone** amb funcionalitats 
de telèfon, càmera i rellotge.

---

## 📌 Exercici 1

### **Especificacions:**
1. **Classe `Telèfon`**  
   - Atributs: `marca` i `model`
   - Mètode `trucar(String numero)`: Mostra un missatge indicant que s’està trucant al número rebut.

2. **Interfície `Camera`**  
   - Mètode `fotografiar()`: Mostra per consola `"S’està fent una foto"`.

3. **Interfície `Rellotge`**  
   - Mètode `alarma()`: Mostra per consola `"Està sonant l’alarma"`.

4. **Classe `Smartphone`** *(subclasse de `Telèfon`, implementa `Camera` i `Rellotge`)*
   - Sobreescriu `trucar()`
   - Implementa `fotografiar()` i `alarma()`

5. **Main Class**  
   - Crear un objecte `Smartphone`
   - Cridar als mètodes `trucar()`, `fotografiar()` i `alarma()`

---

## 💻 Tecnologies Utilitzades

- **Java 8+**
- **Programació Orientada a Objectes (OOP)**
- **Interfícies i Herència**

---

## 📋 Requisits

Assegura’t de tenir instal·lat:

- **JDK 8 o superior**  
- **Un IDE compatible (IntelliJ IDEA, Eclipse, VS Code, NetBeans, etc.)**  

---

## 🛠️ Instal·lació

1. **Clona el repositori**  
   ```bash
   git clone https://github.com/your-repo/java-smartphone.git
