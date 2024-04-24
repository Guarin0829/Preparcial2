module com.example.preparcial2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.preparcial2 to javafx.fxml;
    exports com.example.preparcial2.Punto1;
}