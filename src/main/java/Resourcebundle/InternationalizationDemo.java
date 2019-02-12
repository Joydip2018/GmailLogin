package Resourcebundle;
import java.util.Locale;  
import java.util.ResourceBundle;  

public class InternationalizationDemo 
{  
 public static void main(String[] args) 
 {  
  
  ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle_en_US");  
  System.out.println(bundle.getString("greeting"));  
  
 }  
}  