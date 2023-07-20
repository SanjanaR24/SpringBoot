package com.example.demo.services;

import com.example.demo.entity.LeadDetail;
import com.example.demo.repository.LeadDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeadDetailsService implements ILeadDetailService{

    @Autowired
    private LeadDetailsRepository repository;
    @Override
    public List<LeadDetail> getAllLeads() {
        return repository.findAll();
    }


    @Override
    public LeadDetail addLeadDetails(LeadDetail ld){
        return repository.save(ld);
    }
    @Override
    public LeadDetail editLeadDetails(LeadDetail ld) {
        Long leadId = ld.getId();
        Optional<LeadDetail> existingLeadOptional = repository.findById(leadId);
        if (existingLeadOptional.isPresent()) {
            LeadDetail existingLead = existingLeadOptional.get();

            existingLead.setFirstName(ld.getFirstName());
            existingLead.setLastName(ld.getLastName());
            existingLead.setEmailAddress(ld.getEmailAddress());
            existingLead.setPhoneNumber(ld.getPhoneNumber());
            return repository.save(existingLead);
        } else {
            return null;
        }
    }

    @Override
    public LeadDetail deleteLeadDetails(long Id) {
        repository.deleteById(Id);
        return null;
    }

}
