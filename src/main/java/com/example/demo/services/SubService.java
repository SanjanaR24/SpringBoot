package com.example.demo.services;

import com.example.demo.entity.LeadDetail;
import com.example.demo.entity.SubmissionDetail;
import com.example.demo.repository.ISubmissionsRepo;
import com.example.demo.repository.LeadDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SubService implements ISubService{
    @Autowired
    private ISubmissionsRepo repository;

    @Override
    public List<SubmissionDetail> getAllSubmissions() {
        return repository.findAll();
    }

    @Override
    public SubmissionDetail addSubmissionDetails(SubmissionDetail sd) {
        return repository.save(sd);
    }

    @Override
    public SubmissionDetail editSubmissionDetails(SubmissionDetail sd) {
        String SubmissionId = sd.getId();
        if (repository.existsById(SubmissionId)) {
            SubmissionDetail existingSubmission = repository.findById(SubmissionId).orElse(null);
            existingSubmission.setSubmissionStatus(sd.getSubmissionStatus());
            existingSubmission.setCity(sd.getCity());
            existingSubmission.setSubmissionDate(sd.getSubmissionDate());
            existingSubmission.setClientName(sd.getClientName());
            existingSubmission.setState(sd.getState());
            existingSubmission.setConsultantId(sd.getConsultantId());
            existingSubmission.setSubmissionType(sd.getSubmissionType());
            existingSubmission.setPayRate(sd.getPayRate());
            existingSubmission.setZipcode(sd.getZipcode());
            existingSubmission.setImplementationPartner(sd.getImplementationPartner());
            existingSubmission.setVendorCompany(sd.getVendorCompany());
            existingSubmission.setVendorEmailAddress(sd.getVendorEmailAddress());
            existingSubmission.setVendorPhoneNumber(sd.getVendorPhoneNumber());
            existingSubmission.setVendorName(sd.getVendorName());
            return repository.save(existingSubmission);
        } else {
            return null;
        }
    }

    @Override
    public SubmissionDetail deleteSubmissionDetails(String Id) {
        repository.deleteById(Id);
        return null;
    }
}
