# prog-meth-final
Final Project of 2110215 Programming Methodology I

# Setup for development
1. clone and open the project in IntelliJ IDEA 🗿
2. go to File > Project Structure > Libraries > click + button > Java
3. select the lib folder inside the repo, then apply and ok
4. now we setup run options, go to Run > Edit Configuration > click + > Application
5. set the name to anything (preferably "JavaFX")

6. select Main class (if exist)
<img width="500" alt="image" src="https://github.com/PakornBank/prog-meth-final/assets/141616126/d2e4d628-eaeb-4155-87c1-128f3a38c0a0">

7. click Modify options (blue text with drop-down arrow) > Add VM options
<img width="500" alt="Screenshot 2024-04-23 at 22 08 42" src="https://github.com/PakornBank/prog-meth-final/assets/141616126/aa28d756-cbb8-4556-b3e0-b1ec7497efef">


8. add this line to VM options <br />

```
--module-path "./lib" --add-modules javafx.controls,javafx.fxml
```

9. Apply and OK, now we can finally run JavaFX on our machine 😭
