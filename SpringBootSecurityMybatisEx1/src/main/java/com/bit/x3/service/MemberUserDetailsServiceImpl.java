package com.bit.x3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bit.x3.model.dao.MemberDao;
import com.bit.x3.model.vo.Member;

@Service
public class MemberUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        System.out.println("MemberUserDetailsServiceImpl  username:" + username);
        Member member = memberDao.findMember(username);
        System.out.println("loadUserByUsername member : " + member);
        User user = null;
        if (member != null) {
            user = new User(member.getUserId(), member.getUserPw(), null);
        }
        return user;
    }

}











