module com.acreservationsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires jdk.unsupported.desktop;

    opens com.acreservationsystem.view to javafx.fxml;
    opens com.acreservationsystem.controller to javafx.fxml;
    opens com.acreservationsystem.model to javafx.graphics;
    exports com.acreservationsystem.view;
}