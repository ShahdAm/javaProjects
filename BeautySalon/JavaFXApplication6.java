package lab678;

import java.io.FileWriter;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.text.FontPosture;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class JavaFXApplication6 extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        //labels
        Label LCname = new Label("Customer Name: ");
        Label LCPhoneNumber = new Label("Customer Mobile Number: ");
        Label LService = new Label("Service: ");
        Label LStylist = new Label("Stylist: ");
        Label Ldate = new Label("Date: ");
        Label Ltime = new Label("Time: ");

        //hidden label - error massage -
        Label lbmsg = new Label();
        lbmsg.setTextFill(Color.RED);

        //text fields for labels
        TextField TCname = new TextField();
        TextField TCPhoneNumber = new TextField();

        //datepicker for date
        DatePicker datePec = new DatePicker();
        datePec.setValue(LocalDate.now());

        //srvices combobox
        ComboBox<String> comService = new ComboBox();
        comService.getItems().addAll("Hair-cutting", "Hair-Styling", "Hair-Coloring", "Makeup", "Manicures and Pedicures", "Facials and skin care treatments");
        comService.setValue("Hair-cutting");

        //time combobox
        ComboBox<String> comTime = new ComboBox();
        comTime.getItems().addAll("4:00PM", "5:00PM", "6:00PM", "7:00PM", "8:00PM", "9:00PM", "10:00PM", "11:00PM");
        comTime.setValue("4:00PM");

        //list view for stylists
        ListView stylistList = new ListView();
        stylistList.setMaxSize(200, 200);
        stylistList.getItems().addAll("Mona", "Huda", "Emmy");
        stylistList.getSelectionModel().select(0);

        //buttons
        Button bookService = new Button("Book Service");
        Button Delete = new Button("Delete");
        Button Bthree = new Button("Clear");
        Button File = new Button("Export to file");

        // put it all buttons in the hbox
        HBox buttons = new HBox(20);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(bookService, Delete, Bthree,File);

        //first gridpane
        GridPane pane = new GridPane();
        
        // inside gridpane lable, combobox, .... 
        pane.add(LCname, 0, 0);
        pane.add(TCname, 1, 0);
        pane.add(LCPhoneNumber, 0, 1);
        pane.add(TCPhoneNumber, 1, 1);
        pane.add(LService, 0, 2);
        pane.add(comService, 1, 2);
        pane.add(LStylist, 2, 2);
        pane.add(stylistList, 3, 2);
        pane.add(Ldate, 0, 3);
        pane.add(datePec, 1, 3);
        pane.add(Ltime, 0, 4);
        pane.add(comTime, 1, 4);
        pane.add(lbmsg, 1, 5);

        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);

        // inside vbox the gridpane & buttons
        VBox vbox1 = new VBox(20);
        vbox1.getChildren().addAll(pane, buttons);
        vbox1.setAlignment(Pos.CENTER);

        //ObservableLists
        ObservableList<String> Cname = FXCollections.observableArrayList();
        ObservableList<String> CPhoneNumber = FXCollections.observableArrayList();
        ObservableList<String> Service = FXCollections.observableArrayList();
        ObservableList<String> Stylist = FXCollections.observableArrayList();
        ObservableList<String> date = FXCollections.observableArrayList();

        ListView lvCname = new ListView(Cname);
        ListView lvCPhoneNumber = new ListView(CPhoneNumber);
        ListView lvService = new ListView(Service);
        ListView lvStylist = new ListView(Stylist);
        ListView lvDate = new ListView(date);
        
        // DataBase Part
        // retreve the data form mysql
            
        List<Customer> Customer = new ArrayList<>();// creat an arraylist of Customer
        Session ss = HibernateUtil.getSessionFactory().openSession(); // creat a connection channel btween mysql & netbeans 
        Query q = ss.createQuery("from Customer");// return all Customer data in the table
        Customer = q.list(); // put it the query in the arraylist
        // creat a for each for observablelist
        for ( Customer i : Customer)
        {
        Cname.add(i.getCustomerName());
        CPhoneNumber.add(String.valueOf(i.getCustomerPhoneNumber()));// method valueOf convert the long type into string type
        Service.add(i.getService());
        Stylist.add(i.getStylist());
        date.add(i.getDateTime());
        }

    // after regesteration will display all data
        VBox VBCname = new VBox(10);
        VBCname.getChildren().addAll(new Label("Customer Name: "), new ScrollPane(lvCname));

        VBox VBCPhoneNumber = new VBox(10);
        VBCPhoneNumber.getChildren().addAll(new Label("Customer Phone Number: "), new ScrollPane(lvCPhoneNumber));

        VBox VBService = new VBox(10);
        VBService.getChildren().addAll(new Label("Service: "), new ScrollPane(lvService));

        VBox VBStylist = new VBox(10);
        VBStylist.getChildren().addAll(new Label("Stylist: "), new ScrollPane(lvStylist));

        VBox VBdate = new VBox(10);
        VBdate.getChildren().addAll(new Label("Date and Time: "), new ScrollPane(lvDate));
        
        // added vbox in the hbox
        HBox hbox2 = new HBox(10);
        hbox2.getChildren().addAll(VBCname, VBCPhoneNumber, VBService, VBStylist, VBdate);
        hbox2.setAlignment(Pos.CENTER);

        //button next page and back
        Button NextScene = new Button("Next Scene");
        Button Back = new Button("Back");

        HBox HBnext = new HBox(20);
        HBnext.getChildren().add(NextScene);
        HBnext.setAlignment(Pos.BOTTOM_RIGHT);
        HBnext.setPadding(new Insets(20));

        HBox Hbox3 = new HBox(20);
        Hbox3.getChildren().add(Back);
        Hbox3.setAlignment(Pos.BOTTOM_RIGHT);
        
        // added all the first page contant
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20));
        root.setTop(vbox1);
        root.setCenter(hbox2);
        root.setBottom(HBnext);

        Scene scene = new Scene(root, 1000, 700);

        
        // 2nd scene
        Label LCPhoneNumber2 = new Label("Enter Customer Mobile Number: ");
        TextField TCPhoneNumber2 = new TextField();
        Button button = new Button("Print Invoice");
        Label msg = new Label();
        msg.setTextFill(Color.BROWN);
