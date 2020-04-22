package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)

//Receiver
public class PizzaOrder{
  private boolean orderReady;
  public Pizza.Builder pb;
  public Pizza p;

  public void bakeDeepDish(){
	System.out.format("Baking a deepdish... \n");
    pb = new Pizza.Builder("Deep Dish");
    p = pb.pizzas(1).build();
    reportOrder();

  }
  public void bakeThinCrust(){
  	System.out.format("Baking a thincrust... \n");
  	pb = new Pizza.Builder("Thin Crust");
    p = pb.pizzas(1).build();
    reportOrder();
  }

    public void bakeMasonPizza(){
        System.out.format("Baking a Mason pizza... \n");
        pb = new Pizza.Builder("Mason");
        p = pb.pizzas(1).build();
        reportOrder();
    }

    public void bakeAnthonyPizza(){
        System.out.format("Baking a Anthony pizza... \n");
        pb = new Pizza.Builder("Anthony");
        p = pb.pizzas(1).build();
        reportOrder();
    }

    public void bakeCraigPizza(){
        System.out.format("Baking a Craig pizza... \n");
        pb = new Pizza.Builder("Craig");
        p = pb.pizzas(1).build();
        reportOrder();
    }

    public void bakeSeanPizza(){
        System.out.format("Baking a Sean pizza... \n");
        pb = new Pizza.Builder("Sean");
        p = pb.pizzas(1).build();
        reportOrder();
    }



  private void reportOrder() {
      System.out.format("\nBuilt %s - num pies: %d, pepperoni: %b, onion: %b, frenchfries %b\n",
    	p.getName(),
      p.getNumber(),
      p.toppings.pepperoni,
      p.toppings.onion,
      p.toppings.frenchfries );
  }
}
