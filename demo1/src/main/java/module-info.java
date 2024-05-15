module com.tubes.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.tubes.demo1 to javafx.fxml;
    exports com.tubes.demo1;
}