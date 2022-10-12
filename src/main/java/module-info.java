module com.example.asn2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.asn2 to javafx.fxml;
    exports com.example.asn2;
}