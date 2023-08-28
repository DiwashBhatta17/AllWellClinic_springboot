package com.example.clinic_model.service;

import com.example.clinic_model.dto.ReportDTO;

import java.util.List;

public interface ReportService {
    ReportDTO createReport(Long patientId);
    List<ReportDTO> getAllReports();
    ReportDTO getReportById(Long reportId);
}
