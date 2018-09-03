/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratordesignpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.*;

/**
 *
 * @author ng
 */
public class IteratorDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> nameList = new HashSet();
        
        nameList.add("David");
        nameList.add("Richard");
        nameList.add("Jason");
        
        //For Loop
        /**for (int i = 0; i < nameList.size(); i++){
            
            String name = nameList.getClass(i);
            System.out.println("name " + i + " " + name );    
        }**/
        
        //Foreach
        for(String name : nameList){
        
        System.out.println("Foreach name " + name );
        
        }
        
        //Iterator #1
        for (Iterator nameIterator = nameList.iterator(); nameIterator.hasNext();){
            
            System.out.println("Iterate1 name " + nameIterator.next());
            //nameIterator.remove();
            
        }
        System.out.println("Size: " + nameList.size() );        
        
        
        //Iterator #2
        Iterator<String> nameItr = nameList.iterator();
        
        while (nameItr.hasNext()) {
            
            String name = nameItr.next();
            System.out.println("Iterate2 name " + name);
                       
        }
    }
    
}
