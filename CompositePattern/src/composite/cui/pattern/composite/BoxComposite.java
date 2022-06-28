package composite.cui.pattern.composite;

import composite.cui.pattern.component.OrderComponent;

import java.util.ArrayList;
import java.util.List;

public class BoxComposite implements OrderComponent {
    private final List<OrderComponent> subComponents = new ArrayList<>();

    public void add(OrderComponent component) {
        subComponents.add(component);
    }

    public void remove(OrderComponent component) {
        subComponents.remove(component);
    }

    @Override
    public int getPrice() {
        int boxPrice = 0;
        for (OrderComponent component : subComponents)
            boxPrice += component.getPrice();
        return boxPrice;
    }


}
