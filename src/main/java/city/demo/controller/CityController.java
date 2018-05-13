
    /**  
    * @Title: CityControler.java
    * @Package city.demo.controler
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author wjk
    * @date 2018��5��13��
    * @version V1.0  
    */
    
package city.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import city.demo.model.City;
import city.demo.service.CityService;

/**
    * @ClassName: CityControler
    * @Description: TODO(������һ�仰��������������)
    * @author wjk
    * @date 2018��5��13��
    *
    */
@Controller
@RequestMapping("/city")
public class CityController {
	@Resource 
	private CityService cityService;
	@RequestMapping("/list")
	public @ResponseBody List<City> getCityList(){
		return  cityService.getCityList();
	}

}
