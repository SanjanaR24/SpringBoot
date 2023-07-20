package com.example.demo.services;

import com.example.demo.entity.ConsultantDetail;
import com.example.demo.entity.SubmissionDetail;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ISubService {

    List<SubmissionDetail> getAllSubmissions();

    SubmissionDetail addSubmissionDetails(SubmissionDetail sd);

    SubmissionDetail editSubmissionDetails(@RequestBody SubmissionDetail sd);


    SubmissionDetail deleteSubmissionDetails(String Id);
}
