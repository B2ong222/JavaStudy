package Class1;

class ProductOrder {
    private String productName;
    private int price;
    private int quantity;

    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void printOrderInfo() {
        System.out.println("상품명: " + productName + ", 가격: " + price + ", 수량: " + quantity);
    }
}

public class ClassEx4 {
     static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[] {
                new ProductOrder("두부", 2000, 2),
                new ProductOrder("김치", 5000, 1),
                new ProductOrder("콜라", 1500, 2)
        };

        int totalAmount = 0;

        for (ProductOrder order : orders) {
            order.printOrderInfo();
            totalAmount += order.getPrice() * order.getQuantity();
        }

        System.out.println("총 결제 금액: " + totalAmount);
    }
}