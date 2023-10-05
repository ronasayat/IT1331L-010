package com.it1311l.uap.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

@GetMapping("/sayHello")
public String sayHello(){
	return "Hello World";
}
	
	@GetMapping("/sort")
    public int[] sortInteger() {
        int[] array = {3, 10, 8, 9, 2, 2, 8, 10, 2, 3};

        
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] < array[i + 1]) {
                  
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return array;
	}
}
