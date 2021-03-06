package com.company.CommandPattern;

import com.company.CompositeTabPattern.Tab;

public class DisplayTabCommand implements Command {
    private Tab tab;

    public DisplayTabCommand(Tab tab){
        this.tab = tab;
    }

    @Override
    public void execute(){
        tab.displayTab();
    }
}
