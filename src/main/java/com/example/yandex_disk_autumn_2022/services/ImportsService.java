package com.example.yandex_disk_autumn_2022.services;

import com.example.yandex_disk_autumn_2022.model.FileSystemElement;
import com.example.yandex_disk_autumn_2022.repository.FileSystemElementsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImportsService {
    private final FileSystemElementsRepository repository;

    public ImportsService(FileSystemElementsRepository repository) {
        this.repository = repository;
    }

    public List<FileSystemElement> getAllElements() {
        return repository.getAllElements();
    }

    public void insertElement(FileSystemElement fileSystemElement) {
        repository.insertElement(
                fileSystemElement.getParent(),
                fileSystemElement.getParentId(),
                fileSystemElement.getElementUrl(),
                fileSystemElement.getUpdateDate()
        );
    }
}
