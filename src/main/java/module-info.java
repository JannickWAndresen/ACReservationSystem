module com.acreservationsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.acreservationsystem.view to javafx.fxml;
    exports com.acreservationsystem.view;
}