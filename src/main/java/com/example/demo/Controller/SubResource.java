package com.example.demo.Controller;
import com.example.demo.entity.SubmissionDetail;
import com.example.demo.services.ISubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/submissions")
public class  SubResource {

    @Autowired
    private ISubService service;

    @GetMapping("/getAll")
    public List<SubmissionDetail> getAllSubmissions(){
        return service.getAllSubmissions();
    }
    @PostMapping("/addSubmission")
    public SubmissionDetail addSubmissionDetails(@RequestBody SubmissionDetail sd) {
        return service.addSubmissionDetails(sd);
    }
    @PutMapping("/update")
    public SubmissionDetail editSubmissionDetails(@RequestBody SubmissionDetail ld){
        return service.editSubmissionDetails(ld);
    }
    @DeleteMapping("/delete/{Id}")
    public SubmissionDetail deleteSubmissionDetails(@PathVariable String Id) {
        return service.deleteSubmissionDetails(Id);
    }
}