//        msg.setTranslateX(2);
        msg.setFont(new Font(15.0));
        msg.setTranslateY(30);

        
        HBox PhN = new HBox(LCPhoneNumber2, TCPhoneNumber2, button,msg);
        PhN.setAlignment(Pos.TOP_LEFT);
        PhN.setSpacing(10);

        Label CInvoice = new Label("Customer Invoice");
       // Label Invo = new Label();
        CInvoice.setFont(Font.font("", FontWeight.BOLD, 30));

        // will appeard the invoice of the inside 
        HBox Htitle = new HBox(50);
     //   Invo.setPadding(new Insets(10));
        Htitle.getChildren().add(CInvoice);
        Htitle.setAlignment(Pos.CENTER);

        BorderPane pane2 = new BorderPane();

        pane2.setMaxWidth(950);
        pane2.setMinWidth(950);
        pane2.setMaxHeight(950);
        pane2.setMinHeight(550);
        pane2.setStyle("-fx-border-color: black;");
        pane2.setTop(Htitle);

        // added the second content of the page
        VBox root2 = new VBox();
        root2.setPadding(new Insets(20));
        root2.getChildren().addAll(PhN, pane2, Hbox3);
        root2.setAlignment(Pos.TOP_LEFT);
        root2.setSpacing(30);

        Scene NextScenee = new Scene(root2, 1000, 700);

        //event handler
        //next scene
        NextScene.setOnAction(e -> {
            primaryStage.setScene(NextScenee);
            primaryStage.setTitle("Invoice");
        });

        //back
        Back.setOnAction(e
                -> {
            primaryStage.setScene(scene);
            primaryStage.setTitle("Beauty Salon");
        });

        //Services with stylists
        comService.setOnAction(e -> {
            stylistList.getItems().clear();
            switch (comService.getValue()) {
                case "Hair-cutting":
                case "Hair-Coloring":
                case "Hair-Styling":
                    stylistList.getItems().add("Mona");
                    stylistList.getItems().add("Huda");
                    stylistList.getItems().add("Emmy");
                    break;
                case "Makeup":
                    stylistList.getItems().add("Hind");
                    stylistList.getItems().add("Lona");
                    break;
                case "Manicures and Pedicures":
                    stylistList.getItems().add("Majdoleen");
                    break;
                case "Facials and skin care treatments":
                    stylistList.getItems().add("Sonya");
                    break;
                default:
                    break;
            }
        });
