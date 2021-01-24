package com.dentalportal.demo;

import com.dentalportal.demo.Entity.Usr;
import com.dentalportal.demo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTestContextBootstrapper;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@BootstrapWith(value= SpringBootTestContextBootstrapper.class)
@DataJpaTest
public class PersistanceTest {

@Autowired
private UserRepository userRepository;

    @Test
    public void loadData()
    {
        List<Usr> all = userRepository.findAll();
        System.out.println(all);
    }
}
