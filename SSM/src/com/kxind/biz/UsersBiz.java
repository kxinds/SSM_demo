package com.kxind.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kxind.domain.Users;
import com.kxind.mapper.UsersMapper;

@Service("UsersBiz")
public class UsersBiz {
@Autowired@Qualifier("UsersMapper")
private UsersMapper  UsersMapper;



public UsersMapper getUsersMapper() {
	return UsersMapper;
}



public void setUsersMapper(UsersMapper usersMapper) {
	UsersMapper = usersMapper;
}



@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
 public List<Users> findAll(){
	 return this.UsersMapper.findAll();
 }

@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
public Users findById(int userid){
	 return this.UsersMapper.findById(userid);
}


@Transactional(propagation=Propagation.REQUIRED)
public void save(Users users){
	this.UsersMapper.save(users);
}
@Transactional(propagation=Propagation.REQUIRED)
public void delete(int id){
	this.UsersMapper.delete(id);
}
@Transactional(propagation=Propagation.REQUIRED)
public void update(Users users){
	this.UsersMapper.update(users);
}

}