//        //task 1, 2.1
        bookService.setOnAction(e -> {
            if (TCname.getText().equals("") || TCPhoneNumber.getText().equals("")) {
                lbmsg.setText("Enter Customer name and Mobile phone");
            } else if (TCPhoneNumber.getText().matches("[aA-zZ ]+$")) {
                lbmsg.setText("Mobile number must be digit only");
            } else if (TCPhoneNumber.getLength() != 10) {
                lbmsg.setText("The length of mobile number must be 10 digits");
            } else if (Stylist.contains(stylistList.getSelectionModel().getSelectedItem()) && date.contains(datePec.getValue().toString() + " at " + comTime.getValue())) {
                lbmsg.setText("Stylist busy at this time");
            } else {
           //DataBase Part     
                Customer cus = new Customer();// creat an object od Customer class
                // setter to Customer
                cus.setCustomerName(TCname.getText());
                cus.setCustomerPhoneNumber(Long.parseLong(TCPhoneNumber.getText()));// to mapped two type
                cus.setService(comService.getValue());
                cus.setStylist(stylistList.getSelectionModel().getSelectedItem().toString());
                cus.setDateTime(datePec.getValue().toString() + " at " + comTime.getValue());
                
               // connection channel
                Session s = HibernateUtil.getSessionFactory().openSession();
                // creat an object of transaction
                Transaction t = s.beginTransaction();
                // to save a data in the database
                s.save(cus);
                // to confirem a save 
                t.commit();
                // close the session
                s.close();
                
                 // observable list
                Cname.add(TCname.getText());
                CPhoneNumber.add(TCPhoneNumber.getText());
                Service.add(comService.getValue());
                Stylist.add(stylistList.getSelectionModel().getSelectedItem().toString());
                date.add(datePec.getValue().toString() + " at " + comTime.getValue());
            }
        });
        
        //task 2.2
        Label msg1 = new Label();
        msg1.setTextFill(Color.BLACK);
        msg1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50));

        Delete.setOnAction(e -> {
            int DelAction = lvService.getSelectionModel().getSelectedIndex();
             //DataBase Part   
             
             // for read from observablelist
            Customer cus = new Customer();// creat an object od Customer class
            // setter to Customer
            cus.setCustomerName(Cname.get(DelAction));
            cus.setCustomerPhoneNumber(Long.parseLong(CPhoneNumber.get(DelAction)));// to mapped two type
            cus.setService(Service.get(DelAction));
            cus.setStylist(Stylist.get(DelAction));
            cus.setDateTime(date.get(DelAction));
            
            // connection channel
            Session s = HibernateUtil.getSessionFactory().openSession();
            // creat an object of transaction
            Transaction t = s.beginTransaction();
            // to save a data in the database
            s.delete(cus);
            // to confirem a save 
            t.commit();
            // close the session
            s.close();

            // then delated from database
            Cname.remove(DelAction);
            CPhoneNumber.remove(DelAction);
            Service.remove(DelAction);
            Stylist.remove(DelAction);
            date.remove(DelAction);
            msg1.setText("Customer" + Cname + "was deleted");
            
        });

        
                
        // Task2.3
        // ActionEvent on the "clear" Button  
        Bthree.setOnAction(e -> {
            TCname.setText("");
            stylistList.getSelectionModel().select(0);
            comService.getSelectionModel().select(0);
            datePec.setValue(LocalDate.now());
            comTime.getSelectionModel().select(0);
            TCPhoneNumber.setText("");
            
                });
 
         // Task3       
        // ActionEvent on the “Print Invoice” button:
         Label l=new Label("");
        button.setOnAction((ActionEvent e) -> {
            
            String numphone = TCPhoneNumber2.getText();
            if (numphone.isEmpty())
            { msg.setText("Enter the customer mobile number to print invoice");
                 }
            
            else if (CPhoneNumber.isEmpty())
              {msg.setText("No customers in the list.");
                l.setText("customer name:");
                l.setText("Mobile number:");
                l.setText("Services:");
                l.setText("Services:");
                l.setText("Time and Date:");
                l.setText("Total invoice prace:");
              }
            
            else {  
                    boolean obphone = false;
                    double totalPrice =0.0;
                  
//                  if(CPhoneNumber.contains(obphone))
//                  {msg.setText("The customer not found.");}// end if 
  
                    for(int i=0; i<CPhoneNumber.size(); i++)
                    { if (CPhoneNumber.get(i).equals(numphone))
                    {   obphone = true;
                         String namedisplay = Cname.get(i);
                         String invoice = "Customer Name: " + namedisplay + "\n";
                                invoice += "Mobile Number: " + numphone + "\n";
                                invoice += "Services:\n";
//                                invoice += "Stylist:\n";
//                                invoice += "date:\n";
 
                      for (int j = i; j < CPhoneNumber.size(); j++)
                      {if (CPhoneNumber.get(j).equals(numphone))
                         {String service = Service.get(j);
                         double price = CalculateOfthePrice(service);
                         totalPrice += price;
                         String stylist = Stylist.get(j);
                         String dateTime = date.get(j);
                         
                        invoice += "- Service: " + service + "\n";
                        invoice += " Stylist: " + stylist + "\n";
                        invoice += " Date and Time: " + dateTime + "\n";
                         }// end if
                          }// end for
                      
                        invoice += "Total Invoice Price: " + totalPrice;
                      //System.out.println(invoice);
                        l.setText(invoice);
                        break;
                        }
                        }
            
                    
                  if (!obphone) {
                        // Display error message if customer not found
                    msg.setText("The customer not found.");
                        l.setText("");}
            }


              });
         pane2.setLeft(l);
