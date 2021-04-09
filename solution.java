/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
import java.util.*;
import java.util.stream.Collectors;
/**
 *
 * @author USER
 */
public class solution {
    public boolean solution(String str)
    {
        int len = str.length();
        if(len == 0 || len == 1) return true;
      List<String> distinctElements = Arrays.asList(str.split("")).stream()
                        .distinct()
                        .collect(Collectors.toList());
     return Arrays.asList(str.split("")).equals(distinctElements)?true:false;
        
    }
}
