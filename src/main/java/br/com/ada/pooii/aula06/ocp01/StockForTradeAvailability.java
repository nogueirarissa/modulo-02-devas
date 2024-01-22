package br.com.ada.pooii.aula06.ocp01;

import java.util.Arrays;
import java.util.List;

public class StockForTradeAvailability implements Validator {

    List<String> stock = Arrays.asList("PETR3", "VALE3", "NTCO3","ADA");

    @Override
    public boolean isValid(Transaction transaction) {
            return stock.contains(transaction.getStock());
        }
    }
      /*  int i = 0;

        for (i = 0; i < stock.size(); i++) {
            if (!transaction.getStock().equals(stock.get(i))) {
                return false;
            }
            i++;
        }
        return true;
    }*/
//}