package com.example.marketplace;

import com.example.marketplace.laucher.JavaFxLauncher;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootstrapLauncher {
    public static void main(String[] args) {
        Application.launch(JavaFxLauncher.class, args);
    }
}
