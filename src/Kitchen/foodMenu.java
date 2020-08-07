package Kitchen;

import java.util.*;

interface foodMenu{

    public static final Map<String,Integer> foodMenu = Collections.unmodifiableMap(new HashMap<String,Integer>(){
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        {
            put("tomato soup", 75);
            put("mushroom soup", 75);
            put("veg clear soup", 75);
            put("paneer tikka", 150);
            put("gobi manchurian", 150);
            put("babycorn fry", 150);
            put("momos", 60);
            put("spring roll", 80);
            put("roti", 10);
            put("naan", 15);
            put("kulcha", 25);
            put("phulka", 10);
            put("kadai paneer", 130);
            put("mushroom masala", 130);
            put("mixed veg curry", 130);
            put("aloo gobi masala", 130);
            put("cashew curry", 130);
            put("biryani", 100);
            put("fried rice", 120);
            put("pulav", 90);
            put("brownie", 110);
            put("falooda", 125);
            put("mango milkshake", 70);
            put("pastries", 45);
            put("pizza", 200);
            put("burger", 95);
            put("wraps", 75);
        }

    });    


    

}