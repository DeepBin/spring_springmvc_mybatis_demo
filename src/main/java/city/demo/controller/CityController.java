
    /**  
    * @Title: CityControler.java
    * @Package city.demo.controler
    * @Description: TODO(用一句话描述该文件做什么)
    * @author wjk
    * @date 2018年5月13日
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
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author wjk
    * @date 2018年5月13日
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
