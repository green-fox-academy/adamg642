package exercisethree;

import java.util.HashMap;

public class Restaurant {
    private HashMap<String, Integer> invertory;

    public Restaurant(HashMap<String, Integer> invertory) {
        this.invertory = invertory;
    }

    public Orders recieveOrders(Orders orders) {
        boolean decider = true;
        for (String key : invertory.keySet()
        ) {
            int all = 0;
            for (int i = 0; i < orders.getDishes().length; i++) {

                all += orders.getDishes()[i].getIngredients(key);

            }

            if (invertory.get(key) - all > 0) {

            } else {
                decider = false;
            }

        }

        if (decider) {
            for (String key : invertory.keySet()
            ) {
                int all = 0;
                for (int i = 0; i < orders.getDishes().length; i++) {

                    all += orders.getDishes()[i].getIngredients(key);

                }

                if (invertory.get(key) - all > 0) {
                    invertory.put(key, invertory.get(key) - all);
                }
            }
            orders.deliver();
        }

        else {
            if (orders.getClass().equals("OnlineOrder")) {
                orders.delay();
            }

            else {
                orders.reject();
            }

        }

        return orders;
    }
}

