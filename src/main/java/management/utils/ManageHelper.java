package management.utils;

import java.util.*;
import management.elements.Book;


public class ManageHelper {
    
    public static String toStringJoiner(List<String> list, String join){
        StringJoiner strjoiner = new StringJoiner(join);
        for(String str : list){
            strjoiner.add(str);
        }
        return strjoiner.toString();
    }
}
