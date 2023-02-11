module com.project.joel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.project.joel to javafx.fxml;
    exports com.project.joel;
    opens com.project.models;
    exports com.project.models;
    opens com.project.dbhandler;
    exports com.project.dbhandler;
}
