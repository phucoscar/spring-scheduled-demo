package com.aml.service;

import com.aml.repository.SinhVienRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class SinhVienService {

    private static final Logger logger = LoggerFactory.getLogger(SinhVienService.class);

    @Autowired
    private SinhVienRepository sinhVienRepo;


}