// // ActionEvent on the “Print Invoice” button:
//        Label l=new Label("");
//        button.setOnAction(e -> {
//            String numphone = TCPhoneNumber2.getText();
//            if (numphone.isEmpty()) {
//                msg.setText("Enter the customer mobile number to print invoice");
//            } else if (CPhoneNumber.isEmpty()) {
//                msg.setText("No customers in the list.");
//            } else if (!CPhoneNumber.contains(numphone)) {
//                msg.setText("The customer not found.");
//            }// end if 
//            
//            
//            else {  //boolean obphone = false;
//                double CalculateOfthePrice = 0.0;
//                double pric = 0.0;
//                String invoice="";
//                int index;
//                index=CPhoneNumber.indexOf(numphone);
//                
//               
//                        invoice = "Customer Name: " + Cname.get(index)+ "\n";
//                        invoice += "Mobile Number: " + numphone + "\n";
//                        invoice += "Services:\n"+Service.get(index);
//                        invoice += "Stylist:\n"+Stylist.get(index);
//                        invoice += "date:\n"+date.get(index);
//       switch (Service.get(0)) {
//                            case " Hair-cutting":
//                                pric = 80;
//                                break;
//                            case "Hair-Styling":
//                                pric = 150;
//                                break;
//                            case " Hair-Coloring ":
//                                pric = 500;
//                                break;
//                            case "Makeup":
//                                pric = 500;
//                                break;
//                            case "Manicures":
//                                pric = 100;
//                                break;
//                            case " Pedicures":
//                                pric = 150;
//                                break;
//                            case "  Facials and skin care treatments":
//                                pric = 300;
//                                break;
//                        }// end switch
//                        CalculateOfthePrice = pric;
//                        invoice += "Total Invoice Price: " + CalculateOfthePrice;
//                        l.setText(invoice);
//                         
//                            }// end else
//        });//l block
//        pane2.setCenter(l);
//   
//
//        
       

                //Task4
        File.setOnAction(e -> {
                     try {
                FileWriter writting = new FileWriter("salon.txt");
                for (String s : Cname) {
                    String line = s + " " + CPhoneNumber.get(Cname.indexOf(s)) + " "
                            + Service.get(Cname.indexOf(s)) +
                            " " + Stylist.get(Cname.indexOf(s)) +
                            " " + date.get(Cname.indexOf(s)) +"\n";
                    writting.write(line);
                }
                writting.close();
            } catch (IOException ex) {
                Logger.getLogger(JavaFXApplication6.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        
        primaryStage.setTitle("Beauty Salon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }// end of the main 
     private double CalculateOfthePrice (String service){
 
    
         double pric =0.0;
                        
                     switch(service){
                     case "Hair-cutting":
                     { pric= 80;
                         break;}
                      case "Hair-Styling":
                      {  pric = 150;
                          break;}
                      case "Hair-Coloring":
                      {pric = 500;
                          break;}
                      case "Makeup":
                      { pric = 500;
                          break;}
                      case "Manicures and Pedicures":
                      { pric = 100;
                          break;}  
                      case "Facials and skin care treatments":
                      { pric = 300;
                          break;}
                     }// end switch
    return pric;
    }      
}



