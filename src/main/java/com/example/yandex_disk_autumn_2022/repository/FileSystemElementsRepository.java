package com.example.yandex_disk_autumn_2022.repository;

import com.example.yandex_disk_autumn_2022.model.FileSystemElement;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
@Transactional
public interface FileSystemElementsRepository extends CrudRepository<FileSystemElement, String> {
    @Query(value = "SELECT * FROM elements", nativeQuery = true)
    List<FileSystemElement> getAllElements();

    @Modifying
    @Query(value = "INSERT INTO elements (parent, parent_id, element_url, update_date) VALUES (?, ?, ?, ?)", nativeQuery = true)
    void insertElement(Boolean parent, UUID parentId, String elementUrl, Date updateDate);
}
