package com.company.CommandPattern;

import com.company.Menus.Menu;

public class DisplayMenuCommand implements Command {
    private Menu menu;

    public DisplayMenuCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute(){
        menu.displayMenu();
    }
}
