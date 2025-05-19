package ItemDetail.src;

// method class for bookdetail
class ItemsDetail {
    int itemCode;
    String items;
    int price;

    //create constructor for
    public ItemsDetail(int itemCode, String items, int price) {
        this.itemCode = itemCode;
        this.items = items;
        this.price = price;
    }

    //method to display result
    public void displaydetail() {
        System.out.println("Item code :" + itemCode + " for Item " + items + " at cost : " + price);
    }
}
