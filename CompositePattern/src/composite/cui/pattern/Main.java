package composite.cui.pattern;

import composite.cui.pattern.composite.BoxComposite;
import composite.cui.pattern.leaf.ProductLeaf;

public class Main {
    public static void main(String[] args) {
        ProductLeaf leaf1 = new ProductLeaf(30);
        ProductLeaf leaf2 = new ProductLeaf(20);
        ProductLeaf leaf3 = new ProductLeaf(10);
        ProductLeaf leaf4 = new ProductLeaf(4);
        ProductLeaf leaf5 = new ProductLeaf(90);

        BoxComposite box1 = new BoxComposite();
        box1.add(leaf1);
        box1.add(leaf2);

        BoxComposite box2 = new BoxComposite();
        box2.add(leaf3);
        box2.add(leaf4);
        box2.add(leaf5);

        System.out.println(box1.getPrice());
        System.out.println(box2.getPrice());

    }
}