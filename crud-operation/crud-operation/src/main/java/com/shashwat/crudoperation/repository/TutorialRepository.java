package com.shashwat.crudoperation.repository;

import com.shashwat.crudoperation.model.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
//    GET Method to find tutorial with field published as true
    List<Tutorial> findByPublished(boolean published);
//    GET Method to find tutorial with title
    List<Tutorial> findByTitleContaining(String title);
}
