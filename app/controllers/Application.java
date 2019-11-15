package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        Canso c = new Canso("qwkdm", 2019, "qenceiuqlnicjnq");
        //c.AddCantantNomPais("qjdn", "iqwehbd");
        c.save();

        render();
    }
    public static void SubmitCantant(String n, String p) {
        render(n,p);
    }
    public static void SuccessCantant(String n, String p) {
        Canso c = new Canso("qwkdm", 2019, "qenceiuqlnicjnq");
        c.AddCantantNomPais(n, p);
        c.save();
        render(n,p);
    }
    public static void SuccessCanso(String ca, Integer num) {
        render(ca,num);
    }
    public static void SubmitCanso(String n, String p) {
        render(n,p);
    }
    public static void BasicTest() {
        render();
    }
    public static void modify() {
        render();
    }

}