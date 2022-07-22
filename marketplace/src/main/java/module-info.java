module com.example.marketplace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.marketplace to javafx.fxml;
    exports com.example.marketplace;
}