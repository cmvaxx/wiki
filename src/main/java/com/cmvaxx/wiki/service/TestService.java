package com.cmvaxx.wiki.service;

import com.cmvaxx.wiki.domain.Test;
import com.cmvaxx.wiki.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Autowired(required = false)
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}
