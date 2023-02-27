package com.medicine.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicine.oms.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, IUserCustomRepository{

	User getReferenceById(int searchedUserId);

	User save(int id);

	


}
