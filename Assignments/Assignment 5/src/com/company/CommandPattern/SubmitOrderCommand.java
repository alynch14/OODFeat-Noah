package com.company.CommandPattern;

import com.company.Orders.Orders;

public class SubmitOrderCommand implements Command {
    private Orders orders;

    public SubmitOrderCommand(Orders orders){
        this.orders = orders;
    }

    @Override
    public void execute(){
        orders.submitOrder();
    }
}
