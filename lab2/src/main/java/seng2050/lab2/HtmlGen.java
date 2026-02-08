package seng2050.lab2;

public class HtmlGen {

public static String doctype(){

return "<!DOCTYPE html >\n<html lang=\"en \" >";

}


public static String head(String title){

return "<head><title>" + title + "</head></title>";

}


public static String h1 (String heading){

return "<h1>" + heading + "</h1>";

}

public static String h2 (String heading){
    return "<h2>" + heading + "</h2>";
}

public static String h3 (String heading){
    return "<h3>" + heading + "</h3>";
}


}
    

