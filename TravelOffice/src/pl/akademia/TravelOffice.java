package pl.akademia;

public class TravelOffice {

    static Customer[] customerTable = new Customer[0];



    public void addCustomer(Customer customer) {
        Customer[] newCustomerTable = new Customer[customerTable.length + 1];
        for (int i = 0; i < customerTable.length; i++) {
            newCustomerTable[i] = customerTable[i];
        }
        newCustomerTable[newCustomerTable.length - 1] = customer;
        customerTable = newCustomerTable;
    }

    public int getCustomerCount() {
        return customerTable.length;
    }

    @Override
    public String toString() {
        String result = "";
        for (Customer cust : customerTable) {
            if (cust != null) {
                result += cust.toString();
            }
        }
        return result;
    }

}





