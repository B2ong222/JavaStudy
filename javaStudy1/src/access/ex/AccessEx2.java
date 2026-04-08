package access.ex;

public class AccessEx2 {
    static void main() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("마늘", 2000, 2));
        cart.addItem(new Item("상추", 3000, 4));
        cart.addItem(new Item("고추", 1500, 3));
        cart.addItem(new Item("양파", 1200, 5));
        cart.addItem(new Item("대파", 1800, 2));
        cart.addItem(new Item("당근", 1000, 6));
        cart.addItem(new Item("감자", 2300, 8));
        cart.addItem(new Item("오이", 900, 4));
        cart.addItem(new Item("호박", 1700, 3));
        cart.addItem(new Item("배추", 4000, 1));
        cart.addItem(new Item("브로콜리", 2500, 2));

        cart.displayItems();
    }
}

class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니 가득 참");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++){
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }
}

class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}