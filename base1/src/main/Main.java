package main;
import View.View;
import Controller.Controller;
import model.Model;
public class Main 
{
    private static View View;
    private static Model Model;
    private static Controller Controller;
    
    public static void main(String[] args) 
    {
        View = new View();
        Model = new Model();
        Controller= new Controller(Model, View);
    }   
} 

