package BT_trenlop;

public class class1_5 {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public class1_5() {
    }

    public class1_5(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal()
    {
        return unitPrice*qty;
    }

    @Override
    public String toString() {
        return "class1_5{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
