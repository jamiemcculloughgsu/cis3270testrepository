module edu.gsu.cis3270.cis3270testrepository {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens edu.gsu.cis3270.cis3270testrepository to javafx.fxml;
    exports edu.gsu.cis3270.cis3270testrepository;
}