module gauravchanda7.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens gauravchanda7.demo to javafx.fxml;
    exports gauravchanda7.demo;
}