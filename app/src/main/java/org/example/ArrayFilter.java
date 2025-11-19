package org.example;

import java.util.ArrayList;

public class ArrayFilter{
  public static <T> ArrayList<T> removeDupes(ArrayList<T> inputList){
    ArrayList<T> Output = new ArrayList<>();

    for(int i = 0; i < inputList.size(); i++){
      if(!Output.contains(inputList.get(i))){
        Output.add(inputList.get(i));
      }
    }

    return Output;
  }
}