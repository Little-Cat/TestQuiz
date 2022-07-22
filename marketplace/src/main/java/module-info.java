module com.example.marketplace {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.data.commons;
    requires java.persistence;

    requires static lombok;

    requires org.hibernate.orm.core;
    requires spring.beans;


    opens com.example.marketplace to javafx.fxml;
    exports com.example.marketplace;
    exports com.example.marketplace.conrollers;

    exports com.example.marketplace.laucher to javafx.graphics;
    exports com.example.marketplace.services to spring.beans;
    exports com.example.marketplace.models to spring.beans;

    opens com.example.marketplace.conrollers to javafx.fxml;
}