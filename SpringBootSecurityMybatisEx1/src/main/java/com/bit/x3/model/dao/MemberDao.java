package com.bit.x3.model.dao;

import com.bit.x3.model.vo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberDao {

    Member getMember(@Param("userId") String userId, @Param("userPw") String userPw);

//   	public interface MemberDaoMyBatis {
//		List<Member>  getAllMember();
//	
    @Select("select  userId, userPw, userName, email, age    from  member")
    List<Member> memberList();


    void insertMember(Member member);

}
