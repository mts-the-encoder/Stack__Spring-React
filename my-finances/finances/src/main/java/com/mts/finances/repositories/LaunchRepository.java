package com.mts.finances.repositories;

import com.mts.finances.models.LaunchModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaunchRepository extends JpaRepository<LaunchModel, Long> {

}
