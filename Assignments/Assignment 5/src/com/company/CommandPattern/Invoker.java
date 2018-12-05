package com.company.CommandPattern;

public class Invoker {
    private Command invokeMe;

    public void setCommand(Command command){
        invokeMe = command;
    }

    public void invokeCommand(){
        invokeMe.execute();
    }
}
