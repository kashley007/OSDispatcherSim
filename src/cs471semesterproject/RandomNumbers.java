/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs471semesterproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kevinashley
 */
public class RandomNumbers {
    
    ArrayList<Integer> list;
    
    public RandomNumbers(int number){
        list = new ArrayList<Integer>();
        for (int i = 1; i < number; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
    }
}
