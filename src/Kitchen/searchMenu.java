package Kitchen;

import Waiter.*;

import java.util.*;

interface searchMenu extends foodMenu{
    public Queue<FoodItem> checkItem(Queue<FoodItem> OrderQueue);
  }

  // Sub-Interface