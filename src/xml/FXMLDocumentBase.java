package xml;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.xml.XMLConstants;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class FXMLDocumentBase extends AnchorPane {

    private static final String FILENAME = "employee.xml";
    boolean found = false;
    Element root;
    int temp = 0;
    int index = 0;
    DocumentBuilderFactory dbf;
    DocumentBuilder db;
    Document doc;
    boolean flag = false;
    NodeList list;
    protected final Label name;
    protected final Label phone;
    protected final Label email;
    protected final Label address;
    protected final TextField nameTF;
    protected final TextField mobileTF;
    protected final TextField emailTF;
    protected final TextField streetTF;
    protected final Button newBtn;
    protected final Button updateBtn;
    protected final Button deleteBtn;
    protected final Button preBtn;
    protected final Button nextBtn;
    protected final Button searchBtn;
    protected final TextField homeTF;
    protected final TextField buildingTF;
    protected final TextField regTF;
    protected final TextField cityTF;
    protected final TextField countryTF;
    protected final TextField workTF;
    protected final Line line;
    protected final Line line0;
    protected final Line line1;
    protected final Label mobile;
    protected final Label home;
    protected final Label work;
    protected final Label street;
    protected final Label buildingNum;
    protected final Label region;
    protected final Label city;
    protected final Label country;

    public FXMLDocumentBase() {

        name = new Label();
        phone = new Label();
        email = new Label();
        address = new Label();
        nameTF = new TextField();
        mobileTF = new TextField();
        emailTF = new TextField();
        streetTF = new TextField();
        newBtn = new Button();
        updateBtn = new Button();
        deleteBtn = new Button();
        preBtn = new Button();
        nextBtn = new Button();
        searchBtn = new Button();
        homeTF = new TextField();
        buildingTF = new TextField();
        regTF = new TextField();
        cityTF = new TextField();
        countryTF = new TextField();
        workTF = new TextField();
        line = new Line();
        line0 = new Line();
        line1 = new Line();
        mobile = new Label();
        home = new Label();
        work = new Label();
        street = new Label();
        buildingNum = new Label();
        region = new Label();
        city = new Label();
        country = new Label();

        setId("AnchorPane");
        setPrefHeight(552.0);
        setPrefWidth(758.0);

        name.setLayoutX(31.0);
        name.setLayoutY(36.0);
        name.setText("Name");
        name.setFont(new Font(20.0));

        phone.setLayoutX(29.0);
        phone.setLayoutY(92.0);
        phone.setText("Phone");
        phone.setFont(new Font(20.0));

        email.setLayoutX(33.0);
        email.setLayoutY(192.0);
        email.setText("Email");
        email.setFont(new Font(20.0));

        address.setLayoutX(22.0);
        address.setLayoutY(246.0);
        address.setText("Address");
        address.setFont(new Font(20.0));

        nameTF.setLayoutX(226.0);
        nameTF.setLayoutY(35.0);

        mobileTF.setLayoutX(226.0);
        mobileTF.setLayoutY(81.0);
        mobileTF.setPrefHeight(31.0);
        mobileTF.setPrefWidth(187.0);

        emailTF.setLayoutX(226.0);
        emailTF.setLayoutY(198.0);

        streetTF.setLayoutX(226.0);
        streetTF.setLayoutY(245.0);

        newBtn.setLayoutX(19.0);
        newBtn.setLayoutY(479.0);
        newBtn.setMnemonicParsing(false);
        newBtn.setText("New");

        updateBtn.setLayoutX(107.0);
        updateBtn.setLayoutY(479.0);
        updateBtn.setMnemonicParsing(false);
        updateBtn.setText("Update");

        deleteBtn.setLayoutX(226.0);
        deleteBtn.setLayoutY(479.0);
        deleteBtn.setMnemonicParsing(false);
        deleteBtn.setText("Delete");

        preBtn.setLayoutX(352.0);
        preBtn.setLayoutY(479.0);
        preBtn.setMnemonicParsing(false);
        preBtn.setText("Previous");

        nextBtn.setLayoutX(484.0);
        nextBtn.setLayoutY(479.0);
        nextBtn.setMnemonicParsing(false);
        nextBtn.setText("Next");

        searchBtn.setLayoutX(599.0);
        searchBtn.setLayoutY(479.0);
        searchBtn.setMnemonicParsing(false);
        searchBtn.setText("Search");

        homeTF.setLayoutX(226.0);
        homeTF.setLayoutY(118.0);
        homeTF.setPrefHeight(31.0);
        homeTF.setPrefWidth(187.0);

        buildingTF.setLayoutX(226.0);
        buildingTF.setLayoutY(287.0);

        regTF.setLayoutX(226.0);
        regTF.setLayoutY(325.0);

        cityTF.setLayoutX(226.0);
        cityTF.setLayoutY(366.0);

        countryTF.setLayoutX(226.0);
        countryTF.setLayoutY(408.0);

        workTF.setLayoutX(226.0);
        workTF.setLayoutY(155.0);
        workTF.setPrefHeight(31.0);
        workTF.setPrefWidth(187.0);

        line.setEndX(152.0);
        line.setEndY(62.0);
        line.setLayoutX(4.0);
        line.setLayoutY(11.0);
        line.setStartX(450.5);
        line.setStartY(62.0);

        line0.setEndX(148.0);
        line0.setEndY(173.0);
        line0.setLayoutX(14.0);
        line0.setLayoutY(21.0);
        line0.setStartX(451.5);
        line0.setStartY(173.0);

        line1.setEndX(143.0);
        line1.setEndY(203.0);
        line1.setLayoutX(24.0);
        line1.setLayoutY(31.0);
        line1.setStartX(440.0);
        line1.setStartY(203.0);

        mobile.setLayoutX(159.0);
        mobile.setLayoutY(86.0);
        mobile.setText("Mobile");
        mobile.setTextFill(javafx.scene.paint.Color.RED);

        home.setLayoutX(161.0);
        home.setLayoutY(123.0);
        home.setText("Home");
        home.setTextFill(javafx.scene.paint.Color.RED);

        work.setLayoutX(164.0);
        work.setLayoutY(160.0);
        work.setText("Work");
        work.setTextFill(javafx.scene.paint.Color.RED);

        street.setLayoutX(167.0);
        street.setLayoutY(251.0);
        street.setText("Street");
        street.setTextFill(javafx.scene.paint.Color.RED);

        buildingNum.setLayoutX(103.0);
        buildingNum.setLayoutY(292.0);
        buildingNum.setText("Building Number");
        buildingNum.setTextFill(javafx.scene.paint.Color.RED);

        region.setLayoutX(164.0);
        region.setLayoutY(330.0);
        region.setText("Region");
        region.setTextFill(javafx.scene.paint.Color.RED);

        city.setLayoutX(174.0);
        city.setLayoutY(371.0);
        city.setText("City");
        city.setTextFill(javafx.scene.paint.Color.RED);

        country.setLayoutX(161.0);
        country.setLayoutY(413.0);
        country.setText("Country");
        country.setTextFill(javafx.scene.paint.Color.RED);

        getChildren().add(name);
        getChildren().add(phone);
        getChildren().add(email);
        getChildren().add(address);
        getChildren().add(nameTF);
        getChildren().add(mobileTF);
        getChildren().add(emailTF);
        getChildren().add(streetTF);
        getChildren().add(newBtn);
        getChildren().add(updateBtn);
        getChildren().add(deleteBtn);
        getChildren().add(preBtn);
        getChildren().add(nextBtn);
        getChildren().add(searchBtn);
        getChildren().add(homeTF);
        getChildren().add(buildingTF);
        getChildren().add(regTF);
        getChildren().add(cityTF);
        getChildren().add(countryTF);
        getChildren().add(workTF);
        getChildren().add(line);
        getChildren().add(line0);
        getChildren().add(line1);
        getChildren().add(mobile);
        getChildren().add(home);
        getChildren().add(work);
        getChildren().add(street);
        getChildren().add(buildingNum);
        getChildren().add(region);
        getChildren().add(city);
        getChildren().add(country);
        parseXML();

        nextBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                index++;
                parseXML();
            }
        });
        preBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                index--;
                parseXML();
            }
        });
        newBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                insertItem();

            }
        });
        searchBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                search();

            }
        });
        updateBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                updateElementValue();

            }
        });
        deleteBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                deleteItem();

            }
        });

    }

    public void parseXML() {
        dbf = DocumentBuilderFactory.newInstance();

        try {
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            db = dbf.newDocumentBuilder();
            doc = db.parse(new File(FILENAME));
            doc.getDocumentElement().normalize();
            root = doc.getDocumentElement();

            System.out.println("Root Element :" + root.getNodeName());
            System.out.println("------");
            list = doc.getElementsByTagName("employee");
            if (index < list.getLength() && index >= 0) {
                Node node = list.item(index);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String name = element.getElementsByTagName("name").item(temp).getTextContent();
                    NodeList phoneNodeList = element.getElementsByTagName("phones");
                    Node nodePhone = phoneNodeList.item(temp);
                    Element elementPhone = (Element) nodePhone;
                    String mobileNum = elementPhone.getElementsByTagName("phone").item(temp).getTextContent();
                    String homeNum = elementPhone.getElementsByTagName("phone").item(temp + 1).getTextContent();
                    String workNum = elementPhone.getElementsByTagName("phone").item(temp + 2).getTextContent();

                    mobileTF.setText(mobileNum);
                    homeTF.setText(homeNum);
                    workTF.setText(workNum);
                    NodeList addNodeList = element.getElementsByTagName("address");
                    Node nodeAdd = addNodeList.item(temp);
                    Element elementAdd = (Element) nodeAdd;
                    String street = elementAdd.getElementsByTagName("street").item(temp).getTextContent();
                    String building = elementAdd.getElementsByTagName("Building_Number").item(temp).getTextContent();
                    String region = elementAdd.getElementsByTagName("Region").item(temp).getTextContent();
                    String city = elementAdd.getElementsByTagName("City").item(temp).getTextContent();
                    String country = elementAdd.getElementsByTagName("Country").item(temp).getTextContent();
                    streetTF.setText(street);
                    buildingTF.setText(building);
                    regTF.setText(region);
                    cityTF.setText(city);
                    countryTF.setText(country);

                    nameTF.setText(name);
                    String email = element.getElementsByTagName("email").item(temp).getTextContent();
                    emailTF.setText(email);

                }

            } else {
                index = 0;
                parseXML();
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void insertItem() {
        if (flag == false) {
            nameTF.setText("");
            mobileTF.setText("");
            homeTF.setText("");
            workTF.setText("");
            streetTF.setText("");
            regTF.setText("");
            cityTF.setText("");
            countryTF.setText("");
            buildingTF.setText("");
            emailTF.setText("");

            newBtn.setText("Save");
            flag = true;
        } else {
            try {
                Element p = doc.createElement("employee");
                root.appendChild(p);
                Element name = doc.createElement("name");
                name.appendChild(doc.createTextNode(nameTF.getText()));
                p.appendChild(name);
                Element phones = doc.createElement("phones");
                p.appendChild(phones);
                Element phoneMob = doc.createElement("phone");
                phoneMob.appendChild(doc.createTextNode(mobileTF.getText()));
                phones.appendChild(phoneMob);
                phoneMob.setAttribute("type", "mobile");
                Element phoneHome = doc.createElement("phone");
                phoneHome.appendChild(doc.createTextNode(homeTF.getText()));
                phones.appendChild(phoneHome);
                phoneHome.setAttribute("type", "home");
                Element phoneWork = doc.createElement("phone");
                phoneWork.appendChild(doc.createTextNode(workTF.getText()));
                phones.appendChild(phoneWork);
                phoneWork.setAttribute("type", "work");
                Element addresses = doc.createElement("addresses");
                p.appendChild(addresses);
                Element address = doc.createElement("address");
                addresses.appendChild(address);
                Element street = doc.createElement("street");
                street.appendChild(doc.createTextNode(streetTF.getText()));
                address.appendChild(street);
                Element building = doc.createElement("Building_Number");
                building.appendChild(doc.createTextNode(buildingTF.getText()));
                address.appendChild(building);
                Element region = doc.createElement("Region");
                region.appendChild(doc.createTextNode(regTF.getText()));
                address.appendChild(region);
                Element city = doc.createElement("City");
                city.appendChild(doc.createTextNode(cityTF.getText()));
                address.appendChild(city);
                Element country = doc.createElement("Country");
                country.appendChild(doc.createTextNode(countryTF.getText()));
                address.appendChild(country);
                Element email = doc.createElement("email");
                email.appendChild(doc.createTextNode(emailTF.getText()));
                p.appendChild(email);

                System.out.println(nameTF.getText());
                TransformerFactory factory = TransformerFactory.newInstance();
                Transformer transformer = factory.newTransformer();
                DOMSource domSource = new DOMSource(doc);
                StreamResult streamResult = new StreamResult(new File(FILENAME));
                transformer.transform(domSource, streamResult);

                DOMSource source = new DOMSource(doc);

                newBtn.setText("New");
                flag = false;
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void deleteItem() {

        try {
            NodeList employees = doc.getElementsByTagName("employee");
            Element employee = null;
            String nameInserted = nameTF.getText();
            for (int i = 0; i < employees.getLength(); i++) {
                Node node = employees.item(i);
                employee = (Element) node;
                String name = employee.getElementsByTagName("name").item(0).getTextContent();
                if (nameInserted.equals(name)) {
                    employee.getParentNode().removeChild(node);
                    System.out.println("removed" + name);

                }
            }
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            DOMSource domSource = new DOMSource(doc);
            StreamResult streamResult = new StreamResult(new File(FILENAME));
            transformer.transform(domSource, streamResult);
            DOMSource source = new DOMSource(doc);
            nameTF.setText("");
            mobileTF.setText("");
            homeTF.setText("");
            workTF.setText("");
            streetTF.setText("");
            regTF.setText("");
            cityTF.setText("");
            countryTF.setText("");
            buildingTF.setText("");
            emailTF.setText("");

        } catch (TransformerException ex) {
            Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void search() {
        if (flag == false) {
            nameTF.setText("");
            mobileTF.setText("");
            homeTF.setText("");
            workTF.setText("");
            streetTF.setText("");
            regTF.setText("");
            cityTF.setText("");
            countryTF.setText("");
            buildingTF.setText("");
            emailTF.setText("");
            flag = true;
        } else {
            String nameInserted = nameTF.getText();
            NodeList l = doc.getElementsByTagName("employee");

            for (int i = 0; i < l.getLength(); ++i) {
                found = false;
                Node node = list.item(i);
                Element element = (Element) node;
                String name = element.getElementsByTagName("name").item(temp).getTextContent();

                if (nameInserted.equals(name)) {
                    NodeList phoneNodeList = element.getElementsByTagName("phones");
                    Node nodePhone = phoneNodeList.item(temp);
                    Element elementPhone = (Element) nodePhone;
                    String mobileNum = elementPhone.getElementsByTagName("phone").item(temp).getTextContent();
                    String homeNum = elementPhone.getElementsByTagName("phone").item(temp + 1).getTextContent();
                    String workNum = elementPhone.getElementsByTagName("phone").item(temp + 2).getTextContent();

                    mobileTF.setText(mobileNum);
                    homeTF.setText(homeNum);
                    workTF.setText(workNum);
                    NodeList addNodeList = element.getElementsByTagName("address");
                    Node nodeAdd = addNodeList.item(temp);
                    Element elementAdd = (Element) nodeAdd;
                    String street = elementAdd.getElementsByTagName("street").item(temp).getTextContent();
                    String building = elementAdd.getElementsByTagName("Building_Number").item(temp).getTextContent();
                    String region = elementAdd.getElementsByTagName("Region").item(temp).getTextContent();
                    String city = elementAdd.getElementsByTagName("City").item(temp).getTextContent();
                    String country = elementAdd.getElementsByTagName("Country").item(temp).getTextContent();
                    streetTF.setText(street);
                    buildingTF.setText(building);
                    regTF.setText(region);
                    cityTF.setText(city);
                    countryTF.setText(country);

                    nameTF.setText(name);
                    String email = element.getElementsByTagName("email").item(temp).getTextContent();
                    emailTF.setText(email);
                    flag = false;
                    found = true;
                    break;

                }
            }
            if (found == false) {
                Alert a = new Alert(AlertType.WARNING);
                a.setContentText("No Employee Found!");
                a.setTitle("Try again");
                a.show();
                nameTF.setText("");
                flag = true;

            }
        }
    }

    public void updateElementValue() {
        
        try {
            NodeList employees = doc.getElementsByTagName("employee");
            Element employee = null;
            String nameInserted = nameTF.getText();
            String emailInserted;
            String mobileInserted;
            String homeInserted;
            String workInserted;
            String streetInserted;
            String buildingInserted;
            String regionInserted;
            String cityInserted;
            String countryInserted;
            // loop for each user
            for (int i = 0; i < employees.getLength(); i++) {
                Node node = employees.item(i);
                employee = (Element) node;
                String name = employee.getElementsByTagName("name").item(0).getTextContent();
                if (nameInserted.equals(name)) {
                    emailInserted = emailTF.getText();
                    mobileInserted = mobileTF.getText();
                    homeInserted = homeTF.getText();
                    workInserted = workTF.getText();
                    streetInserted = streetTF.getText();
                    buildingInserted = buildingTF.getText();
                    regionInserted = regTF.getText();
                    cityInserted = cityTF.getText();
                    countryInserted = countryTF.getText();

                    employee.getElementsByTagName("email").item(0).setTextContent(emailInserted);
                    NodeList phoneNodeList = employee.getElementsByTagName("phones");
                    Node nodePhone = phoneNodeList.item(temp);
                    Element elementPhone = (Element) nodePhone;
                    elementPhone.getElementsByTagName("phone").item(temp).setTextContent(mobileInserted);
                    elementPhone.getElementsByTagName("phone").item(temp + 1).setTextContent(homeInserted);
                    elementPhone.getElementsByTagName("phone").item(temp + 2).setTextContent(workInserted);
                    NodeList addNodeList = employee.getElementsByTagName("address");
                    Node nodeAdd = addNodeList.item(temp);
                    Element elementAdd = (Element) nodeAdd;
                    elementAdd.getElementsByTagName("street").item(temp).setTextContent(streetInserted);
                    elementAdd.getElementsByTagName("Building_Number").item(temp).setTextContent(buildingInserted);
                    elementAdd.getElementsByTagName("Region").item(temp).setTextContent(regionInserted);
                    elementAdd.getElementsByTagName("City").item(temp).setTextContent(cityInserted);
                    elementAdd.getElementsByTagName("Country").item(temp).setTextContent(countryInserted);

                    System.out.println("updated" + name);
                }

            }

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            DOMSource domSource = new DOMSource(doc);
            StreamResult streamResult = new StreamResult(new File(FILENAME));
            transformer.transform(domSource, streamResult);

            DOMSource source = new DOMSource(doc);
        } catch (TransformerException ex) {
            Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void checkValidation() {
        String name = nameTF.getText();
        String email = emailTF.getText();
        String mobile = mobileTF.getText();
        String work = workTF.getText();
        String home = homeTF.getText();
        String street = streetTF.getText();
        String building = buildingTF.getText();
        String region = regTF.getText();
        String city = cityTF.getText();
        String country = countryTF.getText();
        if (name == "") {
            Alert a = new Alert(AlertType.WARNING);
            a.setContentText("Please Enter employee name");
            a.setTitle("Try again");
            a.show();

        }
        else if (email == "") {
            Alert a = new Alert(AlertType.WARNING);
            a.setContentText("Please Enter employee email");
            a.setTitle("Try again");
            a.show();

        }
        else if (mobile == "") {
            Alert a = new Alert(AlertType.WARNING);
            a.setContentText("Please Enter employee mobile number");
            a.setTitle("Try again");
            a.show();

        }
        else if (work == "") {
            Alert a = new Alert(AlertType.WARNING);
            a.setContentText("Please Enter employee work number");
            a.setTitle("Try again");
            a.show();

        }
        else if (home == "") {
            Alert a = new Alert(AlertType.WARNING);
            a.setContentText("Please Enter employee home number");
            a.setTitle("Try again");
            a.show();

        }
        else if (street == "") {
            Alert a = new Alert(AlertType.WARNING);
            a.setContentText("Please Enter employee street");
            a.setTitle("Try again");
            a.show();

        }
        else if (building == "") {
            Alert a = new Alert(AlertType.WARNING);
            a.setContentText("Please Enter employee buliding number");
            a.setTitle("Try again");
            a.show();

        }
        else if (region == "") {
            Alert a = new Alert(AlertType.WARNING);
            a.setContentText("Please Enter employee region");
            a.setTitle("Try again");
            a.show();

        }
        else if (city == "") {
            Alert a = new Alert(AlertType.WARNING);
            a.setContentText("Please Enter employee city");
            a.setTitle("Try again");
            a.show();

        }
        else if (country == "") {
            Alert a = new Alert(AlertType.WARNING);
            a.setContentText("Please Enter employee country");
            a.setTitle("Try again");
            a.show();

        }

    }

}
