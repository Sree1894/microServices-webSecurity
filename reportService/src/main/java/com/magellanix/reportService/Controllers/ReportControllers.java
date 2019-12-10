package com.magellanix.reportService.Controllers;

import com.websecurity.models.ApiResponse;
import com.websecurity.models.Report;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1")
public class ReportControllers {

    @PostMapping("/report")
    public ApiResponse createReport(Report report){



        return null;
    }
}
