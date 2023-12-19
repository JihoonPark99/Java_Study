package Lab5.assignment;

public class Invoice {
    private String partNo; // part number
    private String partDesc; // part description
    private int quantity; // quantity of the item being purchased
    private double price; // price per item

    public Invoice() {
        partNo = "";
        partDesc = "";
        quantity = 0;
        price = 0.0;
    }

    public Invoice(String partNo, String partDesc, int quantity, double price) {
        this.partNo = partNo;
        this.partDesc = partDesc;
        this.quantity = quantity;
        this.price = price;
    }

    // set method
    public void setpartNo(String partNum) {
        partNo = partNum;
        System.out.println("Part Number : " + partNo);
    }

    public void setpartDesc(String partDescending) {
        partDesc = partDescending;
        System.out.println("Part Description : " + partDesc);
    }

    public void setquantity(int qua) {
        if (qua < 0) {
            qua = 0;
        }
        quantity = qua;
        System.out.println("Quantity : " + quantity);
    }

    public void setprice(double pri) {
        if (pri < 0.0) {
            pri = 0.0;
        }
        price = pri;
        System.out.println("Price per item : " + price);
    }

    public void setInvoiceAmount(int qua, double pri) {
        if (qua < 0) {
            qua = 0;
        }
        quantity = qua;
        if (pri < 0.0) {
            pri = 0.0;
        }
        price = pri;
        System.out.println("Invoice Amount : " + price * quantity);
    }

    // get method
    public String getpartNo() {
        return partNo;
    }

    public String getpartDesc() {
        return partDesc;
    }

    public int getquantity() {
        if (quantity < 0) {
            quantity = 0;
        }
        return quantity;
    }

    public double getprice() {
        if (price < 0.0) {
            price = 0.0;
        }
        return price;
    }

    // getInvoiceAmount
    public double getInvoiceAmount() {
        return price * quantity;
    }

}
