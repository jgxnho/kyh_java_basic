package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;


    public void addItem(Item item) {
        //검증 로직
        if (itemCount >= 10) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }

        //실행 로직
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i]; //ShoppingCart 변수를 Item 변수에 다시 담아 풀어냄
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
