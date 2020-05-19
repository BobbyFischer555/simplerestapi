package com.company.simplerestapi.service;

import com.company.simplerestapi.domain.MainElement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainElementService {
    List<MainElement> getAll();
}
