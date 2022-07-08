package com.onlinetutorialspoint.controller;

import com.onlinetutorialspoint.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemController itemService;

    public static List<Item> items;
    static{
        items = new ArrayList<>(Arrays.asList(new Item(1,"Spring Boot in Action","Books"),
                new Item(2,"Java 8 in Action","Books"),
                new Item(3,"Data Structures","Books"),
                new Item(4,"Spring Boot Security","Books")));
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping("/getAllItems")
    @ResponseBody
    public ResponseEntity<List<Item>> getAllItems() {
        //Reading all items (ADMIN only can access this)
        List<Item> items = this.items;
        System.out.println("Reading items: "+items);
        return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
    }

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello User!";
    }

}
