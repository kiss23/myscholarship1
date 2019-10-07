package com.jxufe.myscholarship.controller;

import com.jxufe.myscholarship.model.User;
import com.jxufe.myscholarship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Map<String, Object> login(@RequestParam String username, @RequestParam @Valid Integer studentnumber, @RequestParam String major, @RequestParam @Valid String userPassword) {
        Map<String, Object> modelMap = new HashMap<>();
            User user = new User();
            modelMap = userService.selectByPrimaryKey(studentnumber);
            String password =  modelMap.get("password").toString();
            if(password == userPassword){
                modelMap.put("success",true);
            }else {
                modelMap.put("false","密码错误");
            }

        return modelMap;
    }
    @PostMapping("/update")
    public Map<String,Object> update(@RequestBody User user){
        Map<String, Object> modelMap = new HashMap<>();

        int result = userService.updateByPrimaryKeySelective(user);
        if(result>0){
            modelMap.put("success",true);
        }else {
            modelMap.put("false","更新失败");
        }
        return modelMap;

    }
    @PostMapping("/calulate")
    public Object totalSocre(@RequestBody Map<String,Object> usermap) {
        Float courseweight = (Float) usermap.get("courseweight");
        Float paperscore = (Float) usermap.get("paperscore");
        Float researchsubject = (Float) usermap.get("researchsubject");
        Float technologicalinvention = (Float) usermap.get("technologicalinvention");
        Float professionalskill = (Float) usermap.get("professionalskill");
        Float scientificresearchscore = (Float) usermap.get("scientificresearchscore");
        Float subjectnature = (Float) usermap.get("subjectnature");
        Float honoraward = (Float) usermap.get("honoraward");
        Float studentwork = (Float) usermap.get("studentwork");
        Float professionalskillscore = (Float) usermap.get("professionalskillscore");
        Float comprehensivequality = (Float) usermap.get("comprehensivequality");
        Integer sixgrades = (Integer) usermap.get("sixgrades");
        Float finalgrades = (Float) usermap.get("finalgrades");
        String content = usermap.get("content").toString();

        User user = new User();
        user.setCourseweight(courseweight);
        user.setPaperscore(paperscore);
        user.setResearchsubject(researchsubject);
        user.setTechnologicalinvention(technologicalinvention);
        user.setProfessionalskill(professionalskill);
        user.setScientificresearchscore(scientificresearchscore);
        user.setSubjectnature(subjectnature);
        user.setHonoraward(honoraward);
        user.setStudentwork(studentwork);
        user.setProfessionalskillscore(professionalskillscore);
        user.setComprehensivequality(comprehensivequality);
        user.setSixgrades(sixgrades);
        user.setFinalgrades(finalgrades);
        user.setContent(content);

        Double finalscore = userService.Calculate(user);
        int result = userService.insertSelective(user);
        if (result>0){
            return finalscore;
        }else {
            return false;
        }

    }

}
