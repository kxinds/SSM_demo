package com.kxind.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kxind.domain.Users;

@Repository("UsersMapper")
public interface UsersMapper {
	//通过id查找对象
	public Users findById(Integer userid);
    //查找全部对象
	public List<Users> findAll();
	//保存单个
	public void save(Users users);
	//批量插入
	public void saveAll(List<Users> userList);
	//批量查询
	public List<Users> findAllById(List<Integer> ids);
	//删除
	public void delete(int id);
    //更新
	public void update(Users users);
}
