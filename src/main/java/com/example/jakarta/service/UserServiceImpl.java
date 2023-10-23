package com.example.jakarta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jakarta.entity.User;
import com.example.jakarta.repository.UserRepo;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo repo;

	public UserServiceImpl(UserRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		Optional<User> optional=repo.findById(userId);
		return optional.get();
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		repo.deleteById(userId);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		User existingUser=repo.findById(user.getId()).get();
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());
		User updateduser=repo.save(existingUser);
		return updateduser;
	}

	

}
