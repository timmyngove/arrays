/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author TimmyNgove
 */
public class Arrays {

    public static void main(String[] args) {
      int[] numbers={200,150,700,400};
      String[]items={"shirt","pants","sneakers","jackect"};
      int sum=0;
      int average=0;
      int maxPrice=numbers[0];//assuming that the maximum price is the first index
      int minPrice=numbers[0];
      int maxIndex=0;
      int minIndex=0;
      
      for(int i = 0;i< numbers.length; i++){
          sum= sum+ numbers[i];
          average=sum/numbers.length;
          if(numbers[i]>maxPrice){
              maxPrice= numbers[i];
              maxIndex=i;//position of the highest price
          }else if(numbers[i]<minPrice){
              minPrice=numbers[i];
              minIndex=i;
          }
              
      }
        System.out.println("sum: "+ sum);
        System.out.println("average:"+ average);
        System.out.println("maximum: "+ maxPrice);
        System.out.println("minimum: "+ minPrice);
        System.out.println("Highest price item: "+ items[maxIndex]);
        System.out.println("lowest price item: "+ items[minIndex]);
        
    }
}
