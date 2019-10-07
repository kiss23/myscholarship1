package com.jxufe.myscholarship.service.impl;

import com.jxufe.myscholarship.model.User;
import com.jxufe.myscholarship.service.UserService;

import java.util.Map;

public class UserServiceImpl implements UserService {


        @Override
        public Integer insertSelective(User user) {
            return null;
        }


        @Override
        public Map<String,Object> selectByPrimaryKey(Integer studentNumber) {
            return null;
        }

        @Override
        public Double Calculate(User user) {

        Integer studentnumber = user.getStudentnumber();
        Float courseweight = user.getCourseweight();
        Float paperscore = user.getPaperscore();
        Float researchsubject = user.getResearchsubject();
        Float technologicalinvention = user.getTechnologicalinvention();
        Float professionalskill = user.getProfessionalskill();
        Double scientificresearchscore = paperscore*0.2 + researchsubject*0.15 + technologicalinvention*0.15 + professionalskill;
        Float honoraward = user.getHonoraward();
        Float studentwork = user.getStudentwork();
        Float professionalskillscore = user.getProfessionalskillscore();
        Float comprehensivequality = honoraward + studentwork + professionalskillscore;
        Double finalgrades = courseweight*0.3 + scientificresearchscore*0.5 + comprehensivequality*0.2;

        return finalgrades;
    }

    @Override
    public Integer updateByPrimaryKeySelective(User user) {
        return null;
    }


}
