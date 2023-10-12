module com.example.voting {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.voting to javafx.fxml;
    exports com.example.voting;
}