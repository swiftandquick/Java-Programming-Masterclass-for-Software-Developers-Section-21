module academy.learnprogramming.ui {

    requires javafx.base;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires academy.learnprogramming.db;

    /* By exporting a package to JavaFX module, JavaFX launcher should be able to launch the package.  */
    exports academy.learnprogramming.ui to javafx.graphics, javafx.fxml;

    opens academy.learnprogramming.ui to javafx.fxml;

}