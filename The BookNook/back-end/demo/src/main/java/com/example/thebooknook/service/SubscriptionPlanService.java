package com.example.thebooknook.service;

import org.springframework.stereotype.Service;

import com.example.thebooknook.model.SubscriptionPlan;
import com.example.thebooknook.repo.SubscriptionPlanRepository;

import java.util.List;

@Service
public class SubscriptionPlanService {
    private final SubscriptionPlanRepository subscriptionPlanRepository;

    public SubscriptionPlanService(SubscriptionPlanRepository subscriptionPlanRepository) {
        this.subscriptionPlanRepository = subscriptionPlanRepository;
    }

    public List<SubscriptionPlan> getAllSubscriptionPlans() {
        return subscriptionPlanRepository.findAll();
    }

    public SubscriptionPlan getSubscriptionPlanById(Long id) {
        return subscriptionPlanRepository.findById(id).orElse(null);
    }

	public SubscriptionPlan addSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
		// TODO Auto-generated method stub
		return null;
	}

    // Add more methods as needed for specific business logic related to SubscriptionPlan
}
