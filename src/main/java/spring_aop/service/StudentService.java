package spring_aop.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public int add(int i,int j){
        int s = i+j;
        return s;
    }

    public int div(int i,int j){
        int s = i/j;
        return s;
    }
}
