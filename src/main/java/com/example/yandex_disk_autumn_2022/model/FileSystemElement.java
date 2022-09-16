package com.example.yandex_disk_autumn_2022.model;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class FileSystemElement {
    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    private Boolean parent;

    @Column(name = "parent_id")
    private UUID parentId;

    @NotNull
    @Column(name = "element_url")
    private String elementUrl;

    @NotNull
    @DateTimeFormat
    @Column(name = "update_date")
    private Date updateDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Boolean getParent() {
        return parent;
    }

    public void setParent(Boolean parent) {
        this.parent = parent;
    }

    public UUID getParentId() {
        return parentId;
    }

    public void setParentId(UUID parentId) {
        this.parentId = parentId;
    }

    public String getElementUrl() {
        return elementUrl;
    }

    public void setElementUrl(String elementUrl) {
        this.elementUrl = elementUrl;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
