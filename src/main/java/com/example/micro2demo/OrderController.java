/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.micro2demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {
    RestTemplate resTemplate;

    public OrderController(RestTemplate rT) {
        this.resTemplate = rT;
    }
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id ){
        String url = "https://user-service.onrender.com/users/"+id;
        User u = resTemplate.getForObject(url, User.class);
        return new Order(id,u.getName());
    }
    static class User{
        private int id;
        private String name;

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
