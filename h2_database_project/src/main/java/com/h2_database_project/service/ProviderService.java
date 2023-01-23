package com.h2_database_project.service;

import com.h2_database_project.pojo.Provider;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProviderService {
    Provider findById(String s);

    List<Provider> findAll();

    Provider createProvider(Provider entity);
}
