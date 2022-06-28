package composite.cui.pattern.leaf;

import composite.cui.pattern.component.OrderComponent;

public class ProductLeaf implements OrderComponent {
    private int price;

    public ProductLeaf(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
