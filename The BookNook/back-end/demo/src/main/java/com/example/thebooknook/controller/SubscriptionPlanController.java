package com.example.thebooknook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.thebooknook.model.SubscriptionPlan;
import com.example.thebooknook.model.User;
import com.example.thebooknook.service.SubscriptionPlanService;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000")

@CrossOrigin
@RestController
@RequestMapping("/api/subscription-plans")
public class SubscriptionPlanController {

    private final SubscriptionPlanService subscriptionPlanService;

    public SubscriptionPlanController(SubscriptionPlanService subscriptionPlanService) {
        this.subscriptionPlanService = subscriptionPlanService;
    }

    @GetMapping
    public ResponseEntity<List<SubscriptionPlan>> getAllSubscriptionPlans() {
        List<SubscriptionPlan> subscriptionPlans = subscriptionPlanService.getAllSubscriptionPlans();
        return new ResponseEntity<>(subscriptionPlans, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionPlan> getSubscriptionPlanById(@PathVariable Long id) {
        SubscriptionPlan subscriptionPlan = subscriptionPlanService.getSubscriptionPlanById(id);
        if (subscriptionPlan != null) {
            return new ResponseEntity<>(subscriptionPlan, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
 
    }

    @PostMapping
    public ResponseEntity<SubscriptionPlan> addSubscriptionPlan(@RequestBody SubscriptionPlan subscriptionPlan) {
        SubscriptionPlan createdSubscriptionPlan = subscriptionPlanService.addSubscriptionPlan(subscriptionPlan);
        return new ResponseEntity<>(createdSubscriptionPlan, HttpStatus.CREATED);
    }

    // Add more methods as needed for specific CRUD operations related to SubscriptionPlan
}
