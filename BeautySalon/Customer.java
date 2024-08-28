package lab678;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable{
    
    // attributs
  @Column(name = "CustomerName")
  private String CustomerName;
  @Id
  @Column(name = "CustomerPhoneNumber")
  private long CustomerPhoneNumber;
  @Column(name = "Service")
  private String Service; 
  @Column(name = "Stylist")
  private String Stylist;  
  @Column(name = "DateTime")
  private String DateTime;
   
  // defualt construcrtors

    public Customer() {}
    
 // settter & getter

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public long getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(long CustomerPhoneNumber) {
        this.CustomerPhoneNumber = CustomerPhoneNumber;
    }

    public String getService() {
        return Service;
    }

    public void setService(String Service) {
        this.Service = Service;
    }

    public String getStylist() {
        return Stylist;
    }

    public void setStylist(String Stylist) {
        this.Stylist = Stylist;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }
 
    
}// end of the customer class
