package com.mts.finances.repositories;

import com.mts.finances.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {


}
