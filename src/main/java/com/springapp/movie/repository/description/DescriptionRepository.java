package com.springapp.movie.repository.description;

import com.springapp.movie.models.characteristics.Characteristics;
import com.springapp.movie.models.description.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescriptionRepository extends JpaRepository<Description,Long> {
}
