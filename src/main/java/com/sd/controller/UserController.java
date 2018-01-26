package com.sd.controller;

import com.sd.model.RegisterModel;
import com.sd.model.ReturnMessageModel;

import com.sd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4300"}, maxAge = 4800, allowCredentials = "false")

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

  //  @CrossOrigin(origins = "http://localhost:4300/")
    @RequestMapping("/test")
    public RegisterModel test(){

       // return "Spring Boot Running Test--!!";
        RegisterModel registerModel=new RegisterModel();
        registerModel.setfName("smita");
        registerModel.setlName("ss");
        registerModel.setEmail("e@s.com");
        registerModel.setAddress("Jaga");
        return registerModel;
    }

   // @CrossOrigin(origins = "http://localhost:4300/")
    @PostMapping("/registerUser")
    public ReturnMessageModel uploadFactData(@RequestBody RegisterModel registerModel){
        System.out.print("In registerUser..");
        System.out.println(registerModel);
        userService.saveRegistration(registerModel);
        ReturnMessageModel returnMessage=new ReturnMessageModel();
        returnMessage.setMessage("Registered successfully!! ");
        returnMessage.setStatus("success");
        return returnMessage;
    }

    @GetMapping("/Users")
    public List<RegisterModel> getuserList(){
        RegisterModel r1=new RegisterModel("JI","SE","e@s.com","ss");
        List<RegisterModel> list=new ArrayList<>();
        list.add(r1);
        return  list;
    }

    /*
    *

	@CrossOrigin(origins = "http://localhost:4200")
	//RequestMapping(value="/upload-fact",method=RequestMethod.POST)
	@GetMapping("/factresults")
	//{"num":5,"result:120"}
	public List<FactorialVO>  factResults(){
		List<FactorialVO> factorialVOs=new ArrayList<FactorialVO>(); // type inference
		FactorialVO factorialVO1=new FactorialVO(1,1);
		FactorialVO factorialVO2=new FactorialVO(2,2);
		FactorialVO factorialVO3=new FactorialVO(3,6);
		FactorialVO factorialVO4=new FactorialVO(4,24);
		FactorialVO factorialVO5=new FactorialVO(5,120);
		factorialVOs.add(factorialVO5);
		factorialVOs.add(factorialVO4);
		factorialVOs.add(factorialVO3);
		factorialVOs.add(factorialVO2);
		factorialVOs.add(factorialVO1);
		return factorialVOs;
	}

    * */
}
