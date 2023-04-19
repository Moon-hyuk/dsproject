package com.ds.moon.dsproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ds.moon.dsproject.entity.UserHb;
import com.ds.moon.dsproject.repository.UserHbRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class UserHbService {

    private final UserHbRepository userHbRepository;

    public List<UserHb> getList() {

        return userHbRepository.findAll();
    }

    public void saveUserHb(UserHb userHb) {
        userHbRepository.save(userHb);
    }

    public List<UserHb> selectUserIdByHb(String userId) {
        System.out.println("써비스"+userId);
        System.out.println("??"+ userHbRepository.findAllByUserUserId(userId));
        return userHbRepository.findAllByUserUserId(userId);
    }

}
