module co.edu.uniquindio.trabajoanalisis {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.trabajoanalisis to javafx.fxml;
    exports co.edu.uniquindio.trabajoanalisis.Punto1;
    opens co.edu.uniquindio.trabajoanalisis.Punto1 to javafx.fxml;
}